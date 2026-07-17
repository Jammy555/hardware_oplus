package com.oplus.zoomwindow;

public class OplusZoomWindowManager {

    public static OplusZoomWindowManager sOplusZoomWindowManager = null;

    public static OplusZoomWindowManager getInstance() {
        if (sOplusZoomWindowManager == null) {
            sOplusZoomWindowManager = new OplusZoomWindowManager();
        }
        return sOplusZoomWindowManager;
    }

    public boolean registerZoomWindowObserver(IOplusZoomWindowObserver observer) {
        return false;
    }

    public boolean unregisterZoomWindowObserver(IOplusZoomWindowObserver observer) {
        return false;
    }

    public OplusZoomWindowInfo getCurrentZoomWindowState() {
        OplusZoomWindowInfo info = new OplusZoomWindowInfo();
        info.windowShown = false;
        return info;
    }

    public boolean isSupportZoomMode(String packageName, int uid, String tag, android.os.Bundle bundle) {
        return false;
    }

    public int startZoomWindow(android.content.Intent intent, android.os.Bundle bundle, int windowMode, String reason) {
        return 0;
    }
}
