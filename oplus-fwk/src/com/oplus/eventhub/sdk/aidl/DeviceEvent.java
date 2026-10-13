package com.oplus.eventhub.sdk.aidl;

public class DeviceEvent implements android.os.Parcelable {
    public static android.os.Parcelable.Creator<com.oplus.eventhub.sdk.aidl.DeviceEvent> CREATOR;
    public DeviceEvent(android.os.Parcel p0) { }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getEventStateType() { return 0; }
    public int getEventType() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }

    public static class Builder {
        public Builder() { }
        public com.oplus.eventhub.sdk.aidl.DeviceEvent build() { return null; }
        public com.oplus.eventhub.sdk.aidl.DeviceEvent.Builder setEventStateType(int p0) { return null; }
        public com.oplus.eventhub.sdk.aidl.DeviceEvent.Builder setEventType(int p0) { return null; }
    }
}
