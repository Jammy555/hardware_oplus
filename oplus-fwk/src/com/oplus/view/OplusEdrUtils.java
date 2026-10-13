package com.oplus.view;

import android.graphics.Rect;
import android.view.SurfaceControl;
import android.view.SurfaceView;

public final class OplusEdrUtils {

    public static SurfaceControl getBlastSurfaceControl(SurfaceView surfaceView) {
        return null;
    }

    public static boolean setEdrFlags(SurfaceControl surfaceControl,
            SurfaceControl.Transaction transaction, int flags) {
        return false;
    }

    public static class OplusEdrParameters {
        public int[] displayPosition;
        public Rect displayRect;
        public float[] displayTransform;
        public int imageRotation;
    }

    public static int getDolbyEdrVersion() { return 0; }
    public static int getEdrFeatureVersion(int p0) { return 0; }
    public static int getLocalHdrVersion() { return 0; }
    public static android.view.SurfaceControl getSurfaceControl(android.view.View p0) { return null; }
    public static boolean setEdrAuxiliaryImage(android.view.SurfaceControl p0, android.view.SurfaceControl.Transaction p1, android.graphics.Bitmap p2, int p3) { return false; }
    public static boolean setEdrImageMetadata(android.view.SurfaceControl p0, android.view.SurfaceControl.Transaction p1, byte[] p2, int p3) { return false; }
    public static boolean setEdrImageSize(android.view.SurfaceControl p0, android.view.SurfaceControl.Transaction p1, android.util.Size p2, int p3) { return false; }
    public static boolean setEdrViewTransform(android.view.SurfaceControl p0, android.view.SurfaceControl.Transaction p1, com.oplus.view.OplusEdrUtils.OplusEdrParameters p2, int p3) { return false; }
}
