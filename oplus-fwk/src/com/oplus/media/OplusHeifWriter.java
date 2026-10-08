package com.oplus.media;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.FileDescriptor;

public class OplusHeifWriter {
    private static final String TAG = "OplusHeifWriter_Java";

    public static final int COLOR_FMT_YUV420Planar = 0;
    public static final int COLOR_FMT_P010 = 1;
    public static final int COLOR_FMT_RGBA8888 = 2;
    public static final int COLOR_FMT_NV12 = 3;
    public static final int COLOR_FMT_NV21 = 4;
    public static final int COLOR_FMT_MAX = 5;

    static {
        Log.v(TAG, "loadLibrary");
        System.loadLibrary("oplusheifwriter");
    }

    private long mNativeObject = nativeSetup();

    public static class Options {
        public byte[] fileExtender;
        public FileDescriptor gainmapFd;
        public long mcroVideoPresentationTimestampUs;
        public FileDescriptor videoFd;
        public String xmpData;
    }

    private static native long nativeSetup();

    private static native long nativeCreate(long nativeObject, int width, int height,
            int strideWidth, int strideHeight, int fmt, int quality, int rotation);

    private static native long nativeProcessHeicPhotoFrame(long nativeObject, byte[] yuvBuffer,
            byte[] exifData, FileDescriptor fd);

    private static native long nativeCreateLivePhoto(long nativeObject, byte[] yuvBuffer,
            byte[] exifData, FileDescriptor outFd, Options options);

    private static native long nativeCreateLivePhotoByBmp(long nativeObject, Bitmap bitmap,
            byte[] exifData, FileDescriptor outFd, Options options);

    private static native void nativeDestory(long nativeObject);

    public boolean createPrimaryImage(int width, int height, int strideWidth, int strideHeight,
            int fmt, int quality, int rotation) {
        if (quality <= 0 || quality > 100) {
            throw new IllegalArgumentException("quality range error");
        }
        if (width <= 0 || height <= 0 || strideWidth <= 0 || strideHeight <= 0
                || fmt < 0 || fmt >= COLOR_FMT_MAX) {
            Log.i(TAG, "Input param error.");
            return false;
        }
        long ret = nativeCreate(mNativeObject, width, height, strideWidth, strideHeight, fmt,
                quality, rotation);
        Log.i(TAG, "OplusHeifWriter start! quality: " + quality);
        return ret >= 0;
    }

    public boolean processPrimaryImage(byte[] yuvBuffer, byte[] exifData, FileDescriptor fd) {
        return nativeProcessHeicPhotoFrame(mNativeObject, yuvBuffer, exifData, fd) >= 0;
    }

    public boolean processPrimaryLivePhoto(byte[] yuvBuffer, byte[] exifData,
            FileDescriptor outFd, Options opts) {
        long ret = nativeCreateLivePhoto(mNativeObject, yuvBuffer, exifData, outFd, opts);
        if (ret < 0) {
            Log.i(TAG, "processPrimaryLivePhoto failed!");
            return false;
        }
        return true;
    }

    public boolean processPrimaryLivePhoto(Bitmap bmp, byte[] exifData,
            FileDescriptor outFd, Options opts) {
        long ret = nativeCreateLivePhotoByBmp(mNativeObject, bmp, exifData, outFd, opts);
        if (ret < 0) {
            Log.i(TAG, "processPrimaryLivePhoto failed!");
            return false;
        }
        return true;
    }

    public void destory() {
        if (mNativeObject != 0) {
            Log.i(TAG, "OplusHeifWriter destory!");
            nativeDestory(mNativeObject);
            mNativeObject = 0L;
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            destory();
        } finally {
            super.finalize();
        }
    }
}