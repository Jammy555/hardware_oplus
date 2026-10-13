package com.oplus.miragewindow;

public interface IOplusMirageWindowObserver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.miragewindow.IOplusMirageWindowObserver";
    public void onMirageDisplayTopActivityUidChanged(int p0) throws android.os.RemoteException;
    public void onMirageWindConfigChanged(com.oplus.miragewindow.OplusMirageWindowInfo p0) throws android.os.RemoteException;
    public void onMirageWindowDied(java.lang.String p0) throws android.os.RemoteException;
    public void onMirageWindowExit(com.oplus.miragewindow.OplusMirageWindowInfo p0) throws android.os.RemoteException;
    public void onMirageWindowShow(com.oplus.miragewindow.OplusMirageWindowInfo p0) throws android.os.RemoteException;

    public static class Default implements com.oplus.miragewindow.IOplusMirageWindowObserver {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void onMirageDisplayTopActivityUidChanged(int p0) throws android.os.RemoteException { }
        public void onMirageWindConfigChanged(com.oplus.miragewindow.OplusMirageWindowInfo p0) throws android.os.RemoteException { }
        public void onMirageWindowDied(java.lang.String p0) throws android.os.RemoteException { }
        public void onMirageWindowExit(com.oplus.miragewindow.OplusMirageWindowInfo p0) throws android.os.RemoteException { }
        public void onMirageWindowShow(com.oplus.miragewindow.OplusMirageWindowInfo p0) throws android.os.RemoteException { }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.miragewindow.IOplusMirageWindowObserver {
        static final int TRANSACTION_onMirageDisplayTopActivityUidChanged = 5;
        static final int TRANSACTION_onMirageWindConfigChanged = 4;
        static final int TRANSACTION_onMirageWindowDied = 3;
        static final int TRANSACTION_onMirageWindowExit = 2;
        static final int TRANSACTION_onMirageWindowShow = 1;
        public Stub() { }
        public static com.oplus.miragewindow.IOplusMirageWindowObserver asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.miragewindow.IOplusMirageWindowObserver {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onMirageDisplayTopActivityUidChanged(int p0) throws android.os.RemoteException { }
            public void onMirageWindConfigChanged(com.oplus.miragewindow.OplusMirageWindowInfo p0) throws android.os.RemoteException { }
            public void onMirageWindowDied(java.lang.String p0) throws android.os.RemoteException { }
            public void onMirageWindowExit(com.oplus.miragewindow.OplusMirageWindowInfo p0) throws android.os.RemoteException { }
            public void onMirageWindowShow(com.oplus.miragewindow.OplusMirageWindowInfo p0) throws android.os.RemoteException { }
        }
    }
}
