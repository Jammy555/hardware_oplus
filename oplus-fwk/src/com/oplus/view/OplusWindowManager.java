package com.oplus.view;

public final class OplusWindowManager implements com.oplus.view.IOplusWindowManagerConstans {
    public static final java.lang.String TAG = "OplusWindowManager";
    public OplusWindowManager() { }
    public static void hideNavigationBarBackButton(android.view.Window p0, boolean p1) { }
    public static boolean isColorLight(int p0) { return false; }
    public static boolean isInMultiWindowMode() { return false; }
    public static boolean isUseLastStatusBarTint(android.view.WindowManager.LayoutParams p0) { return false; }
    public static void setCustomSystemBar(android.view.WindowManager.LayoutParams p0, boolean p1) { }
    public static void setFullScreenWindow(android.view.WindowManager.LayoutParams p0, boolean p1) { }
    public static void setHasNavigationBar(android.view.WindowManager.LayoutParams p0, boolean p1) { }
    public static void setHasStatusBar(android.view.WindowManager.LayoutParams p0, boolean p1) { }
    public static void setNavigationBarColor(android.view.WindowManager.LayoutParams p0, int p1, boolean p2) { }
    public static void setNoMoveAnimation(android.view.WindowManager.LayoutParams p0, boolean p1) { }
    public static void setSkipSystemUiVisibility(android.view.WindowManager.LayoutParams p0, boolean p1) { }
    public static void setSystemAppWindow(android.view.WindowManager.LayoutParams p0, boolean p1) { }
    public static void setUseInsetsAnimationThread(android.content.Context p0, android.view.WindowInsetsController p1, boolean p2) { }
    public static void setUseLastStatusBarTint(android.view.WindowManager.LayoutParams p0, boolean p1) { }
    public static boolean skipSystemUiVisibility(android.view.WindowManager.LayoutParams p0) { return false; }
    public static void syncSurfaceTransaction(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1, android.view.View p2) { }
    public static boolean updateDarkNavigationBar(android.view.WindowManager.LayoutParams p0) { return false; }
    public static boolean updateSpecialSystemBar(android.view.WindowManager.LayoutParams p0) { return false; }

    public static class LayoutParams extends com.oplus.view.IOplusWindowManagerConstans.BaseLayoutParams {
        public LayoutParams() { }
    }
}
