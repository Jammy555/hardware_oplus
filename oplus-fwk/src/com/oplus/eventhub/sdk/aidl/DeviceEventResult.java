package com.oplus.eventhub.sdk.aidl;

public class DeviceEventResult implements android.os.Parcelable {
    public static android.os.Parcelable.Creator<com.oplus.eventhub.sdk.aidl.DeviceEventResult> CREATOR;
    public DeviceEventResult(int p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) { }
    public DeviceEventResult(android.os.Parcel p0) { }
    public int describeContents() { return 0; }
    public int getEventStateType() { return 0; }
    public int getEventType() { return 0; }
    public android.os.Bundle getExtraData() { return null; }
    public int getPid() { return 0; }
    public java.lang.String getPkgName() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
