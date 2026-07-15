package com.oplus.app;

import android.os.Parcel;
import android.os.Parcelable;

public class OplusAppInfo implements Parcelable {

    public OplusAppInfo() {}

    public static final Parcelable.Creator<OplusAppInfo> CREATOR =
            new Parcelable.Creator<OplusAppInfo>() {
        @Override
        public OplusAppInfo createFromParcel(Parcel in) {
            return new OplusAppInfo();
        }

        @Override
        public OplusAppInfo[] newArray(int size) {
            return new OplusAppInfo[size];
        }
    };

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {}
}
