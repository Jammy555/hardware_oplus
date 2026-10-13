package com.oplus.view.material;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public class OplusMaterialBaseParams {
    private Rect mInnerBounds;
    private int mMaskColor;

    public OplusMaterialBaseParams(int maskColor, Rect innerBounds) {
        this.mMaskColor = maskColor;
        this.mInnerBounds = innerBounds;
    }

    public int getMaskColor() {
        return this.mMaskColor;
    }

    public void setMaskColor(int maskColor) {
        this.mMaskColor = maskColor;
    }

    public Rect getInnerBounds() {
        return this.mInnerBounds;
    }

    public void setInnerBounds(Rect innerBounds) {
        this.mInnerBounds = innerBounds;
    }

    public String toString() {
        return "OplusMaterialBaseParams(maskColor=" + this.mMaskColor + ", innerBounds=" + this.mInnerBounds + ")";
    }
}
