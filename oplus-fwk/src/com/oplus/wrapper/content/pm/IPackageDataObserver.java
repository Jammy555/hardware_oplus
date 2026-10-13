package com.oplus.wrapper.content.pm;

public interface IPackageDataObserver {
    public void onRemoveCompleted(java.lang.String p0, boolean p1) throws android.os.RemoteException;

    public abstract static class Stub implements android.os.IInterface,com.oplus.wrapper.content.pm.IPackageDataObserver {
        public Stub() { }
        public static com.oplus.wrapper.content.pm.IPackageDataObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }

        static class Proxy implements com.oplus.wrapper.content.pm.IPackageDataObserver {
            Proxy(android.content.pm.IPackageDataObserver p0) { }
            public void onRemoveCompleted(java.lang.String p0, boolean p1) throws android.os.RemoteException { }
        }
    }
}
