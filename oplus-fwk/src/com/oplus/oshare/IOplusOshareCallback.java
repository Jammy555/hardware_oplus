package com.oplus.oshare;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IOplusOshareCallback extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.oshare.IOplusOshareCallback";

    void onDeviceChanged(List<OplusOshareDevice> list) throws RemoteException;

    void onSendSwitchChanged(boolean z) throws RemoteException;

    public static class Default implements IOplusOshareCallback {
        @Override // com.oplus.oshare.IOplusOshareCallback
        public void onDeviceChanged(List<OplusOshareDevice> deviceList) throws RemoteException {
        }

        @Override // com.oplus.oshare.IOplusOshareCallback
        public void onSendSwitchChanged(boolean isOn) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IOplusOshareCallback {
        static final int TRANSACTION_onDeviceChanged = 1;
        static final int TRANSACTION_onSendSwitchChanged = 2;

        public Stub() {
            attachInterface(this, IOplusOshareCallback.DESCRIPTOR);
        }

        public static IOplusOshareCallback asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(IOplusOshareCallback.DESCRIPTOR);
            if (iin != null && (iin instanceof IOplusOshareCallback)) {
                return (IOplusOshareCallback) iin;
            }
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static String getDefaultTransactionName(int transactionCode) {
            switch (transactionCode) {
                case 1:
                    return "onDeviceChanged";
                case 2:
                    return "onSendSwitchChanged";
                default:
                    return null;
            }
        }

        public String getTransactionName(int transactionCode) {
            return getDefaultTransactionName(transactionCode);
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(IOplusOshareCallback.DESCRIPTOR);
            }
            switch (code) {
                case 1:
                    List<OplusOshareDevice> _arg0 = data.createTypedArrayList(OplusOshareDevice.CREATOR);
                    data.enforceNoDataAvail();
                    onDeviceChanged(_arg0);
                    reply.writeNoException();
                    return true;
                case 2:
                    boolean _arg1 = data.readBoolean();
                    data.enforceNoDataAvail();
                    onSendSwitchChanged(_arg1);
                    reply.writeNoException();
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        private static final class Proxy implements IOplusOshareCallback {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public final String getInterfaceDescriptor() {
                return IOplusOshareCallback.DESCRIPTOR;
            }

            @Override // com.oplus.oshare.IOplusOshareCallback
            public void onDeviceChanged(List<OplusOshareDevice> deviceList) throws RemoteException {
                Parcel _data = Parcel.obtain(asBinder());
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IOplusOshareCallback.DESCRIPTOR);
                    _data.writeTypedList(deviceList, 0);
                    this.mRemote.transact(1, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.oplus.oshare.IOplusOshareCallback
            public void onSendSwitchChanged(boolean isOn) throws RemoteException {
                Parcel _data = Parcel.obtain(asBinder());
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IOplusOshareCallback.DESCRIPTOR);
                    _data.writeBoolean(isOn);
                    this.mRemote.transact(2, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }
    }
}
