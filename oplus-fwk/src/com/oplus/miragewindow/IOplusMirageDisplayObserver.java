package com.oplus.miragewindow;

public interface IOplusMirageDisplayObserver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.miragewindow.IOplusMirageDisplayObserver";
    public void onMirageDisplayCastFailed(int p0) throws android.os.RemoteException;
    public void onMirageDisplayCastSuccess(com.oplus.miragewindow.OplusMirageDisplayCastInfo p0, int p1) throws android.os.RemoteException;
    public void onMirageDisplayConfigChanged(com.oplus.miragewindow.OplusMirageDisplayCastInfo p0, int p1) throws android.os.RemoteException;
    public void onMirageDisplayExit(int p0) throws android.os.RemoteException;
    public void onMirageDisplayToastEvent(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void onMirageDisplayTopActivityUidChanged(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.oplus.miragewindow.IOplusMirageDisplayObserver {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void onMirageDisplayCastFailed(int p0) throws android.os.RemoteException { }
        public void onMirageDisplayCastSuccess(com.oplus.miragewindow.OplusMirageDisplayCastInfo p0, int p1) throws android.os.RemoteException { }
        public void onMirageDisplayConfigChanged(com.oplus.miragewindow.OplusMirageDisplayCastInfo p0, int p1) throws android.os.RemoteException { }
        public void onMirageDisplayExit(int p0) throws android.os.RemoteException { }
        public void onMirageDisplayToastEvent(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException { }
        public void onMirageDisplayTopActivityUidChanged(int p0, int p1) throws android.os.RemoteException { }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.miragewindow.IOplusMirageDisplayObserver {
        static final int TRANSACTION_onMirageDisplayCastFailed = 2;
        static final int TRANSACTION_onMirageDisplayCastSuccess = 1;
        static final int TRANSACTION_onMirageDisplayConfigChanged = 4;
        static final int TRANSACTION_onMirageDisplayExit = 3;
        static final int TRANSACTION_onMirageDisplayToastEvent = 6;
        static final int TRANSACTION_onMirageDisplayTopActivityUidChanged = 5;
        public Stub() { }
        public static com.oplus.miragewindow.IOplusMirageDisplayObserver asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.miragewindow.IOplusMirageDisplayObserver {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onMirageDisplayCastFailed(int p0) throws android.os.RemoteException { }
            public void onMirageDisplayCastSuccess(com.oplus.miragewindow.OplusMirageDisplayCastInfo p0, int p1) throws android.os.RemoteException { }
            public void onMirageDisplayConfigChanged(com.oplus.miragewindow.OplusMirageDisplayCastInfo p0, int p1) throws android.os.RemoteException { }
            public void onMirageDisplayExit(int p0) throws android.os.RemoteException { }
            public void onMirageDisplayToastEvent(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException { }
            public void onMirageDisplayTopActivityUidChanged(int p0, int p1) throws android.os.RemoteException { }
        }
    }
}
