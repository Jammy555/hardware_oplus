package com.oplus.eventhub.sdk.aidl;

public class EventRequestConfig implements android.os.Parcelable {
    public static android.os.Parcelable.Creator<com.oplus.eventhub.sdk.aidl.EventRequestConfig> CREATOR;
    public EventRequestConfig(android.os.Parcel p0) { }
    public EventRequestConfig(android.util.ArraySet<com.oplus.eventhub.sdk.aidl.DeviceEvent> p0) { }
    public int describeContents() { return 0; }
    public java.util.HashSet<java.lang.Integer> getAllEvents() { return null; }
    public android.util.ArraySet<com.oplus.eventhub.sdk.aidl.DeviceEvent> getDeviceEventSet() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
