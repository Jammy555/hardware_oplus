package com.oplus.screenshot;

public class OplusLongshotDump implements android.os.Parcelable {
    public static android.os.Parcelable.Creator<com.oplus.screenshot.OplusLongshotDump> CREATOR;
    public static boolean DBG;
    public static final java.lang.String JSON_POSTFIX_LIST = "_list";
    public static final java.lang.String JSON_POSTFIX_RECT = "_rect";
    public static final java.lang.String JSON_PREFIX_CHILD = "child_";
    public static final java.lang.String JSON_PREFIX_PARENT = "parent_";
    public static final java.lang.String JSON_PREFIX_SCROLL = "scroll_";
    public static final java.lang.String JSON_PREFIX_WINDOW = "window_";
    public static final java.lang.String TAG = "LongshotDump";
    public OplusLongshotDump() { }
    public OplusLongshotDump(android.os.Parcel p0) { }
    public int describeContents() { return 0; }
    public int getDumpCount() { return 0; }
    public long getTotalSpend() { return 0L; }
    public void readFromParcel(android.os.Parcel p0) { }
    public void setDumpCount(int p0) { }
    public void setScrollComponent(com.oplus.screenshot.OplusLongshotComponentName p0) { }
    public void setScrollCount(int p0) { }
    public void setScrollRect(android.graphics.Rect p0) { }
    public void setSpendCalc(long p0) { }
    public void setSpendDump(long p0) { }
    public void setSpendPack(long p0) { }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
