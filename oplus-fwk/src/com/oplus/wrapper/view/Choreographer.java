package com.oplus.wrapper.view;

/* JADX INFO: loaded from: classes2.dex */
public class Choreographer {
    private final android.view.Choreographer mChoreographer;

    @Deprecated
    public Choreographer(android.view.Choreographer choreographer) {
        this.mChoreographer = choreographer;
    }

    public static void postCallback(android.view.Choreographer target, int callbackType, Runnable action, Object token) {
        target.postCallback(callbackType, action, token);
    }

    public static void removeCallbacks(android.view.Choreographer target, int callbackType, Runnable action, Object token) {
        target.removeCallbacks(callbackType, action, token);
    }

    public static long getVsyncId(android.view.Choreographer target) {
        return target.getVsyncId();
    }

    @Deprecated
    public void postCallback(int callbackType, Runnable action, Object token) {
        this.mChoreographer.postCallback(callbackType, action, token);
    }

    @Deprecated
    public void removeCallbacks(int callbackType, Runnable action, Object token) {
        this.mChoreographer.removeCallbacks(callbackType, action, token);
    }

    public static android.view.Choreographer getSfInstance() {
        return android.view.Choreographer.getSfInstance();
    }

    @Deprecated
    public long getVsyncId() {
        return this.mChoreographer.getVsyncId();
    }
}
