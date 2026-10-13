package com.oplus.confinemode;

public interface IOplusConfineModeObserver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.confinemode.IOplusConfineModeObserver";
    public void onChange(int p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements com.oplus.confinemode.IOplusConfineModeObserver {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void onChange(int p0, int p1, int p2) throws android.os.RemoteException { }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.confinemode.IOplusConfineModeObserver {
        static final int TRANSACTION_onChange = 1;
        public Stub() { }
        public static com.oplus.confinemode.IOplusConfineModeObserver asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.confinemode.IOplusConfineModeObserver {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onChange(int p0, int p1, int p2) throws android.os.RemoteException { }
        }
    }
}
