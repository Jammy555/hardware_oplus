package com.oplus.globalgesture;

public interface IOplusGlobalGestureObserver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.globalgesture.IOplusGlobalGestureObserver";
    public void onGestureDetected(int p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static class Default implements com.oplus.globalgesture.IOplusGlobalGestureObserver {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void onGestureDetected(int p0, android.os.Bundle p1) throws android.os.RemoteException { }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.globalgesture.IOplusGlobalGestureObserver {
        static final int TRANSACTION_onGestureDetected = 1;
        public Stub() { }
        public static com.oplus.globalgesture.IOplusGlobalGestureObserver asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.globalgesture.IOplusGlobalGestureObserver {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onGestureDetected(int p0, android.os.Bundle p1) throws android.os.RemoteException { }
        }
    }
}
