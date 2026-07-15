package com.oplus.view;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewRootImpl;
import com.android.internal.graphics.drawable.BackgroundBlurDrawable;
import com.oplus.graphics.OplusBlurParam;

public class ViewRootManager {
    private static final String TAG = "ViewRootManager";

    private BackgroundBlurDrawable mBackgroundBlurDrawable;

    public ViewRootManager(View view) {
        ViewRootImpl viewRootImpl = view.getViewRootImpl();
        if (viewRootImpl != null) {
            mBackgroundBlurDrawable = viewRootImpl.createBackgroundBlurDrawable();
        } else {
            Log.d(TAG, "viewRootImpl is null");
        }
    }

    public Drawable getBackgroundBlurDrawable() {
        return mBackgroundBlurDrawable;
    }

    public void setBlurRadius(int blurRadius) {
        if (mBackgroundBlurDrawable == null) {
            Log.d(TAG, "BackgroundBlurDrawable is null");
            return;
        }
        mBackgroundBlurDrawable.setBlurRadius(blurRadius);
    }

    public void setCornerRadius(float cornerRadius) {
        if (mBackgroundBlurDrawable == null) {
            Log.d(TAG, "BackgroundBlurDrawable is null");
            return;
        }
        mBackgroundBlurDrawable.setCornerRadius(cornerRadius);
    }

    public void setCornerRadius(float cornerRadiusTL, float cornerRadiusTR,
            float cornerRadiusBL, float cornerRadiusBR) {
        if (mBackgroundBlurDrawable == null) {
            Log.d(TAG, "BackgroundBlurDrawable is null");
            return;
        }
        mBackgroundBlurDrawable.setCornerRadius(
                cornerRadiusTL, cornerRadiusTR, cornerRadiusBL, cornerRadiusBR);
    }

    public void setColor(int color) {
        if (mBackgroundBlurDrawable == null) {
            Log.d(TAG, "BackgroundBlurDrawable is null");
            return;
        }
        mBackgroundBlurDrawable.setColor(color);
    }

    public void setBlurParams(Object params) {
    }

    public void setBlurParams(OplusBlurParam params) {
    }
}
