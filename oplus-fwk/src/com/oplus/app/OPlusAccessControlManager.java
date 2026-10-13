package com.oplus.app;

import android.os.UserHandle;

public class OPlusAccessControlManager {
    
    private static OPlusAccessControlManager sOPlusAccessControlManager = null;

    public static final int USER_CURRENT = UserHandle.myUserId();

    public static OPlusAccessControlManager getInstance() {
        if (sOPlusAccessControlManager == null) {
            sOPlusAccessControlManager = new OPlusAccessControlManager();
        }
        return sOPlusAccessControlManager;
    }

    public boolean isEncryptPass(String packageName, int userId) {
        return true;
    }

    public boolean isEncryptedPackage(String packageName, int userId) {
        return true;
    }

    public java.util.Map<java.lang.String, java.lang.Integer> getAccessControlAppsInfo(java.lang.String p0, int p1) { return null; }
    public boolean getAccessControlEnabled(java.lang.String p0, int p1) { return false; }
    public boolean getApplicationAccessControlEnabledAsUser(java.lang.String p0, int p1) { return false; }
    public java.util.Map<java.lang.String, java.lang.Integer> getPrivacyAppInfo(int p0) { return null; }
    public boolean registerAccessControlObserver(java.lang.String p0, com.oplus.app.IOplusAccessControlObserver p1) { return false; }
    public boolean unregisterAccessControlObserver(java.lang.String p0, com.oplus.app.IOplusAccessControlObserver p1) { return false; }
}
