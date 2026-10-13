package com.oplus.multiuser;

public interface IOplusMultiUserManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.multiuser.IOplusMultiUserManager";
    public boolean canAddMoreUsers() throws android.os.RemoteException;
    public boolean canAddMoreUsersOfType(java.lang.String p0) throws android.os.RemoteException;
    public int createCloneUser(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo createUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean getIsSupportMultiApp() throws android.os.RemoteException;
    public int getMaxCloneUserNum() throws android.os.RemoteException;
    public int getMultiAppAccessMode(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getMultiAppAlias(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void getMultiAppAllAccessMode(android.os.Bundle p0) throws android.os.RemoteException;
    public int getMultiAppBadgeResourceId(int p0, int p1) throws android.os.RemoteException;
    public com.oplus.multiapp.OplusMultiAppConfig getMultiAppConfig() throws android.os.RemoteException;
    public java.util.List<com.oplus.multiapp.MultiAppInfo> getMultiAppInfos(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getMultiAppList(int p0, int p1) throws android.os.RemoteException;
    public int getMultiAppMaxCreateNum() throws android.os.RemoteException;
    public int[] getMultiAppUids(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.content.pm.UserInfo> getMultiAppUserInfoList() throws android.os.RemoteException;
    public int getMultiSystemUserIdNoCheck() throws android.os.RemoteException;
    public int getStudyUserId() throws android.os.RemoteException;
    public android.content.pm.UserInfo getUserInfo(int p0) throws android.os.RemoteException;
    public boolean isAllowCrossUser(int p0, int p1) throws android.os.RemoteException;
    public boolean isGuestUser(int p0) throws android.os.RemoteException;
    public boolean isMultiApp(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isMultiAppUserId(int p0) throws android.os.RemoteException;
    public boolean isUserUnlockingOrUnlocked(android.os.UserHandle p0) throws android.os.RemoteException;
    public boolean removeUser(int p0) throws android.os.RemoteException;
    public void scanFileIfNeed(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int setMultiAppAccessMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int setMultiAppAlias(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int setMultiAppConfig(com.oplus.multiapp.OplusMultiAppConfig p0) throws android.os.RemoteException;
    public int setMultiAppStatus(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean switchUserForSystemClone(int p0) throws android.os.RemoteException;

    public static class Default implements com.oplus.multiuser.IOplusMultiUserManager {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public boolean canAddMoreUsers() throws android.os.RemoteException { return false; }
        public boolean canAddMoreUsersOfType(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int createCloneUser(int p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.UserInfo createUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean getIsSupportMultiApp() throws android.os.RemoteException { return false; }
        public int getMaxCloneUserNum() throws android.os.RemoteException { return 0; }
        public int getMultiAppAccessMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getMultiAppAlias(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void getMultiAppAllAccessMode(android.os.Bundle p0) throws android.os.RemoteException { }
        public int getMultiAppBadgeResourceId(int p0, int p1) throws android.os.RemoteException { return 0; }
        public com.oplus.multiapp.OplusMultiAppConfig getMultiAppConfig() throws android.os.RemoteException { return null; }
        public java.util.List<com.oplus.multiapp.MultiAppInfo> getMultiAppInfos(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getMultiAppList(int p0, int p1) throws android.os.RemoteException { return null; }
        public int getMultiAppMaxCreateNum() throws android.os.RemoteException { return 0; }
        public int[] getMultiAppUids(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.UserInfo> getMultiAppUserInfoList() throws android.os.RemoteException { return null; }
        public int getMultiSystemUserIdNoCheck() throws android.os.RemoteException { return 0; }
        public int getStudyUserId() throws android.os.RemoteException { return 0; }
        public android.content.pm.UserInfo getUserInfo(int p0) throws android.os.RemoteException { return null; }
        public boolean isAllowCrossUser(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isGuestUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isMultiApp(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isMultiAppUserId(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserUnlockingOrUnlocked(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
        public boolean removeUser(int p0) throws android.os.RemoteException { return false; }
        public void scanFileIfNeed(int p0, java.lang.String p1) throws android.os.RemoteException { }
        public int setMultiAppAccessMode(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int setMultiAppAlias(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public int setMultiAppConfig(com.oplus.multiapp.OplusMultiAppConfig p0) throws android.os.RemoteException { return 0; }
        public int setMultiAppStatus(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public boolean switchUserForSystemClone(int p0) throws android.os.RemoteException { return false; }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.multiuser.IOplusMultiUserManager {
        static final int TRANSACTION_canAddMoreUsers = 2;
        static final int TRANSACTION_canAddMoreUsersOfType = 30;
        static final int TRANSACTION_createCloneUser = 27;
        static final int TRANSACTION_createUser = 3;
        static final int TRANSACTION_getIsSupportMultiApp = 9;
        static final int TRANSACTION_getMaxCloneUserNum = 26;
        static final int TRANSACTION_getMultiAppAccessMode = 18;
        static final int TRANSACTION_getMultiAppAlias = 15;
        static final int TRANSACTION_getMultiAppAllAccessMode = 17;
        static final int TRANSACTION_getMultiAppBadgeResourceId = 29;
        static final int TRANSACTION_getMultiAppConfig = 13;
        static final int TRANSACTION_getMultiAppInfos = 21;
        static final int TRANSACTION_getMultiAppList = 12;
        static final int TRANSACTION_getMultiAppMaxCreateNum = 10;
        static final int TRANSACTION_getMultiAppUids = 25;
        static final int TRANSACTION_getMultiAppUserInfoList = 24;
        static final int TRANSACTION_getMultiSystemUserIdNoCheck = 1;
        static final int TRANSACTION_getStudyUserId = 31;
        static final int TRANSACTION_getUserInfo = 4;
        static final int TRANSACTION_isAllowCrossUser = 28;
        static final int TRANSACTION_isGuestUser = 5;
        static final int TRANSACTION_isMultiApp = 20;
        static final int TRANSACTION_isMultiAppUserId = 23;
        static final int TRANSACTION_isUserUnlockingOrUnlocked = 6;
        static final int TRANSACTION_removeUser = 7;
        static final int TRANSACTION_scanFileIfNeed = 8;
        static final int TRANSACTION_setMultiAppAccessMode = 19;
        static final int TRANSACTION_setMultiAppAlias = 16;
        static final int TRANSACTION_setMultiAppConfig = 14;
        static final int TRANSACTION_setMultiAppStatus = 11;
        static final int TRANSACTION_switchUserForSystemClone = 22;
        public Stub() { }
        public static com.oplus.multiuser.IOplusMultiUserManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.multiuser.IOplusMultiUserManager {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public boolean canAddMoreUsers() throws android.os.RemoteException { return false; }
            public boolean canAddMoreUsersOfType(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int createCloneUser(int p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.UserInfo createUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean getIsSupportMultiApp() throws android.os.RemoteException { return false; }
            public int getMaxCloneUserNum() throws android.os.RemoteException { return 0; }
            public int getMultiAppAccessMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getMultiAppAlias(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void getMultiAppAllAccessMode(android.os.Bundle p0) throws android.os.RemoteException { }
            public int getMultiAppBadgeResourceId(int p0, int p1) throws android.os.RemoteException { return 0; }
            public com.oplus.multiapp.OplusMultiAppConfig getMultiAppConfig() throws android.os.RemoteException { return null; }
            public java.util.List<com.oplus.multiapp.MultiAppInfo> getMultiAppInfos(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getMultiAppList(int p0, int p1) throws android.os.RemoteException { return null; }
            public int getMultiAppMaxCreateNum() throws android.os.RemoteException { return 0; }
            public int[] getMultiAppUids(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.UserInfo> getMultiAppUserInfoList() throws android.os.RemoteException { return null; }
            public int getMultiSystemUserIdNoCheck() throws android.os.RemoteException { return 0; }
            public int getStudyUserId() throws android.os.RemoteException { return 0; }
            public android.content.pm.UserInfo getUserInfo(int p0) throws android.os.RemoteException { return null; }
            public boolean isAllowCrossUser(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isGuestUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isMultiApp(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isMultiAppUserId(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserUnlockingOrUnlocked(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
            public boolean removeUser(int p0) throws android.os.RemoteException { return false; }
            public void scanFileIfNeed(int p0, java.lang.String p1) throws android.os.RemoteException { }
            public int setMultiAppAccessMode(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int setMultiAppAlias(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public int setMultiAppConfig(com.oplus.multiapp.OplusMultiAppConfig p0) throws android.os.RemoteException { return 0; }
            public int setMultiAppStatus(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public boolean switchUserForSystemClone(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
