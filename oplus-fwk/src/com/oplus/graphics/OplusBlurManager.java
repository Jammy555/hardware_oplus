package com.oplus.graphics;

import android.view.SurfaceControl;
import android.view.View;

public class OplusBlurManager {
    private OplusBlurManager() {
    }

    public static void setBackgroundBlurRadius(
            SurfaceControl.Transaction transaction, SurfaceControl sc, int radius) {
        if (transaction != null && sc != null) {
            transaction.setBackgroundBlurRadius(sc, radius);
        }
    }

    public static void setBackgroundBlurRadius(
            SurfaceControl.Transaction transaction, SurfaceControl sc, int radius,
            OplusBlurParam params) {
        setBackgroundBlurRadius(transaction, sc, radius);
    }

    public static void setBackgroundBlurRadius(View view, int radius, OplusBlurParam params) {
    }
}
