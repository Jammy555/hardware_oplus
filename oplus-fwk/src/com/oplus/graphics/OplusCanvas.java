package com.oplus.graphics;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class OplusCanvas {
    private final Canvas canvas;

    public OplusCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public void drawSmoothRoundRect(
            float left, float top, float right, float bottom, float radiusX, float radiusY,
            Paint paint, float weight) {
        canvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint);
    }

    public void drawSmoothRoundRect(RectF rect, float radiusX, float radiusY, Paint paint,
            float weight) {
        canvas.drawRoundRect(rect, radiusX, radiusY, paint);
    }
}
