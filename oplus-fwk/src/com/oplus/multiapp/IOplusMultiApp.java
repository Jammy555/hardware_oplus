package com.oplus.multiapp;

public interface IOplusMultiApp extends android.common.IOplusCommonFeature {
    public static final com.oplus.multiapp.IOplusMultiApp DEFAULT = null;
    public default android.common.IOplusCommonFeature getDefault() { return null; }
    public default int getMaxCreateNum() { return 0; }
    public default int getMultiAppAccessMode(java.lang.String p0) { return 0; }
    public default java.lang.String getMultiAppAlias(java.lang.String p0) { return null; }
    public default java.util.Map<java.lang.String, java.lang.Integer> getMultiAppAllAccessMode() { return null; }
    public default com.oplus.multiapp.OplusMultiAppConfig getMultiAppConfig() { return null; }
    public default java.util.List<java.lang.String> getMultiAppList(int p0) { return null; }
    public default android.os.UserHandle getMultiAppUserHandle() { return null; }
    public default android.common.OplusFeatureList.OplusIndex index() { return null; }
    public default boolean isCrossUserAuthority(java.lang.String p0, int p1) { return false; }
    public default boolean isMultiApp(int p0, java.lang.String p1) { return false; }
    public default boolean isMultiAppSupport() { return false; }
    public default boolean isMultiAppUserHandle(android.os.UserHandle p0) { return false; }
    public default boolean isMultiAppUserId(int p0) { return false; }
    public default boolean isProfileFilterPackage(java.lang.String p0) { return false; }
    public default void scanFileIfNeed(int p0, java.lang.String p1) { }
    public default int setMultiAppAccessMode(java.lang.String p0, int p1) { return 0; }
    public default int setMultiAppAlias(java.lang.String p0, java.lang.String p1) { return 0; }
    public default int setMultiAppConfig(com.oplus.multiapp.OplusMultiAppConfig p0) { return 0; }
    public default int setMultiAppPackageStatus(java.lang.String p0, int p1) { return 0; }
}
