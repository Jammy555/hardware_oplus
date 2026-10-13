package com.oplus.splitscreen;

import com.oplus.app.IOplusSplitScreenObserver;

public class OplusSplitScreenManager {

    private static OplusSplitScreenManager sInstance;

    public static OplusSplitScreenManager getInstance() {
        if (sInstance == null) {
            sInstance = new OplusSplitScreenManager();
        }
        return sInstance;
    }

    public boolean unregisterSplitScreenObserver(IOplusSplitScreenObserver observer) {
        return false;
    }

    public boolean isInSplitScreenMode() { return false; }
    public boolean registerSplitScreenObserver(com.oplus.app.IOplusSplitScreenObserver p0) { return false; }
}
