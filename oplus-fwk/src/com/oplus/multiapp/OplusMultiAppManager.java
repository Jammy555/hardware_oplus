package com.oplus.multiapp;

public class OplusMultiAppManager extends com.oplus.multiapp.BaseOplusMultiAppManager {
    public static final java.lang.String ACTION_MULTI_APP_ALIAS_CHANGED = "oplus.intent.action.MULTI_APP_RENAME";
    public static final java.lang.String ACTION_MULTI_APP_CONFIG_CHANGED = "oplus.intent.action.MULTI_APP_CONFIG_CHANGED";
    public static final java.lang.String ACTION_MULTI_APP_HIDE_ALERT_DIALOG = "oplus.intent.action.MULTI_APP_HIDE_ALERT_DIALOG";
    public static final java.lang.String ACTION_MULTI_APP_PACKAGE_ADDED = "oplus.intent.action.MULTI_APP_PACKAGE_ADDED";
    public static final java.lang.String ACTION_MULTI_APP_PACKAGE_REMOVED = "oplus.intent.action.MULTI_APP_PACKAGE_REMOVED";
    public static final java.lang.String ACTION_REMOVE_MULTIAPP_COMPLETED = "oplus.intent.action.REMOVE_MULTIAPP_COMPLETED";
    public static final int CHECK_MULTI_APP_USER = 2;
    public static final int DEFAULT_ACCESS = 0;
    public static final int DEFAULT_BADGE_TYPE = 2;
    public static final java.lang.String EXTRA_ALIAS = "name";
    public static final java.lang.String EXTRA_PACKAGE_NAME = "pkg";
    public static final java.lang.String EXTRA_STATUS = "extra_status";
    public static final int ICON_BADGE_TYPE = 1;
    public static java.util.List<java.lang.String> KEEP_CROSS_VOLUME_PKG;
    public static final int LIST_FILTERED_CREATED_MULTI_APP = 3;
    public static final int LIST_OTHER_MULTI_APP = 2;
    public static final int LIST_RECOMMEND_MULTI_APP = 1;
    public static final int LIST_TYPE_ACROSS_AUTHORITY = 4;
    public static final int LIST_TYPE_ALLOWED = 1;
    public static final int LIST_TYPE_CREATED = 0;
    public static final int LIST_TYPE_INSTALLED = 3;
    public static final int LIST_TYPE_RELATED = 2;
    public static final int MAIN_APP_ACCESS = 1;
    public static final int MIN_MULTI_APP_USER_ID = 990;
    public static final int MULTI_APP_STATUS_ADD = 1;
    public static final int MULTI_APP_STATUS_ADD_DEFAULT = 5;
    public static final int MULTI_APP_STATUS_REMOVE = -1;
    public static final int MULTI_APP_STATUS_REMOVE_ALL = -2;
    public static final int NO_BG_BADGE_TYPE = 3;
    public static final int REMOVE_MULTI_APP_USER = 3;
    public static final int RESTORE_MULTI_APP_USER = 4;
    public static final int RESULT_CHECK_ERROR_NO_RUNNING = -4;
    public static final int RESULT_CHECK_ERROR_REMOVE_MULTI_APP_USER = -7;
    public static final int RESULT_CHECK_ERROR_RUNNING_LOCKED = -5;
    public static final int RESULT_CHECK_ERROR_VOLD_CORRUPT = -6;
    public static final int RESULT_CHECK_NO_ERROR = 0;
    public static final int RESULT_ERROR_NOT_ALLOW_ADD = -4;
    public static final int RESULT_ERROR_NOT_SUPPORT = -2;
    public static final int RESULT_ERROR_NO_SPACE = -3;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_RESTORE_ERROR_NEED_RESET = -8;
    public static final int RESULT_SUCCESS = 1;
    public static final int USER_ID_MULTI_APP = 999;
    public static final java.lang.String VOLUME_MAIN = "ace-0";
    public static final java.lang.String VOLUME_MAIN_PATH = "/storage/ace-0";
    public static final java.lang.String VOLUME_MULTI_APP = "ace-999";
    public static final java.lang.String VOLUME_MULTI_APP_PATH = "/storage/ace-999";
    public static com.oplus.multiapp.OplusMultiAppManager getInstance() { if (sStub == null) sStub = new OplusMultiAppManager(); return sStub; }
    public int createCloneUser(int p0) { return 0; }
    public int getMaxCloneUserNum() { return 0; }
    public int getMaxCreateNum() { return 0; }
    public int getMultiAppAccessMode(java.lang.String p0) { return 0; }
    public java.lang.String getMultiAppAlias(java.lang.String p0) { return null; }
    public java.lang.String getMultiAppAlias(java.lang.String p0, int p1) { return null; }
    public java.util.Map<java.lang.String, java.lang.Integer> getMultiAppAllAccessMode() { return null; }
    public int getMultiAppBadgeResourceId(int p0, int p1) { return 0; }
    public com.oplus.multiapp.OplusMultiAppConfig getMultiAppConfig() { return null; }
    public java.util.List<com.oplus.multiapp.MultiAppInfo> getMultiAppInfos(int p0) { return null; }
    public java.util.List<java.lang.String> getMultiAppList(int p0) { return null; }
    public java.util.List<java.lang.String> getMultiAppList(int p0, int p1) { return null; }
    public java.util.List<java.lang.Integer> getMultiAppUids(java.lang.String p0) { return null; }
    public android.os.UserHandle getMultiAppUserHandle() { return null; }
    public java.util.List<com.oplus.wrapper.content.pm.UserInfo> getMultiAppUserInfoList() { return null; }
    public boolean isAllowCrossUser(int p0, int p1) { return false; }
    public boolean isMultiApp(int p0, java.lang.String p1) { return false; }
    public boolean isMultiAppSupport() { return false; }
    public boolean isMultiAppUserHandle(android.os.UserHandle p0) { return false; }
    public boolean isMultiAppUserId(int p0) { return false; }
    public void scanFileIfNeed(int p0, java.lang.String p1) { }
    public boolean setMultiAppAccessMode(java.lang.String p0, int p1) { return false; }
    public int setMultiAppAccessModeInner(java.lang.String p0, int p1) { return 0; }
    public boolean setMultiAppAlias(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean setMultiAppAlias(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public int setMultiAppAliasInner(java.lang.String p0, java.lang.String p1) { return 0; }
    public boolean setMultiAppConfig(com.oplus.multiapp.OplusMultiAppConfig p0) { return false; }
    public int setMultiAppConfigInner(com.oplus.multiapp.OplusMultiAppConfig p0) { return 0; }
    public int setMultiAppStatus(java.lang.String p0, int p1) { return 0; }
    public int setMultiAppStatus(java.lang.String p0, int p1, int p2) { return 0; }
    private OplusMultiAppManager() { }
    private static OplusMultiAppManager sStub;
}
