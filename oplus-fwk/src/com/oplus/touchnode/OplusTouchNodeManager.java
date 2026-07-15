package com.oplus.touchnode;

public final class OplusTouchNodeManager {
    private static final OplusTouchNodeManager INSTANCE = new OplusTouchNodeManager();

    private OplusTouchNodeManager() {}

    public static OplusTouchNodeManager getInstance() {
        return INSTANCE;
    }

    public boolean writeNodeFileByDevice(int deviceId, int nodeFlag, String value) {
        return false;
    }
}
