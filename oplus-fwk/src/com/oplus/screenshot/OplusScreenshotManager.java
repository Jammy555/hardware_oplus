package com.oplus.screenshot;

public final class OplusScreenshotManager {
    public static final java.lang.String GLOBAL_ACTION_VISIBLE = "global_action_visible";
    public static final java.lang.String NAVIGATIONBAR_VISIBLE = "navigationbar_visible";
    public static final java.lang.String SCREENSHOT_DIRECTION = "screenshot_direction";
    public static final java.lang.String SCREENSHOT_ORIENTATION = "screenshot_orientation";
    public static final java.lang.String SCREENSHOT_SOURCE = "screenshot_source";
    public static final java.lang.String STATUSBAR_VISIBLE = "statusbar_visible";
    public static com.oplus.screenshot.OplusScreenshotManager getInstance() { if (sStub == null) sStub = new OplusScreenshotManager(); return sStub; }
    public static com.oplus.screenshot.OplusScreenshotManager peekInstance() { if (sStub == null) sStub = new OplusScreenshotManager(); return sStub; }
    public int getRatation() { return 0; }
    public boolean isLaunching() { return false; }
    public boolean isLongshotDisabled() { return false; }
    public boolean isLongshotEnabled() { return false; }
    public boolean isLongshotMode() { return false; }
    public boolean isScreenshotEdit() { return false; }
    public boolean isScreenshotEnabled() { return false; }
    public boolean isScreenshotMode() { return false; }
    public boolean isScreenshotSupported() { return false; }
    public void notifyOverScroll(com.oplus.screenshot.OplusLongshotEvent p0) { }
    public void reportLongshotDumpResult(com.oplus.screenshot.OplusLongshotDump p0) { }
    public void setFixedRotationLaunchingAppUnchecked(boolean p0, int p1) { }
    public void setLongshotEnabled(boolean p0) { }
    public void setScreenshotEnabled(boolean p0) { }
    public void stopLongshot() { }
    public void takeLongshot(boolean p0, boolean p1) { }
    public void takeScreenshot(android.os.Bundle p0) { }
    private OplusScreenshotManager() { }
    private static OplusScreenshotManager sStub;
}
