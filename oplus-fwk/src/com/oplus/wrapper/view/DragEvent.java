package com.oplus.wrapper.view;

/* JADX INFO: loaded from: classes2.dex */
public class DragEvent {
    private final android.view.DragEvent mDragEvent;

    public static android.view.SurfaceControl getDragSurface(android.view.DragEvent dragEvent) {
        return dragEvent.getDragSurface();
    }

    public static float getOffsetX(android.view.DragEvent dragEvent) {
        return dragEvent.getOffsetX();
    }

    public static float getOffsetY(android.view.DragEvent dragEvent) {
        return dragEvent.getOffsetY();
    }

    public DragEvent(android.view.DragEvent dragEvent) {
        this.mDragEvent = dragEvent;
    }

    public android.view.SurfaceControl getDragSurface() {
        return this.mDragEvent.getDragSurface();
    }

    public float getOffsetX() {
        return this.mDragEvent.getOffsetX();
    }

    public float getOffsetY() {
        return this.mDragEvent.getOffsetY();
    }
}
