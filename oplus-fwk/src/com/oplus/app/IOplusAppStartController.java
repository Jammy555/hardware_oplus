package com.oplus.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface IOplusAppStartController extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.app.IOplusAppStartController";

    void appStartMonitor(String str, String str2, String str3, String str4, String str5) throws RemoteException;

    void notifyPreventIndulge(String str) throws RemoteException;

    void preventStartMonitor(String str, String str2, String str3, String str4, String str5) throws RemoteException;

    public static class Default implements IOplusAppStartController {
        @Override // com.oplus.app.IOplusAppStartController
        public void appStartMonitor(String pkgName, String exceptionClass, String exceptionMsg, String exceptionTrace, String monitorType) throws RemoteException {
        }

        @Override // com.oplus.app.IOplusAppStartController
        public void preventStartMonitor(String callerPkg, String calledPkg, String startMode, String preventMode, String reason) throws RemoteException {
        }

        @Override // com.oplus.app.IOplusAppStartController
        public void notifyPreventIndulge(String pkgName) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IOplusAppStartController {
        static final int TRANSACTION_appStartMonitor = 1;
        static final int TRANSACTION_notifyPreventIndulge = 3;
        static final int TRANSACTION_preventStartMonitor = 2;

        public Stub() {
            attachInterface(this, IOplusAppStartController.DESCRIPTOR);
        }

        public static IOplusAppStartController asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(IOplusAppStartController.DESCRIPTOR);
            if (iin != null && (iin instanceof IOplusAppStartController)) {
                return (IOplusAppStartController) iin;
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
                    return "appStartMonitor";
                case 2:
                    return "preventStartMonitor";
                case 3:
                    return "notifyPreventIndulge";
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
                data.enforceInterface(IOplusAppStartController.DESCRIPTOR);
            }
            switch (code) {
                case 1:
                    String _arg0 = data.readString();
                    String _arg1 = data.readString();
                    String _arg2 = data.readString();
                    String _arg3 = data.readString();
                    String _arg4 = data.readString();
                    data.enforceNoDataAvail();
                    appStartMonitor(_arg0, _arg1, _arg2, _arg3, _arg4);
                    return true;
                case 2:
                    String _arg5 = data.readString();
                    String _arg6 = data.readString();
                    String _arg7 = data.readString();
                    String _arg8 = data.readString();
                    String _arg9 = data.readString();
                    data.enforceNoDataAvail();
                    preventStartMonitor(_arg5, _arg6, _arg7, _arg8, _arg9);
                    return true;
                case 3:
                    String _arg10 = data.readString();
                    data.enforceNoDataAvail();
                    notifyPreventIndulge(_arg10);
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        private static final class Proxy implements IOplusAppStartController {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public final String getInterfaceDescriptor() {
                return IOplusAppStartController.DESCRIPTOR;
            }

            @Override // com.oplus.app.IOplusAppStartController
            public void appStartMonitor(String pkgName, String exceptionClass, String exceptionMsg, String exceptionTrace, String monitorType) throws RemoteException {
                Parcel _data = Parcel.obtain(asBinder());
                try {
                    _data.writeInterfaceToken(IOplusAppStartController.DESCRIPTOR);
                    _data.writeString(pkgName);
                    _data.writeString(exceptionClass);
                    _data.writeString(exceptionMsg);
                    _data.writeString(exceptionTrace);
                    _data.writeString(monitorType);
                    this.mRemote.transact(1, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // com.oplus.app.IOplusAppStartController
            public void preventStartMonitor(String callerPkg, String calledPkg, String startMode, String preventMode, String reason) throws RemoteException {
                Parcel _data = Parcel.obtain(asBinder());
                try {
                    _data.writeInterfaceToken(IOplusAppStartController.DESCRIPTOR);
                    _data.writeString(callerPkg);
                    _data.writeString(calledPkg);
                    _data.writeString(startMode);
                    _data.writeString(preventMode);
                    _data.writeString(reason);
                    this.mRemote.transact(2, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // com.oplus.app.IOplusAppStartController
            public void notifyPreventIndulge(String pkgName) throws RemoteException {
                Parcel _data = Parcel.obtain(asBinder());
                try {
                    _data.writeInterfaceToken(IOplusAppStartController.DESCRIPTOR);
                    _data.writeString(pkgName);
                    this.mRemote.transact(3, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }
        }
    }
}
