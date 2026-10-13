package com.oplus.multiuser;

public class OplusMultiUserManager {
    public static final int FLAG_MULTI_SYSTEM = 536870912;
    public static final int FLAG_STUDY_USER = 1073741824;
    public OplusMultiUserManager() { }
    public static java.util.List<java.lang.String> getForbiddenPkgList() { return null; }
    public static com.oplus.multiuser.OplusMultiUserManager getInstance() { if (sStub == null) sStub = new OplusMultiUserManager(); return sStub; }
    public static com.oplus.multiuser.IOplusMultiUserManager getService() { return null; }
    public static int getStudyUserId(android.content.Context p0) { return 0; }
    public static boolean isAllowedTestApplication(android.content.pm.ApplicationInfo p0) { return false; }
    public static boolean isMultiSystemForbiddenPkg(java.lang.String p0) { return false; }
    public static boolean isStudyUser(android.content.Context p0, int p1) { return false; }
    public static void setServiceForTesting(com.oplus.multiuser.IOplusMultiUserManager p0) { }
    public static void setSettingsAdapterForTesting(com.oplus.multiuser.OplusMultiUserManager.SettingsAdapter p0) { }
    public void adjustConfigurationForUser(android.content.ContentResolver p0, android.content.res.Configuration p1, int p2) { }
    public boolean canAddMoreUsers() { return false; }
    public boolean canAddMoreUsersOfType(java.lang.String p0) { return false; }
    public com.oplus.wrapper.content.pm.UserInfo createUser(java.lang.String p0, int p1) { return null; }
    public int getMultiSystemUserId() { return 0; }
    public com.oplus.wrapper.content.pm.UserInfo getUserInfo(int p0) { return null; }
    public boolean hasMultiSystemUser() { return false; }
    public boolean isGuestUser() { return false; }
    public boolean isMultiSystemUser(android.content.pm.UserInfo p0) { return false; }
    public boolean isMultiSystemUserHandle(android.os.UserHandle p0) { return false; }
    public boolean isMultiSystemUserId(int p0) { return false; }
    public boolean isUserUnlockingOrUnlocked(android.os.UserHandle p0) { return false; }
    public boolean putConfigurationForUser(android.content.ContentResolver p0, android.content.res.Configuration p1, int p2) { return false; }
    public boolean removeUser(int p0) { return false; }
    public boolean switchUserForSystemClone(int p0) { return false; }
    private static OplusMultiUserManager sStub;

    public static class SettingsAdapter {
        public SettingsAdapter() { }
        public int getSecureIntForUser(android.content.ContentResolver p0, java.lang.String p1, int p2, int p3) { return 0; }
        public float getSystemFloatForUser(android.content.ContentResolver p0, java.lang.String p1, float p2, int p3) { return 0f; }
        public boolean putConfigurationForUser(android.content.ContentResolver p0, android.content.res.Configuration p1, int p2) { return false; }
    }
}
