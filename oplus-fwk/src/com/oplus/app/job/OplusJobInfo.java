package com.oplus.app.job;

public class OplusJobInfo {
    public static final int PRIORITY_BACKGROUND = 0;
    public static final int PRIORITY_DEFAULT = 1;
    public static final int PRIORITY_USER_INITIALED = 2;
    public static int PROTECT_FORE_FRAME;
    public static int PROTECT_FORE_NET;
    public static int SCENE_MODE_GAME;
    public static int SCENE_MODE_VIDEO;
    public static int SCENE_MODE_VIDEO_CALL;
    public static final int WORK_TYPE_CPU = 1;
    public static final int WORK_TYPE_IO = 2;
    public static final int WORK_TYPE_NETWORK = 8;
    public static final int WORK_TYPE_NONE = 0;
    public static final int WORK_TYPE_RAM = 4;

    public final static class Builder {
        public Builder(android.app.job.JobInfo.Builder p0) { }
        public java.lang.String getExtraStr() { return null; }
        public boolean getHasCpuConstraint() { return false; }
        public boolean getHasTemperatureConstraint() { return false; }
        public boolean getRequiresBattIdle() { return false; }
        public boolean getRequiresProtectFore() { return false; }
        public boolean getRequiresProtectScene() { return false; }
        public boolean isExtraJob() { return false; }
        public void setExtraJob(boolean p0) { }
        public void setExtraStr(java.lang.String p0) { }
        public void setHasCpuConstraint(boolean p0) { }
        public void setHasTemperatureConstraint(boolean p0) { }
        public void setPriority(int p0) { }
        public void setRequiresBattIdle(boolean p0) { }
        public void setRequiresChargingRestriction(boolean p0) { }
        public void setRequiresProtectFore(boolean p0) { }
        public void setRequiresProtectFore(boolean p0, int p1) { }
        public void setRequiresProtectScene(boolean p0, int p1) { }
        public void setWorkType(int p0) { }
    }
}
