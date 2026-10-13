package com.oplus.datasync;

public interface ISysStateChangeCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.datasync.ISysStateChangeCallback";
    public void onSysStateChanged(android.os.Bundle p0) throws android.os.RemoteException;

    public static class Default implements com.oplus.datasync.ISysStateChangeCallback {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void onSysStateChanged(android.os.Bundle p0) throws android.os.RemoteException { }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.datasync.ISysStateChangeCallback {
        static final int TRANSACTION_onSysStateChanged = 1;
        public Stub() { }
        public static com.oplus.datasync.ISysStateChangeCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.datasync.ISysStateChangeCallback {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onSysStateChanged(android.os.Bundle p0) throws android.os.RemoteException { }
        }
    }
}
