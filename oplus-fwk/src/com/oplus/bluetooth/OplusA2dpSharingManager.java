/*
 * Copyright (C) 2026 LunarisOS
 * Clean-Room Replication of OPlus A2DP Sharing Manager
 */

package com.oplus.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.AttributionSource;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class OplusA2dpSharingManager {
    private static final String TAG = "OplusA2dpSharingManager";

    public static final String ACTION_A2DP_SHARING_SERVICE =
            "com.oplus.bluetooth.action.A2DP_SHARING_SERVICE";
    public static final String BLUETOOTH_PACKAGE_NAME = "com.android.bluetooth";

    public static final int SHARING_ROLE_NONE = 0;
    public static final int SHARING_ROLE_PRIMARY = 1;
    public static final int SHARING_ROLE_SECONDARY = 2;

    public static final int SHARING_TYPE_UNKNOWN = 0;
    public static final int SHARING_TYPE_BONDED = 1;
    public static final int SHARING_TYPE_TEMPORARY = 2;

    private static volatile OplusA2dpSharingManager sInstance;
    private static volatile Context sApplicationContext;

    private final AttributionSource mAttributionSource;
    private final Handler mHandler;
    private final Map<StateCallback, StateCallbackWrapper> mStateCallbacks = new ConcurrentHashMap<>();
    private final Map<VolumeCallback, VolumeCallbackWrapper> mVolumeCallbacks = new ConcurrentHashMap<>();

    private volatile IOplusA2dpSharing mService;
    private boolean mBinding = false;

    private final ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.i(TAG, "Connected to OplusA2dpSharingService in " + name);
            synchronized (OplusA2dpSharingManager.this) {
                mService = IOplusA2dpSharing.Stub.asInterface(service);
                mBinding = false;
                OplusA2dpSharingManager.this.notifyAll();
            }
            registerPendingCallbacks();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.w(TAG, "Disconnected from OplusA2dpSharingService");
            synchronized (OplusA2dpSharingManager.this) {
                mService = null;
                mBinding = false;
                OplusA2dpSharingManager.this.notifyAll();
            }
        }
    };

    public interface StateCallback {
        void onSharingStarted(int role, int type, int reason, BluetoothDevice primary, BluetoothDevice secondary);
        void onSharingStopped(int role, int type, int reason, BluetoothDevice primary, BluetoothDevice secondary);
    }

    public interface VolumeCallback {
        void onDeviceVolumeChanged(BluetoothDevice device, int volume);
    }

    public static void init(Context context) {
        if (context != null && sApplicationContext == null) {
            sApplicationContext = context.getApplicationContext();
        }
    }

    private OplusA2dpSharingManager() {
        mAttributionSource = AttributionSource.myAttributionSource();
        mHandler = new Handler(Looper.getMainLooper());
        ensureBound();
    }

    public static OplusA2dpSharingManager getInstance() {
        if (sInstance == null) {
            synchronized (OplusA2dpSharingManager.class) {
                if (sInstance == null) {
                    sInstance = new OplusA2dpSharingManager();
                }
            }
        }
        return sInstance;
    }

    public static OplusA2dpSharingManager getOplusA2dpSharingManager() {
        return getInstance();
    }

    private Context getContext() {
        if (sApplicationContext != null) {
            return sApplicationContext;
        }
        try {
            Class<?> activityThread = Class.forName("android.app.ActivityThread");
            Method currentApplication = activityThread.getMethod("currentApplication");
            Object app = currentApplication.invoke(null);
            if (app instanceof Context) {
                sApplicationContext = ((Context) app).getApplicationContext();
                return sApplicationContext;
            }
        } catch (Exception e) {
            Log.w(TAG, "Failed to resolve Application context via ActivityThread", e);
        }
        return null;
    }

    private synchronized void ensureBound() {
        if (mService != null && mService.asBinder().isBinderAlive()) {
            return;
        }
        if (mBinding) {
            return;
        }
        Context ctx = getContext();
        if (ctx == null) {
            Log.w(TAG, "Cannot bind to OplusA2dpSharingService: context is null");
            return;
        }
        Intent intent = new Intent(ACTION_A2DP_SHARING_SERVICE);
        intent.setPackage(BLUETOOTH_PACKAGE_NAME);
        try {
            mBinding = ctx.bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
            Log.i(TAG, "bindService to " + BLUETOOTH_PACKAGE_NAME + " returned " + mBinding);
        } catch (Exception e) {
            Log.e(TAG, "Failed to bind to OplusA2dpSharingService", e);
            mBinding = false;
        }
    }

    private IOplusA2dpSharing getService() {
        synchronized (this) {
            if (mService != null && mService.asBinder().isBinderAlive()) {
                return mService;
            }
            ensureBound();
            if (mService == null && mBinding) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    try {
                        this.wait(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            return mService;
        }
    }

    private void registerPendingCallbacks() {
        IOplusA2dpSharing service = mService;
        if (service == null) return;

        for (StateCallbackWrapper wrapper : mStateCallbacks.values()) {
            try {
                service.registerStateCallback(wrapper, mAttributionSource);
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to re-register state callback", e);
            }
        }

        for (VolumeCallbackWrapper wrapper : mVolumeCallbacks.values()) {
            try {
                service.registerVolumeCallback(wrapper, mAttributionSource);
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to re-register volume callback", e);
            }
        }
    }

    public boolean isA2dpSharingEnabled() {
        try {
            IOplusA2dpSharing service = getService();
            return service != null && service.isA2dpSharingEnabled(mAttributionSource);
        } catch (RemoteException e) {
            Log.e(TAG, "isA2dpSharingEnabled failed", e);
            return false;
        }
    }

    public boolean setA2dpSharingEnabled(boolean enabled) {
        try {
            IOplusA2dpSharing service = getService();
            return service != null && service.setA2dpSharingEnabled(enabled, mAttributionSource);
        } catch (RemoteException e) {
            Log.e(TAG, "setA2dpSharingEnabled failed", e);
            return false;
        }
    }

    public boolean isA2dpSharingAvailable() {
        try {
            IOplusA2dpSharing service = getService();
            return service != null && service.isA2dpSharingAvailable(mAttributionSource);
        } catch (RemoteException e) {
            Log.e(TAG, "isA2dpSharingAvailable failed", e);
            return false;
        }
    }

    public boolean inSharingMode() {
        try {
            IOplusA2dpSharing service = getService();
            return service != null && service.inSharingMode(mAttributionSource);
        } catch (RemoteException e) {
            Log.e(TAG, "inSharingMode failed", e);
            return false;
        }
    }

    public List<BluetoothDevice> getSharingDevices() {
        try {
            IOplusA2dpSharing service = getService();
            if (service != null) {
                return service.getSharingDevices(mAttributionSource);
            }
        } catch (RemoteException e) {
            Log.e(TAG, "getSharingDevices failed", e);
        }
        return Collections.emptyList();
    }

    public boolean startSharing(BluetoothDevice device, int type) {
        try {
            IOplusA2dpSharing service = getService();
            return service != null && service.startSharing(device, type, mAttributionSource);
        } catch (RemoteException e) {
            Log.e(TAG, "startSharing failed", e);
            return false;
        }
    }

    public boolean stopSharing() {
        try {
            IOplusA2dpSharing service = getService();
            return service != null && service.stopSharing(mAttributionSource);
        } catch (RemoteException e) {
            Log.e(TAG, "stopSharing failed", e);
            return false;
        }
    }

    public boolean setSharingDeviceAbsoluteVolume(BluetoothDevice device, int volume) {
        try {
            IOplusA2dpSharing service = getService();
            return service != null && service.setSharingDeviceAbsoluteVolume(device, volume, mAttributionSource);
        } catch (RemoteException e) {
            Log.e(TAG, "setSharingDeviceAbsoluteVolume failed", e);
            return false;
        }
    }

    public boolean registerStateCallback(Executor executor, StateCallback callback) {
        if (callback == null) return false;
        Executor exec = (executor != null) ? executor : mHandler::post;
        StateCallbackWrapper wrapper = new StateCallbackWrapper(callback, exec);
        mStateCallbacks.put(callback, wrapper);

        IOplusA2dpSharing service = getService();
        if (service != null) {
            try {
                return service.registerStateCallback(wrapper, mAttributionSource);
            } catch (RemoteException e) {
                Log.e(TAG, "registerStateCallback failed", e);
            }
        }
        return true;
    }

    public boolean unregisterStateCallback(StateCallback callback) {
        if (callback == null) return false;
        StateCallbackWrapper wrapper = mStateCallbacks.remove(callback);
        if (wrapper == null) return false;

        IOplusA2dpSharing service = getService();
        if (service != null) {
            try {
                return service.unregisterStateCallback(wrapper, mAttributionSource);
            } catch (RemoteException e) {
                Log.e(TAG, "unregisterStateCallback failed", e);
            }
        }
        return true;
    }

    public boolean registerVolumeCallback(Executor executor, VolumeCallback callback) {
        if (callback == null) return false;
        Executor exec = (executor != null) ? executor : mHandler::post;
        VolumeCallbackWrapper wrapper = new VolumeCallbackWrapper(callback, exec);
        mVolumeCallbacks.put(callback, wrapper);

        IOplusA2dpSharing service = getService();
        if (service != null) {
            try {
                return service.registerVolumeCallback(wrapper, mAttributionSource);
            } catch (RemoteException e) {
                Log.e(TAG, "registerVolumeCallback failed", e);
            }
        }
        return true;
    }

    public boolean unregisterVolumeCallback(VolumeCallback callback) {
        if (callback == null) return false;
        VolumeCallbackWrapper wrapper = mVolumeCallbacks.remove(callback);
        if (wrapper == null) return false;

        IOplusA2dpSharing service = getService();
        if (service != null) {
            try {
                return service.unregisterVolumeCallback(wrapper, mAttributionSource);
            } catch (RemoteException e) {
                Log.e(TAG, "unregisterVolumeCallback failed", e);
            }
        }
        return true;
    }

    private static class StateCallbackWrapper extends IOplusA2dpSharingStateCallback.Stub {
        private final StateCallback mCallback;
        private final Executor mExecutor;

        StateCallbackWrapper(StateCallback callback, Executor executor) {
            mCallback = callback;
            mExecutor = executor;
        }

        @Override
        public void onSharingStarted(int role, int type, int reason, BluetoothDevice primary, BluetoothDevice secondary) {
            mExecutor.execute(() -> mCallback.onSharingStarted(role, type, reason, primary, secondary));
        }

        @Override
        public void onSharingStopped(int role, int type, int reason, BluetoothDevice primary, BluetoothDevice secondary) {
            mExecutor.execute(() -> mCallback.onSharingStopped(role, type, reason, primary, secondary));
        }
    }

    private static class VolumeCallbackWrapper extends IOplusA2dpSharingVolumeCallback.Stub {
        private final VolumeCallback mCallback;
        private final Executor mExecutor;

        VolumeCallbackWrapper(VolumeCallback callback, Executor executor) {
            mCallback = callback;
            mExecutor = executor;
        }

        @Override
        public void onDeviceVolumeChanged(BluetoothDevice device, int volume) {
            mExecutor.execute(() -> mCallback.onDeviceVolumeChanged(device, volume));
        }
    }
}
