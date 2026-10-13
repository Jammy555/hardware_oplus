package com.oplus.multiapp;

public abstract class BaseOplusMultiAppManager {
    public static boolean DEBUG_ALL;
    public static final java.lang.String EXTERNAL_PRIMARY_MAIN_PATH = "/storage/emulated/0";
    public static final java.lang.String EXTERNAL_PRIMARY_MULTIAPP_PATH = "/storage/emulated/999";
    public static final java.lang.String TAG = "MultiApp-OplusMultiAppManager";
    public static final int USER_FLAG_MULTI_APP = 67108864;
    public static final int USER_ID_MULTI_APP = 999;
    public static final int USER_ID_ORIGINAL = 0;
    com.oplus.multiapp.IOplusMultiApp oplusMultiApp;
    BaseOplusMultiAppManager() { }
    public static java.lang.String redirectPath(int p0, java.lang.String p1) { return null; }
    public boolean isMultiAppUserId(int p0) { return false; }
    public void scanFileIfNeed(int p0, java.lang.String p1) { }
}
