package com.oplus.touchnode;

public class OplusTouchNodeManager {

    private static OplusTouchNodeManager sInstance;

    public static OplusTouchNodeManager getInstance() {
        if (sInstance == null) {
            sInstance = new OplusTouchNodeManager();
        }
        return sInstance;
    }

    public boolean writeNodeFileByDevice(int deviceId, int nodeFlag, String info) {
        return false;
    }

    public boolean writeNodeFile(int p0, java.lang.String p1) { return false; }
}
