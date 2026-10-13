package com.oplus.datasync;

public class OplusDataSyncManager {
    public static final java.lang.String MODULE_INTERCEPT_SCREEN_WINDOW = "module_intercept_screen_window";
    public static com.oplus.datasync.OplusDataSyncManager getInstance() { if (sStub == null) sStub = new OplusDataSyncManager(); return sStub; }
    public boolean registerSysStateChangeObserver(java.lang.String p0, com.oplus.datasync.ISysStateChangeCallback p1) { return false; }
    public boolean unregisterSysStateChangeObserver(java.lang.String p0, com.oplus.datasync.ISysStateChangeCallback p1) { return false; }
    public boolean updateAppData(java.lang.String p0, android.os.Bundle p1) { return false; }
    private OplusDataSyncManager() { }
    private static OplusDataSyncManager sStub;
}
