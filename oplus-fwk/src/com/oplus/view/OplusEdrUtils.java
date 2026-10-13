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
}
