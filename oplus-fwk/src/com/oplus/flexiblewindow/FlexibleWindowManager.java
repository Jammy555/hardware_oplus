package com.oplus.flexiblewindow;

import android.app.Activity;

public class FlexibleWindowManager {

    private static FlexibleWindowManager sInstance;

    public static FlexibleWindowManager getInstance() {
        if (sInstance == null) {
            sInstance = new FlexibleWindowManager();
        }
        return sInstance;
    }

    public void removeEmbeddedContainerTask(int taskId, int flags) {}

    public int getFlexibleWindowState(Activity activity) {
        return 0;
    }

    public static boolean isFlexibleActivity(android.content.res.Configuration p0) { return false; }
    public static boolean isFlexibleActivitySuitable(android.content.res.Configuration p0) { return false; }
    public android.os.Bundle setExtraBundle(android.app.ActivityOptions p0, android.os.Bundle p1) { return null; }
}
