package com.oplus.wrapper.content.pm;

public class PackageManager {
    public static final java.lang.String COMPILER_FILTER_EVERYTHING = "everything";
    public static final java.lang.String COMPILER_FILTER_EXTRACT = "extract";
    public static final java.lang.String COMPILER_FILTER_QUICKEN = "quicken";
    public static final java.lang.String COMPILER_FILTER_SPEED = "speed";
    public static final java.lang.String COMPILER_FILTER_SPEED_PROFILE = "speed-profile";
    public static final java.lang.String COMPILER_FILTER_VERIFY = "verify";
    public static final int DELETE_ALL_USERS = 2;
    public static final int DELETE_CHATTY = -2147483648;
    public static final int DELETE_DONT_KILL_APP = 8;
    public static final int DELETE_KEEP_DATA = 1;
    public static final int DELETE_SYSTEM_APP = 4;
    public static int FLAG_PERMISSION_REVIEW_REQUIRED;
    public static int INSTALL_FAILED_INVALID_URI;
    public static int INSTALL_REPLACE_EXISTING;
    public static int MATCH_ANY_USER;
    public static int RESTRICTION_HIDE_FROM_SUGGESTIONS;
    public static int RESTRICTION_HIDE_NOTIFICATIONS;
    public static int RESTRICTION_NONE;
    public PackageManager(android.content.pm.PackageManager p0) { }
    public static void deleteApplicationCacheFiles(android.content.pm.PackageManager p0, java.lang.String p1, com.oplus.wrapper.content.pm.IPackageDataObserver p2) { }
    public static void deleteApplicationCacheFilesAsUser(android.content.pm.PackageManager p0, java.lang.String p1, int p2, com.oplus.wrapper.content.pm.IPackageDataObserver p3) { }
    public static void deletePackage(android.content.pm.PackageManager p0, java.lang.String p1, com.oplus.wrapper.content.pm.IPackageDeleteObserver p2, int p3) { }
    public static android.content.pm.ApplicationInfo getApplicationInfoAsUser(android.content.pm.PackageManager p0, java.lang.String p1, int p2, android.os.UserHandle p3) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public static android.content.pm.ApplicationInfo getApplicationInfoAsUser(android.content.pm.PackageManager p0, java.lang.String p1, android.content.pm.PackageManager.ApplicationInfoFlags p2, int p3) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public static android.content.ComponentName getHomeActivities(android.content.pm.PackageManager p0, java.util.List<android.content.pm.ResolveInfo> p1) { return null; }
    public static java.util.List<android.content.pm.ApplicationInfo> getInstalledApplicationsAsUser(android.content.pm.PackageManager p0, int p1, int p2) { return null; }
    public static java.util.List<android.content.pm.PackageInfo> getInstalledPackagesAsUser(android.content.pm.PackageManager p0, android.content.pm.PackageManager.PackageInfoFlags p1, int p2) { return null; }
    public static android.content.pm.PackageInfo getPackageInfoAsUser(android.content.pm.PackageManager p0, java.lang.String p1, android.content.pm.PackageManager.PackageInfoFlags p2, int p3) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public static void getPackageSizeInfo(android.content.pm.PackageManager p0, java.lang.String p1, com.oplus.wrapper.content.pm.IPackageStatsObserver p2) { }
    public static void getPackageSizeInfoAsUser(android.content.pm.PackageManager p0, java.lang.String p1, int p2, com.oplus.wrapper.content.pm.IPackageStatsObserver p3) { }
    public static int getPackageUidAsUser(android.content.pm.PackageManager p0, java.lang.String p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public static void grantRuntimePermission(android.content.pm.PackageManager p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3) { }
    public static int movePackage(android.content.pm.PackageManager p0, java.lang.String p1, com.oplus.wrapper.os.storage.VolumeInfo p2) { return 0; }
    public static final boolean performDexOptMode(java.lang.String p0, boolean p1, java.lang.String p2, boolean p3, boolean p4, java.lang.String p5) { return false; }
    public static java.util.List<android.content.pm.ResolveInfo> queryIntentActivitiesAsUser(android.content.pm.PackageManager p0, android.content.Intent p1, int p2, int p3) { return null; }
    public static java.util.List<android.content.pm.ResolveInfo> queryIntentActivitiesAsUser(android.content.pm.PackageManager p0, android.content.Intent p1, int p2, android.os.UserHandle p3) { return null; }
    public static void replacePreferredActivity(android.content.pm.PackageManager p0, android.content.IntentFilter p1, int p2, android.content.ComponentName[] p3, android.content.ComponentName p4) { }
    public static android.content.pm.ResolveInfo resolveActivityAsUser(android.content.pm.PackageManager p0, android.content.Intent p1, android.content.pm.PackageManager.ResolveInfoFlags p2, int p3) { return null; }
    public static java.lang.String[] setDistractingPackageRestrictions(android.content.pm.PackageManager p0, java.lang.String[] p1, int p2) { return null; }
    public static boolean shouldShowRequestPermissionRationale(android.content.pm.PackageManager p0, java.lang.String p1) { return false; }
    public void deleteApplicationCacheFiles(java.lang.String p0, com.oplus.wrapper.content.pm.IPackageDataObserver p1) { }
    public void deleteApplicationCacheFilesAsUser(java.lang.String p0, int p1, com.oplus.wrapper.content.pm.IPackageDataObserver p2) { }
    public void deletePackage(java.lang.String p0, com.oplus.wrapper.content.pm.IPackageDeleteObserver p1, int p2) { }
    public java.lang.String getAppPredictionServicePackageName() { return null; }
    public android.content.pm.ApplicationInfo getApplicationInfoAsUser(java.lang.String p0, int p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.ApplicationInfo getApplicationInfoAsUser(java.lang.String p0, android.content.pm.PackageManager.ApplicationInfoFlags p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0) { return null; }
    public java.util.List<android.content.pm.ApplicationInfo> getInstalledApplicationsAsUser(int p0, int p1) { return null; }
    public java.util.List<android.content.pm.PackageInfo> getInstalledPackagesAsUser(android.content.pm.PackageManager.PackageInfoFlags p0, int p1) { return null; }
    public android.content.pm.PackageInfo getPackageInfoAsUser(java.lang.String p0, android.content.pm.PackageManager.PackageInfoFlags p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public void getPackageSizeInfo(java.lang.String p0, com.oplus.wrapper.content.pm.IPackageStatsObserver p1) { }
    public void getPackageSizeInfoAsUser(java.lang.String p0, int p1, com.oplus.wrapper.content.pm.IPackageStatsObserver p2) { }
    public int getPackageUidAsUser(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { }
    public int movePackage(java.lang.String p0, com.oplus.wrapper.os.storage.VolumeInfo p1) { return 0; }
    public java.util.List<android.content.pm.ResolveInfo> queryIntentActivitiesAsUser(android.content.Intent p0, int p1, int p2) { return null; }
    public java.util.List<android.content.pm.ResolveInfo> queryIntentActivitiesAsUser(android.content.Intent p0, int p1, android.os.UserHandle p2) { return null; }
    public void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3) { }
    public android.content.pm.ResolveInfo resolveActivityAsUser(android.content.Intent p0, android.content.pm.PackageManager.ResolveInfoFlags p1, int p2) { return null; }
    public java.lang.String[] setDistractingPackageRestrictions(java.lang.String[] p0, int p1) { return null; }
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0) { return false; }
}
