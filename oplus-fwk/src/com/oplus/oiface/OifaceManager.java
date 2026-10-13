package com.oplus.oiface;

public class OifaceManager {
    public static final int APP_ENTER = 7;
    public static final int APP_PIP_CLOSED = 9;
    public static final int APP_PIP_OPENED = 8;
    public static final int APP_PIP_SWITCH = 10;
    public static final int BIND_CPU_CLUSTER_ALL = 0;
    public static final int CPU_CLUSTER_GOLD = 1;
    public static final int CPU_CLUSTER_PRIME = 3;
    public static final int CPU_CLUSTER_SILVER = 2;
    public static final int FPS_PER_SECOND = 0;
    public static final int FPS_RAW_DATA = 1;
    public static final int GPA_CPU_CLUSTER_GOLD = 2;
    public static final int GPA_CPU_CLUSTER_PRIME = 4;
    public static final int GPA_CPU_CLUSTER_SILVER = 1;
    public static final int NETWORK_STATUS_DATA = 2;
    public static final int NETWORK_STATUS_DATA_OFF = 3;
    public static final int NETWORK_STATUS_WIFI = 0;
    public static final int NETWORK_STATUS_WIFI_OFF = 1;
    public static final int PERF_MODE_NORMAL = 0;
    public static final int PERF_MODE_PERFORMANCE = 2;
    public static final int PERF_MODE_POWER_SAVE = 1;
    public static final int REGISTER_GAME_SCENE = 1;
    public static final int REGISTER_GAME_STATUS = 2;
    public static final int SCREEN_OFF = 0;
    public static final int SCREEN_ON = 1;
    public static final int THERMAL_TEMP_BACK = 2;
    public static final int THERMAL_TEMP_FRONT = 1;
    public static final int THERMAL_TEMP_GOLD = 16;
    public static final int THERMAL_TEMP_GPU = 64;
    public static final int THERMAL_TEMP_PRIME = 32;
    public static final int THERMAL_TEMP_SIDE = 4;
    public static final int THERMAL_TEMP_SILVER = 8;
    public static com.oplus.oiface.OifaceManager getInstance(java.lang.String p0) { if (sStub == null) sStub = new OifaceManager(); return sStub; }
    public boolean bindGameTask(int p0, int p1) { return false; }
    public boolean currentNetwork(int p0) { return false; }
    public boolean currentPkgStatus(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return false; }
    public boolean enableHQV(int p0) { return false; }
    public boolean enableHapticScreenCaptureService(int p0) { return false; }
    public java.lang.String generalOifaceSignal(java.lang.String p0) { return null; }
    public java.lang.String getAllLoadInfo(java.lang.String p0) { return null; }
    public float getBatteryCurrentNow() { return 0f; }
    public int getBatteryFCC() { return 0; }
    public int getBatteryRemain() { return 0; }
    public java.lang.String getChipName() { return null; }
    public long[] getCpuAvailableFreqTable(int p0) { return null; }
    public int[] getCpuClusterInfo() { return null; }
    public int getCpuClusterNum() { return 0; }
    public long[] getCpuCurrentFreq(int p0) { return null; }
    public long[] getCpuLimitedFreqs(int p0) { return null; }
    public float[] getCpuLoads(int p0) { return null; }
    public java.lang.String getCpuTimeInState() { return null; }
    public java.lang.String getCurrentGamePackage() { return null; }
    public java.lang.String getDeviceID() { return null; }
    public int getFPS(java.lang.String p0, int p1) { return 0; }
    public float[] getGPASystemInfo() { return null; }
    public int getGameModeStatus() { return 0; }
    public long[] getGpuAvailableFreqTable() { return null; }
    public long getGpuCurrentFreq() { return 0L; }
    public long[] getGpuLimitedFreqs() { return null; }
    public float getGpuLoad() { return 0f; }
    public java.lang.String[] getInstalledGameList() { return null; }
    public int getSuperVOOCStatus() { return 0; }
    public java.lang.String getSupportGameStartPackage() { return null; }
    public float[] getThermalTemps(int p0) { return null; }
    public boolean notifyScreenEvent(int p0) { return false; }
    public boolean oifaceControl(java.lang.String p0) { return false; }
    public boolean oifaceDecision(java.lang.String p0) { return false; }
    public boolean registerClientThroughCosa(com.oplus.oiface.IOIfaceCallback p0, java.lang.String p1, int p2, int p3) { return false; }
    public boolean registerGameRoleListener(int p0, java.lang.String p1, com.oplus.oiface.IOIfaceCallback p2) { return false; }
    public java.lang.String registerHQV(java.lang.String p0, int p1, java.lang.String p2) { return null; }
    public boolean registerNetworkListener(int p0, int p1, com.oplus.oiface.IOIfaceCallback p2) { return false; }
    public boolean registerOifaceCallback(com.oplus.oiface.IOIfaceCallback p0) { return false; }
    public void setCoolExFilterType(int p0, java.lang.String p1) { }
    public boolean setGCPEffectMode(int p0) { return false; }
    public void setGameModeStatus(int p0, java.lang.String p1) { }
    public java.lang.String setGeneralSignalCosa(java.lang.String p0, int p1, int p2) { return null; }
    public boolean setGyroscopeLevel(int p0) { return false; }
    public boolean setHalfHQV(int p0) { return false; }
    public void setInstalledGameList(java.lang.String[] p0) { }
    public boolean setPerfMode(int p0) { return false; }
    public boolean setTouchProtection(boolean p0) { return false; }
    public boolean setTouchResponsiveness(int p0) { return false; }
    public boolean setTouchSensibility(int p0) { return false; }
    public java.lang.String triggerFrameStat(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean unRegisterGameRoleListener(com.oplus.oiface.IOIfaceCallback p0) { return false; }
    private OifaceManager() { }
    private static OifaceManager sStub;
}
