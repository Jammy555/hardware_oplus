package com.oplus.eventhub.sdk.aidl;

public class EventConfig implements android.os.Parcelable {
    public static android.os.Parcelable.Creator<com.oplus.eventhub.sdk.aidl.EventConfig> CREATOR;
    public EventConfig(android.os.Parcel p0) { }
    public EventConfig(java.util.HashSet<com.oplus.eventhub.sdk.aidl.Event> p0) { }
    public void addEvent(com.oplus.eventhub.sdk.aidl.Event p0) { }
    public int describeContents() { return 0; }
    public java.util.Set<java.lang.Integer> getAllEvents() { return null; }
    public java.util.Set<com.oplus.eventhub.sdk.aidl.Event> getEventSet() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
