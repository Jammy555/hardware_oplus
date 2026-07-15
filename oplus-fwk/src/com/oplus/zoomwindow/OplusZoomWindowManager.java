package com.oplus.zoomwindow;

import android.content.Intent;
import android.os.Bundle;

public class OplusZoomWindowManager {

    private static OplusZoomWindowManager sOplusZoomWindowManager;

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
        return null;
    }

    public boolean isSupportZoomMode(String packageName, int displayId,
            String activityName, Bundle extra) {
        return false;
    }

    public int startZoomWindow(Intent intent, Bundle options,
            int displayId, String callerPkg) {
        return 0;
    }
}
