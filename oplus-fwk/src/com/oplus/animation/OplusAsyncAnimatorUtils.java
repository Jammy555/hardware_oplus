package com.oplus.animation;

import android.os.Looper;
import android.view.View;

public class OplusAsyncAnimatorUtils {

    // There is no render-thread property setter here; the value is set on the
    // view's own thread instead.
    private static boolean apply(View view, Runnable setter) {
        if (view == null) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            setter.run();
        } else {
            view.post(setter);
        }
        return true;
    }

    public static boolean setAlpha(View view, float value) {
        return apply(view, () -> view.setAlpha(value));
    }

    public static boolean setRotation(View view, float value) {
        return apply(view, () -> view.setRotation(value));
    }

    public static boolean setScaleX(View view, float value) {
        return apply(view, () -> view.setScaleX(value));
    }

    public static boolean setScaleY(View view, float value) {
        return apply(view, () -> view.setScaleY(value));
    }

    public static boolean setTranslationX(View view, float value) {
        return apply(view, () -> view.setTranslationX(value));
    }

    public static boolean setTranslationY(View view, float value) {
        return apply(view, () -> view.setTranslationY(value));
    }

    public static boolean setAlpha(android.graphics.RenderNode node, float value) {
        return node != null && node.setAlpha(value);
    }

    public static boolean setOutlineRoundRect(View view, android.graphics.Rect rect, float radius,
            float alpha) {
        if (rect == null) {
            return false;
        }
        final android.graphics.Rect bounds = new android.graphics.Rect(rect);
        return apply(view, () -> {
            view.setOutlineProvider(new android.view.ViewOutlineProvider() {
                @Override
                public void getOutline(View v, android.graphics.Outline outline) {
                    outline.setRoundRect(bounds, radius);
                    outline.setAlpha(alpha);
                }
            });
            view.invalidateOutline();
        });
    }

    public static boolean setRotationX(View view, float value) {
        return apply(view, () -> view.setRotationX(value));
    }

    public static boolean setRotationY(View view, float value) {
        return apply(view, () -> view.setRotationY(value));
    }

    public static boolean setTranslationZ(View view, float value) {
        return apply(view, () -> view.setTranslationZ(value));
    }
}
