package com.oplus.graphics;

import android.graphics.Path;
import android.graphics.RectF;

public class OplusPath {

    private final Path mPath;

    public OplusPath(Path path) {
        mPath = path;
    }

    public void addSmoothRoundRect(RectF rect, float rx, float ry, float weight,
            Path.Direction dir) {
        mPath.addRoundRect(rect, rx, ry, dir);
    }

    public void addSmoothRoundRect(RectF rect, float[] radii, Path.Direction dir, float weight) {
        mPath.addRoundRect(rect, radii, dir);
    }

    public void addSmoothRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, float p6, android.graphics.Path.Direction p7) { }
    public void addSmoothRoundRect(android.graphics.RectF p0, float p1, float p2, android.graphics.Path.Direction p3) { }
}
