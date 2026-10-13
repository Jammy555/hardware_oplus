package com.oplus.view.inputmethod;

public interface IOplusInputMethodObserver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.view.inputmethod.IOplusInputMethodObserver";
    public static final int FLAG_VISIBILITY = 1;
    public void onVisibilityChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements com.oplus.view.inputmethod.IOplusInputMethodObserver {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void onVisibilityChanged(boolean p0) throws android.os.RemoteException { }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.view.inputmethod.IOplusInputMethodObserver {
        static final int TRANSACTION_onVisibilityChanged = 1;
        public Stub() { }
        public static com.oplus.view.inputmethod.IOplusInputMethodObserver asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.view.inputmethod.IOplusInputMethodObserver {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onVisibilityChanged(boolean p0) throws android.os.RemoteException { }
        }
    }
}
