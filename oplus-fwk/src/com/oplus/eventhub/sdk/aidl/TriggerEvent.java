package com.oplus.eventhub.sdk.aidl;

public class TriggerEvent implements android.os.Parcelable {
    public static android.os.Parcelable.Creator<com.oplus.eventhub.sdk.aidl.TriggerEvent> CREATOR;
    public static final java.lang.String EXTRA_ELAPSED_TIME = "elapsed_real_time";
    public static final java.lang.String EXTRA_TYPE = "type";
    public static final java.lang.String EXTRA_UID = "uid";
    public static final java.lang.String GAME_SCENE_ID = "scene_id";
    public static final int INPUT_ACTIVITY_PAUSED = 30;
    public static final int INPUT_ACTIVITY_RESUMED = 11;
    public static final int INPUT_CAMERA_START = 18;
    public static final int INPUT_CAMERA_STOP = 19;
    public static final int INPUT_FILE_DOWNLOAD_START = 31;
    public static final int INPUT_FILE_DOWNLOAD_STOP = 32;
    public static final int INPUT_GAME_SCENE = 37;
    public static final java.lang.String INPUT_GPS_EXTRA_HASH = "location_receiver_hash";
    public static final int INPUT_GPS_OFF = 15;
    public static final int INPUT_GPS_ON = 14;
    public static final int INPUT_LOCATION_REQUEST_OFF = 13;
    public static final int INPUT_LOCATION_REQUEST_ON = 12;
    public static final int INPUT_NOTIFY_POSTED = 28;
    public static final int INPUT_NOTIFY_REMOVED = 29;
    public static final int INPUT_PROCESS_DIED = 22;
    public static final int INPUT_PROCESS_FRONT = 21;
    public static final int INPUT_SENSOR_START = 16;
    public static final int INPUT_SENSOR_STOP = 17;
    public static final int INPUT_VIDEO_START = 26;
    public static final int INPUT_VIDEO_STOP = 27;
    public static final int INPUT_WAKELOCK_ACQUIRED = 24;
    public static final int INPUT_WAKELOCK_RELEASED = 25;
    public TriggerEvent(int p0, int p1, java.lang.String p2, android.os.Bundle p3) { }
    public TriggerEvent(android.os.Parcel p0) { }
    public int describeContents() { return 0; }
    public int getEventId() { return 0; }
    public android.os.Bundle getExtraData() { return null; }
    public int getPid() { return 0; }
    public java.lang.String getPkgName() { return null; }
    public void setExtraData(android.os.Bundle p0) { }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
