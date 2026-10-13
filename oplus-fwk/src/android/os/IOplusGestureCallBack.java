package android.os;

public interface IOplusGestureCallBack extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IOplusGestureCallBack";
    public void onDealGesture(int p0) throws android.os.RemoteException;

    public static class Default implements android.os.IOplusGestureCallBack {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void onDealGesture(int p0) throws android.os.RemoteException { }
    }

    public abstract static class Stub extends android.os.Binder implements android.os.IOplusGestureCallBack {
        static final int TRANSACTION_onDealGesture = 1;
        public Stub() { }
        public static android.os.IOplusGestureCallBack asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements android.os.IOplusGestureCallBack {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDealGesture(int p0) throws android.os.RemoteException { }
        }
    }
}
