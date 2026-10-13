package com.oplus.view.material;

/* JADX INFO: loaded from: classes2.dex */
public class OplusMaterialMetaBallParams {
    private static final int DEFAULT_EXTENSION = 0;
    private static final float DEFAULT_EXTENSION_FACTOR_X = 0.0f;
    private static final float DEFAULT_EXTENSION_FACTOR_Y = 0.0f;
    private static final int MAX_INDEX = 3;
    private static final int MIN_INDEX = 1;
    public static final int MODE_X = 0;
    public static final int MODE_Y = 1;
    private int mExtension;
    private float mExtensionFactorX;
    private float mExtensionFactorY;
    private int mIndex;
    private int mMode;

    public OplusMaterialMetaBallParams(int index, int mode) {
        this(index, mode, 0, 0.0f, 0.0f);
    }

    public OplusMaterialMetaBallParams(int index, int mode, int extension, float extensionFactorX, float extensionFactorY) {
        if (index < 1 || index > 3) {
            throw new IllegalArgumentException("Index must be between 1 and 3, but got " + index);
        }
        if (mode != 0 && mode != 1) {
            throw new IllegalArgumentException("Mode must be MODE_X or MODE_Y, but got " + mode);
        }
        this.mIndex = index;
        this.mMode = mode;
        this.mExtension = extension;
        this.mExtensionFactorX = extensionFactorX;
        this.mExtensionFactorY = extensionFactorY;
    }

    public int getIndex() {
        return this.mIndex;
    }

    public void setIndex(int index) {
        if (index < 1 || index > 3) {
            throw new IllegalArgumentException("Index must be between 1 and 3, but got " + index);
        }
        this.mIndex = index;
    }

    public int getMode() {
        return this.mMode;
    }

    public void setMode(int mode) {
        if (mode != 0 && mode != 1) {
            throw new IllegalArgumentException("Mode must be MODE_X or MODE_Y, but got " + mode);
        }
        this.mMode = mode;
    }

    public int getExtension() {
        return this.mExtension;
    }

    public void setExtension(int extension) {
        this.mExtension = extension;
    }

    public float getExtensionFactorX() {
        return this.mExtensionFactorX;
    }

    public void setExtensionFactorX(float extensionFactorX) {
        this.mExtensionFactorX = extensionFactorX;
    }

    public float getExtensionFactorY() {
        return this.mExtensionFactorY;
    }

    public void setExtensionFactorY(float extensionFactorY) {
        this.mExtensionFactorY = extensionFactorY;
    }

    public String toString() {
        return "OplusMaterialMetaBallParams(index=" + this.mIndex + ", mode=" + this.mMode + ", extension=" + this.mExtension + ", extensionFactorX=" + this.mExtensionFactorX + ", extensionFactorY=" + this.mExtensionFactorY + ")";
    }
}
