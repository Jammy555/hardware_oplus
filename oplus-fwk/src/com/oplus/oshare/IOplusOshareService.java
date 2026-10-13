package com.oplus.oshare;

public interface IOplusOshareService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.oshare.IOplusOshareService";
    public void cancelTask(com.oplus.oshare.OplusOshareDevice p0) throws android.os.RemoteException;
    public boolean isSendOn() throws android.os.RemoteException;
    public void pause() throws android.os.RemoteException;
    public void registerCallback(com.oplus.oshare.IOplusOshareCallback p0) throws android.os.RemoteException;
    public void registerMultiCallback(int p0, com.oplus.oshare.IOplusOshareCallback p1) throws android.os.RemoteException;
    public void resume() throws android.os.RemoteException;
    public void scan() throws android.os.RemoteException;
    public void sendData(android.content.Intent p0, com.oplus.oshare.OplusOshareDevice p1) throws android.os.RemoteException;
    public void stop() throws android.os.RemoteException;
    public void switchSend(boolean p0) throws android.os.RemoteException;
    public void unregisterCallback(com.oplus.oshare.IOplusOshareCallback p0) throws android.os.RemoteException;
    public void unregisterMultiCallback(int p0) throws android.os.RemoteException;

    public static class Default implements com.oplus.oshare.IOplusOshareService {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public void cancelTask(com.oplus.oshare.OplusOshareDevice p0) throws android.os.RemoteException { }
        public boolean isSendOn() throws android.os.RemoteException { return false; }
        public void pause() throws android.os.RemoteException { }
        public void registerCallback(com.oplus.oshare.IOplusOshareCallback p0) throws android.os.RemoteException { }
        public void registerMultiCallback(int p0, com.oplus.oshare.IOplusOshareCallback p1) throws android.os.RemoteException { }
        public void resume() throws android.os.RemoteException { }
        public void scan() throws android.os.RemoteException { }
        public void sendData(android.content.Intent p0, com.oplus.oshare.OplusOshareDevice p1) throws android.os.RemoteException { }
        public void stop() throws android.os.RemoteException { }
        public void switchSend(boolean p0) throws android.os.RemoteException { }
        public void unregisterCallback(com.oplus.oshare.IOplusOshareCallback p0) throws android.os.RemoteException { }
        public void unregisterMultiCallback(int p0) throws android.os.RemoteException { }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.oshare.IOplusOshareService {
        static final int TRANSACTION_cancelTask = 7;
        static final int TRANSACTION_isSendOn = 1;
        static final int TRANSACTION_pause = 8;
        static final int TRANSACTION_registerCallback = 4;
        static final int TRANSACTION_registerMultiCallback = 11;
        static final int TRANSACTION_resume = 9;
        static final int TRANSACTION_scan = 3;
        static final int TRANSACTION_sendData = 6;
        static final int TRANSACTION_stop = 10;
        static final int TRANSACTION_switchSend = 2;
        static final int TRANSACTION_unregisterCallback = 5;
        static final int TRANSACTION_unregisterMultiCallback = 12;
        public Stub() { }
        public static com.oplus.oshare.IOplusOshareService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.oshare.IOplusOshareService {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public void cancelTask(com.oplus.oshare.OplusOshareDevice p0) throws android.os.RemoteException { }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isSendOn() throws android.os.RemoteException { return false; }
            public void pause() throws android.os.RemoteException { }
            public void registerCallback(com.oplus.oshare.IOplusOshareCallback p0) throws android.os.RemoteException { }
            public void registerMultiCallback(int p0, com.oplus.oshare.IOplusOshareCallback p1) throws android.os.RemoteException { }
            public void resume() throws android.os.RemoteException { }
            public void scan() throws android.os.RemoteException { }
            public void sendData(android.content.Intent p0, com.oplus.oshare.OplusOshareDevice p1) throws android.os.RemoteException { }
            public void stop() throws android.os.RemoteException { }
            public void switchSend(boolean p0) throws android.os.RemoteException { }
            public void unregisterCallback(com.oplus.oshare.IOplusOshareCallback p0) throws android.os.RemoteException { }
            public void unregisterMultiCallback(int p0) throws android.os.RemoteException { }
        }
    }
}
