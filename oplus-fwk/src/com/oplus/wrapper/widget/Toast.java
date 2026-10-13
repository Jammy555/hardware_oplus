package com.oplus.wrapper.widget;

import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public class Toast {
    private final android.widget.Toast mToast;

    public static WindowManager.LayoutParams getWindowParams(android.widget.Toast target) {
        return target.getWindowParams();
    }

    public Toast(android.widget.Toast toast) {
        this.mToast = toast;
    }

    public WindowManager.LayoutParams getWindowParams() {
        return this.mToast.getWindowParams();
    }
}
