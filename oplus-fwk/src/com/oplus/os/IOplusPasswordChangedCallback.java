package com.oplus.os;

public interface IOplusPasswordChangedCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.os.IOplusPasswordChangedCallback";
    public void onPasswordChanged(byte p0, byte[] p1) throws android.os.RemoteException;

    public static class Default implements com.oplus.os.IOplusPasswordChangedCallback {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void onPasswordChanged(byte p0, byte[] p1) throws android.os.RemoteException { }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.os.IOplusPasswordChangedCallback {
        static final int TRANSACTION_onPasswordChanged = 1;
        public Stub() { }
        public static com.oplus.os.IOplusPasswordChangedCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.os.IOplusPasswordChangedCallback {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPasswordChanged(byte p0, byte[] p1) throws android.os.RemoteException { }
        }
    }
}
