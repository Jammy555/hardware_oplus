package com.oplus.miragewindow;

public class OplusMirageWindowManager {
    public static final int DISPLAY_ID = 2020;
    public static final java.lang.String DISPLAY_NAME = "Mirage_display";
    public static final int FLAG_MASK = 65535;
    public static final int FLAG_POWER_SAVE = 1;
    public static final int FLAG_PRIVACY_IGNORE_SECURE = 128;
    public static final int FLAG_PRIVACY_PROTECTION = 16;
    public static final int FLAG_PRIVACY_PROTECTION_SHARE = 64;
    public static final java.lang.String IS_DEFAULT = "is_default";
    public static final int MODE_MASK = -65536;
    public static final int MODE_MIRROR_CAST = 16777216;
    public static final int MODE_SINGLE_APP_CAST = 33554432;
    public static final float Mirage_CORNER_RADIUS = 30.0f;
    public static com.oplus.miragewindow.OplusMirageWindowManager getInstance() { if (sStub == null) sStub = new OplusMirageWindowManager(); return sStub; }
    public void addCastScreenState(com.oplus.miragewindow.OplusCastScreenState p0) { }
    public int createMirageDisplay(android.view.Surface p0) { return 0; }
    public int createVirtualDisplayDevice(android.os.Bundle p0) { return 0; }
    public void expandToFullScreen() { }
    public void feedbackUserSelection(int p0, int p1, android.os.Bundle p2) { }
    public java.util.List<com.oplus.miragewindow.OplusCastScreenState> getCastScreenStateList() { return null; }
    public int getDisplayIdForPackageName(java.lang.String p0) { return 0; }
    public int getMirageDisplayCastMode(int p0) { return 0; }
    public com.oplus.miragewindow.OplusMirageWindowInfo getMirageWindowInfo() { return null; }
    public android.os.Bundle getSystemCapabilities(int p0) { return null; }
    public android.os.Bundle getTaskInfo(android.content.ComponentName p0) { return null; }
    public boolean isMirageWindowShow() { return false; }
    public boolean isSupportMirageWindowMode() { return false; }
    public void moveTaskToDisplay(int p0, int p1, boolean p2) { }
    public boolean rebindDisplayIfNeeded(int p0, int p1) { return false; }
    public boolean registerCastScreenStateObserver(com.oplus.miragewindow.IOplusCastScreenStateObserver p0) { return false; }
    public boolean registerMirageDisplayObserver(com.oplus.miragewindow.IOplusMirageDisplayObserver p0) { return false; }
    public boolean registerMirageWindowObserver(com.oplus.miragewindow.IOplusMirageWindowObserver p0) { return false; }
    public void releaseVirtualDisplayDevice(int p0) { }
    public void removeCastScreenState() { }
    public void sendMirageEvents(int p0, android.os.Bundle p1) { }
    public void setMirageDisplayId(int p0) { }
    public void setMirageDisplaySurfaceById(int p0, android.view.Surface p1) { }
    public void setMirageDisplaySurfaceByMode(int p0, android.view.Surface p1) { }
    public void setMirageDisplayUserRotation(int p0, int p1, android.os.Bundle p2) { }
    public void setMirageWindowSilent(java.lang.String p0) { }
    public int startMirageWindowMode(android.content.Intent p0, android.os.Bundle p1) { return 0; }
    public void startMirageWindowMode(android.content.ComponentName p0, int p1, int p2, android.os.Bundle p3) { }
    public void stopMirageWindowMode() { }
    public void stopMirageWindowMode(android.os.Bundle p0) { }
    public boolean unregisterCastScreenStateObserver(com.oplus.miragewindow.IOplusCastScreenStateObserver p0) { return false; }
    public boolean unregisterMirageDisplayObserver(com.oplus.miragewindow.IOplusMirageDisplayObserver p0) { return false; }
    public boolean unregisterMirageWindowObserver(com.oplus.miragewindow.IOplusMirageWindowObserver p0) { return false; }
    public boolean updateCarModeMultiLaunchWhiteList(java.lang.String p0) { return false; }
    public void updateExistingDisplayInfo(android.os.Bundle p0) { }
    public boolean updateMirageWindowCastFlag(int p0) { return false; }
    public boolean updateMirageWindowCastFlag(int p0, android.os.Bundle p1) { return false; }
    public boolean updatePrivacyProtectionList(java.util.List<java.lang.String> p0, boolean p1) { return false; }
    public boolean updatePrivacyProtectionList(java.util.List<java.lang.String> p0, boolean p1, boolean p2, android.os.Bundle p3) { return false; }
    private OplusMirageWindowManager() { }
    private static OplusMirageWindowManager sStub;
}
