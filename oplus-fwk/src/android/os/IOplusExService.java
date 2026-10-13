package android.os;

public interface IOplusExService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IOplusExService";
    public void dealScreenoffGesture(int p0) throws android.os.RemoteException;
    public boolean getGestureState(int p0) throws android.os.RemoteException;
    public void pauseExInputEvent() throws android.os.RemoteException;
    public void pilferPointers() throws android.os.RemoteException;
    public boolean registerGlobalGestureObserver(com.oplus.globalgesture.IOplusGlobalGestureObserver p0, java.lang.String p1, int p2, java.util.List<android.graphics.RectF> p3) throws android.os.RemoteException;
    public boolean registerInputEvent(android.os.IOplusExInputCallBack p0) throws android.os.RemoteException;
    public boolean registerRawInputEvent(android.os.IOplusExInputCallBack p0) throws android.os.RemoteException;
    public boolean registerScreenoffGesture(android.os.IOplusGestureCallBack p0) throws android.os.RemoteException;
    public boolean registerScreenoffGestureWithCoords(android.os.IOplusGestureWithCoordsCallback p0) throws android.os.RemoteException;
    public void resumeExInputEvent() throws android.os.RemoteException;
    public void setGestureState(int p0, boolean p1) throws android.os.RemoteException;
    public boolean unregisterGlobalGestureObserver(com.oplus.globalgesture.IOplusGlobalGestureObserver p0) throws android.os.RemoteException;
    public void unregisterInputEvent(android.os.IOplusExInputCallBack p0) throws android.os.RemoteException;
    public void unregisterScreenoffGesture(android.os.IOplusGestureCallBack p0) throws android.os.RemoteException;
    public void unregisterScreenoffGestureWithCoords(android.os.IOplusGestureWithCoordsCallback p0) throws android.os.RemoteException;
    public boolean updateGlobalGestureObserver(com.oplus.globalgesture.IOplusGlobalGestureObserver p0, java.lang.String p1, int p2, java.util.List<android.graphics.RectF> p3) throws android.os.RemoteException;

    public static class Default implements android.os.IOplusExService {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void dealScreenoffGesture(int p0) throws android.os.RemoteException { }
        public boolean getGestureState(int p0) throws android.os.RemoteException { return false; }
        public void pauseExInputEvent() throws android.os.RemoteException { }
        public void pilferPointers() throws android.os.RemoteException { }
        public boolean registerGlobalGestureObserver(com.oplus.globalgesture.IOplusGlobalGestureObserver p0, java.lang.String p1, int p2, java.util.List<android.graphics.RectF> p3) throws android.os.RemoteException { return false; }
        public boolean registerInputEvent(android.os.IOplusExInputCallBack p0) throws android.os.RemoteException { return false; }
        public boolean registerRawInputEvent(android.os.IOplusExInputCallBack p0) throws android.os.RemoteException { return false; }
        public boolean registerScreenoffGesture(android.os.IOplusGestureCallBack p0) throws android.os.RemoteException { return false; }
        public boolean registerScreenoffGestureWithCoords(android.os.IOplusGestureWithCoordsCallback p0) throws android.os.RemoteException { return false; }
        public void resumeExInputEvent() throws android.os.RemoteException { }
        public void setGestureState(int p0, boolean p1) throws android.os.RemoteException { }
        public boolean unregisterGlobalGestureObserver(com.oplus.globalgesture.IOplusGlobalGestureObserver p0) throws android.os.RemoteException { return false; }
        public void unregisterInputEvent(android.os.IOplusExInputCallBack p0) throws android.os.RemoteException { }
        public void unregisterScreenoffGesture(android.os.IOplusGestureCallBack p0) throws android.os.RemoteException { }
        public void unregisterScreenoffGestureWithCoords(android.os.IOplusGestureWithCoordsCallback p0) throws android.os.RemoteException { }
        public boolean updateGlobalGestureObserver(com.oplus.globalgesture.IOplusGlobalGestureObserver p0, java.lang.String p1, int p2, java.util.List<android.graphics.RectF> p3) throws android.os.RemoteException { return false; }
    }

    public abstract static class Stub extends android.os.Binder implements android.os.IOplusExService {
        static final int TRANSACTION_dealScreenoffGesture = 8;
        static final int TRANSACTION_getGestureState = 10;
        static final int TRANSACTION_pauseExInputEvent = 4;
        static final int TRANSACTION_pilferPointers = 11;
        static final int TRANSACTION_registerGlobalGestureObserver = 12;
        static final int TRANSACTION_registerInputEvent = 1;
        static final int TRANSACTION_registerRawInputEvent = 2;
        static final int TRANSACTION_registerScreenoffGesture = 6;
        static final int TRANSACTION_registerScreenoffGestureWithCoords = 15;
        static final int TRANSACTION_resumeExInputEvent = 5;
        static final int TRANSACTION_setGestureState = 9;
        static final int TRANSACTION_unregisterGlobalGestureObserver = 13;
        static final int TRANSACTION_unregisterInputEvent = 3;
        static final int TRANSACTION_unregisterScreenoffGesture = 7;
        static final int TRANSACTION_unregisterScreenoffGestureWithCoords = 16;
        static final int TRANSACTION_updateGlobalGestureObserver = 14;
        public Stub() { }
        public static android.os.IOplusExService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements android.os.IOplusExService {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public void dealScreenoffGesture(int p0) throws android.os.RemoteException { }
            public boolean getGestureState(int p0) throws android.os.RemoteException { return false; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void pauseExInputEvent() throws android.os.RemoteException { }
            public void pilferPointers() throws android.os.RemoteException { }
            public boolean registerGlobalGestureObserver(com.oplus.globalgesture.IOplusGlobalGestureObserver p0, java.lang.String p1, int p2, java.util.List<android.graphics.RectF> p3) throws android.os.RemoteException { return false; }
            public boolean registerInputEvent(android.os.IOplusExInputCallBack p0) throws android.os.RemoteException { return false; }
            public boolean registerRawInputEvent(android.os.IOplusExInputCallBack p0) throws android.os.RemoteException { return false; }
            public boolean registerScreenoffGesture(android.os.IOplusGestureCallBack p0) throws android.os.RemoteException { return false; }
            public boolean registerScreenoffGestureWithCoords(android.os.IOplusGestureWithCoordsCallback p0) throws android.os.RemoteException { return false; }
            public void resumeExInputEvent() throws android.os.RemoteException { }
            public void setGestureState(int p0, boolean p1) throws android.os.RemoteException { }
            public boolean unregisterGlobalGestureObserver(com.oplus.globalgesture.IOplusGlobalGestureObserver p0) throws android.os.RemoteException { return false; }
            public void unregisterInputEvent(android.os.IOplusExInputCallBack p0) throws android.os.RemoteException { }
            public void unregisterScreenoffGesture(android.os.IOplusGestureCallBack p0) throws android.os.RemoteException { }
            public void unregisterScreenoffGestureWithCoords(android.os.IOplusGestureWithCoordsCallback p0) throws android.os.RemoteException { }
            public boolean updateGlobalGestureObserver(com.oplus.globalgesture.IOplusGlobalGestureObserver p0, java.lang.String p1, int p2, java.util.List<android.graphics.RectF> p3) throws android.os.RemoteException { return false; }
        }
    }
}
