package com.oplus.zoomwindow;

import android.os.Parcel;
import android.os.Parcelable;

public class OplusZoomWindowInfo implements Parcelable {

    public boolean windowShown;

    public static final Parcelable.Creator<OplusZoomWindowInfo> CREATOR =
            new Parcelable.Creator<OplusZoomWindowInfo>() {

        @Override
        public OplusZoomWindowInfo createFromParcel(Parcel source) {
            return new OplusZoomWindowInfo(source);
        }

        @Override
        public OplusZoomWindowInfo[] newArray(int size) {
            return new OplusZoomWindowInfo[size];
        }
    };

    public OplusZoomWindowInfo() {}

    public OplusZoomWindowInfo(Parcel in) {}

    public OplusZoomWindowInfo(OplusZoomWindowInfo in) {}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {}

    public void readFromParcel(Parcel in) {}

    public java.lang.String cpnName;
    public android.os.Bundle extension;
    public int inputMethodType;
    public boolean inputShow;
    public int lastExitMethod;
    public java.lang.String lockPkg;
    public int lockUserId;
    public int rotation;
    public java.lang.String zoomPkg;
    public android.graphics.Rect zoomRect;
    public int zoomUserId;
}
