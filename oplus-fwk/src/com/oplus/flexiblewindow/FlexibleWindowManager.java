package com.oplus.flexiblewindow;

public final class FlexibleWindowManager {
    private static final FlexibleWindowManager INSTANCE = new FlexibleWindowManager();

    private FlexibleWindowManager() {}

    public static FlexibleWindowManager getInstance() {
        return INSTANCE;
    }

    public void removeEmbeddedContainerTask(int taskId, int containerTaskId) {}
}
