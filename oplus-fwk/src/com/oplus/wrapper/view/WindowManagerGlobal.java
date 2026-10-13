package com.oplus.wrapper.view;

/* JADX INFO: loaded from: classes2.dex */
public class WindowManagerGlobal {
    private static WindowManagerGlobal sDefaultWindowManager;
    private final android.view.WindowManagerGlobal mWindowManagerGlobal = android.view.WindowManagerGlobal.getInstance();

    private WindowManagerGlobal() {
    }

    public static WindowManagerGlobal getInstance() {
        WindowManagerGlobal windowManagerGlobal;
        synchronized (WindowManagerGlobal.class) {
            if (sDefaultWindowManager == null) {
                sDefaultWindowManager = new WindowManagerGlobal();
            }
            windowManagerGlobal = sDefaultWindowManager;
        }
        return windowManagerGlobal;
    }

    public void trimMemory(int level) {
        this.mWindowManagerGlobal.trimMemory(level);
    }

    public void setRecentsAppBehindSystemBars(boolean behindSystemBars) {
        this.mWindowManagerGlobal.setRecentsAppBehindSystemBars(behindSystemBars);
    }
}
