package com.oplus.deepthinker.sdk.aidl.proton.deepsleep;

public class TotalPredictResult implements android.os.Parcelable {
    public static android.os.Parcelable.Creator<com.oplus.deepthinker.sdk.aidl.proton.deepsleep.TotalPredictResult> CREATOR;
    public TotalPredictResult(com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster p0, com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster p1) { }
    public TotalPredictResult(com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster p0, com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster p1, com.oplus.deepthinker.sdk.aidl.proton.deepsleep.TrainConfig p2, com.oplus.deepthinker.sdk.aidl.proton.deepsleep.TrainConfig p3) { }
    public int describeContents() { return 0; }
    public com.oplus.deepthinker.sdk.aidl.proton.deepsleep.TrainConfig getOptimalSleepConfig() { return null; }
    public com.oplus.deepthinker.sdk.aidl.proton.deepsleep.TrainConfig getOptimalWakeConfig() { return null; }
    public com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster getSleepCluster() { return null; }
    public com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster getWakeCluster() { return null; }
    public void setOptimalSleepConfig(com.oplus.deepthinker.sdk.aidl.proton.deepsleep.TrainConfig p0) { }
    public void setOptimalWakeConfig(com.oplus.deepthinker.sdk.aidl.proton.deepsleep.TrainConfig p0) { }
    public void setSleepCluster(com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster p0) { }
    public void setWakeCluster(com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster p0) { }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
