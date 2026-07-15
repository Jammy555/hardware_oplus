package com.oplus.splitscreen;

import com.oplus.app.IOplusSplitScreenObserver;

public final class OplusSplitScreenManager {
    private static final OplusSplitScreenManager INSTANCE = new OplusSplitScreenManager();

    private OplusSplitScreenManager() {}

    public static OplusSplitScreenManager getInstance() {
        return INSTANCE;
    }

    public boolean unregisterSplitScreenObserver(IOplusSplitScreenObserver observer) {
        return false;
    }
}
