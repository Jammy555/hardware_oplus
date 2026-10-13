package com.oplus.miragewindow;

public class OplusMirageDisplayCastInfo implements android.os.Parcelable {
    public static android.os.Parcelable.Creator<com.oplus.miragewindow.OplusMirageDisplayCastInfo> CREATOR;
    public static final int OPLUS_MIRAGE_APP_KEEP_MODE = 7;
    public static final int OPLUS_MIRAGE_APP_SHARE_MODE = 3;
    public static final int OPLUS_MIRAGE_BACKGROUND_STREAM_MODE = 4;
    public static final int OPLUS_MIRAGE_BASE_DISPLAY_ID = 2020;
    public static final int OPLUS_MIRAGE_CAR_MODE = 5;
    public static final int OPLUS_MIRAGE_DEFAULT_MODE = 0;
    public static final int OPLUS_MIRAGE_PAD_MODE = 8;
    public static final int OPLUS_MIRAGE_PC_GAME_MODE = 6;
    public static final int OPLUS_MIRAGE_PC_MODE = 2;
    public static final int OPLUS_MIRAGE_TV_MODE = 1;
    public int castFlag;
    public int castMode;
    public int displayId;
    public android.os.Bundle extension;
    public int flag;
    public int height;
    public int[] stackIds;
    public int[] taskIds;
    public int width;
    public OplusMirageDisplayCastInfo() { }
    public OplusMirageDisplayCastInfo(android.os.Parcel p0) { }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
