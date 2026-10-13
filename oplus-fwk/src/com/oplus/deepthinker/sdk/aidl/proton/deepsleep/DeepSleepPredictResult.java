package com.oplus.deepthinker.sdk.aidl.proton.deepsleep;

public class DeepSleepPredictResult implements android.os.Parcelable {
    public static android.os.Parcelable.Creator<com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepPredictResult> CREATOR;
    public DeepSleepPredictResult(com.oplus.deepthinker.sdk.aidl.proton.deepsleep.PredictResultType p0, java.util.List<com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster> p1) { }
    public int describeContents() { return 0; }
    public java.util.List<com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster> getDeepSleepClusterList() { return null; }
    public com.oplus.deepthinker.sdk.aidl.proton.deepsleep.PredictResultType getResultType() { return null; }
    public void setClusterList(java.util.List<com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepCluster> p0) { }
    public void setResultType(com.oplus.deepthinker.sdk.aidl.proton.deepsleep.PredictResultType p0) { }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
