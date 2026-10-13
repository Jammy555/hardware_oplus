package com.oplus.app;

import android.graphics.Rect;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.SurfaceControl;

/* JADX INFO: loaded from: classes.dex */
public class OplusScreenShotOptions implements Parcelable {
    public static final Parcelable.Creator<OplusScreenShotOptions> CREATOR = new Parcelable.Creator<OplusScreenShotOptions>() { // from class: com.oplus.app.OplusScreenShotOptions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OplusScreenShotOptions createFromParcel(Parcel source) {
            return new OplusScreenShotOptions(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OplusScreenShotOptions[] newArray(int size) {
            return new OplusScreenShotOptions[size];
        }
    };
    public int mDisplayId;
    public SurfaceControl[] mExcludeLayers;
    public IBinder[] mExcludeWindows;
    public boolean mFullDisplay;
    public SurfaceControl mLayer;
    public float mScaleIndex;
    public Rect mSourceCrop;
    public int[] mTasks;

    public OplusScreenShotOptions() {
        this.mDisplayId = 0;
        this.mScaleIndex = -1.0f;
    }

    public OplusScreenShotOptions(OplusScreenShotOptions options) {
        this.mDisplayId = 0;
        this.mScaleIndex = -1.0f;
        this.mLayer = options.mLayer;
        this.mExcludeLayers = options.mExcludeLayers;
        this.mExcludeWindows = options.mExcludeWindows;
        this.mSourceCrop = options.mSourceCrop;
        this.mFullDisplay = options.mFullDisplay;
        this.mTasks = options.mTasks;
        this.mDisplayId = options.mDisplayId;
        this.mScaleIndex = options.mScaleIndex;
    }

    private OplusScreenShotOptions(Parcel source) {
        this.mDisplayId = 0;
        this.mScaleIndex = -1.0f;
        int taskSize = source.readInt();
        if (taskSize > 0) {
            this.mTasks = new int[taskSize];
            source.readIntArray(this.mTasks);
        }
        int layerFlag = source.readInt();
        if (layerFlag > 0) {
            this.mLayer = (SurfaceControl) source.readTypedObject(SurfaceControl.CREATOR);
        }
        int excludeLayersSize = source.readInt();
        if (excludeLayersSize > 0) {
            this.mExcludeLayers = new SurfaceControl[excludeLayersSize];
            source.readTypedArray(this.mExcludeLayers, SurfaceControl.CREATOR);
        }
        this.mExcludeWindows = source.createBinderArray();
        this.mSourceCrop = (Rect) source.readParcelable(null);
        this.mFullDisplay = source.readBoolean();
        this.mDisplayId = source.readInt();
        this.mScaleIndex = source.readFloat();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        if (this.mTasks != null) {
            int taskSize = this.mTasks.length;
            dest.writeInt(taskSize);
            dest.writeIntArray(this.mTasks);
        } else {
            dest.writeInt(0);
        }
        if (this.mLayer != null) {
            dest.writeInt(1);
            dest.writeTypedObject(this.mLayer, 0);
        } else {
            dest.writeInt(0);
        }
        if (this.mExcludeLayers != null) {
            int layerSize = this.mExcludeLayers.length;
            dest.writeInt(layerSize);
            dest.writeTypedArray(this.mExcludeLayers, 0);
        } else {
            dest.writeInt(0);
        }
        dest.writeBinderArray(this.mExcludeWindows);
        dest.writeParcelable(this.mSourceCrop, 0);
        dest.writeBoolean(this.mFullDisplay);
        dest.writeInt(this.mDisplayId);
        dest.writeFloat(this.mScaleIndex);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OplusScreenShotOptions { ");
        sb.append("mLayer = " + this.mLayer);
        sb.append(", mExcludeLayers = " + this.mExcludeLayers);
        sb.append(", mExcludeWindows = " + this.mExcludeWindows);
        sb.append(", mTasks = " + this.mTasks);
        sb.append(", mSourceCrop = " + this.mSourceCrop);
        sb.append(", mFullDisplay = " + this.mFullDisplay);
        sb.append(", mDisplayId = " + this.mDisplayId);
        sb.append(", mScaleIndex = " + this.mScaleIndex);
        sb.append("}");
        return sb.toString();
    }
}
