package android.content.pm;

import android.content.Context;

public class OplusPackageManager {

    private static OplusPackageManager sInstance;

    public static OplusPackageManager getOplusPackageManager(Context context) {
        if (sInstance == null) {
            sInstance = new OplusPackageManager();
        }
        return sInstance;
    }

    public int getOplusFreezePackageState(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
    public boolean isClosedSuperFirewall() { return false; }
    public int oplusUnFreezePackage(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
}
