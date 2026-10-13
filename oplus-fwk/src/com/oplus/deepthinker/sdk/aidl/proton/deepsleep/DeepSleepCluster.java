package com.oplus.deepthinker.sdk.aidl.proton.deepsleep;

public class DeepSleepCluster implements android.os.Parcelable,java.lang.Cloneable {
    public static final int ANOMALY_TYPE = -1;
    public static android.os.Parcelable.Creator<com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster> CREATOR;
    public DeepSleepCluster(double p0, double p1) { }
    public DeepSleepCluster(double p0, double p1, double p2) { }
    public DeepSleepCluster(double p0, double p1, double p2, double p3, double p4, double p5) { }
    public DeepSleepCluster(int p0, double p1, double p2, double p3) { }
    public com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster clone() { return null; }
    public int describeContents() { return 0; }
    public int getClusterId() { return 0; }
    public int getClusterNum() { return 0; }
    public double getMaxDistance() { return 0d; }
    public double getSleepMaxValue() { return 0d; }
    public double getSleepMinValue() { return 0d; }
    public double getSleepTimePeriod() { return 0d; }
    public double getWakeMaxValue() { return 0d; }
    public double getWakeMinValue() { return 0d; }
    public double getWakeTimePeriod() { return 0d; }
    public void setClusterId(int p0) { }
    public void setClusterNum(int p0) { }
    public void setMaxDistance(double p0) { }
    public void setSleepTimePeriod(double p0) { }
    public void setWakeTimePeriod(double p0) { }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
