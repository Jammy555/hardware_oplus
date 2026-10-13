package com.oplus.animation;

public class OplusViewSeamless {
    public static final java.lang.String BUNDLE_ALPHA_CROSSFADE_END_CLOSE = "view_seamless_alpha_crossfade_end_close";
    public static final java.lang.String BUNDLE_ALPHA_CROSSFADE_END_OPEN = "view_seamless_alpha_crossfade_end_open";
    public static final java.lang.String BUNDLE_ALPHA_OUT_ON_POSITION_CHANGE = "view_seamless_alpha_out_on_position_change";
    public static final java.lang.String BUNDLE_ANIM_PARAM = "view_seamless_param";
    public static final java.lang.String BUNDLE_BACKGROUND_SCALE = "view_seamless_background_scale";
    public static final java.lang.String BUNDLE_BACK_ANIM_TYPE = "view_seamless_back_anim_type";
    public static final java.lang.String BUNDLE_BITMAP = "view_seamless_bitmap";
    public static final java.lang.String BUNDLE_BLUR_EFFECT = "view_seamless_blur_effect";
    public static final java.lang.String BUNDLE_COLOR = "view_seamless_color";
    public static final java.lang.String BUNDLE_DEPTH = "view_seamless_depth";
    public static final java.lang.String BUNDLE_DEST_ACTIVITY_ALPHA_START = "view_seamless_dest_activity_alpha_start";
    public static final java.lang.String BUNDLE_DIM_EFFECT = "view_seamless_dim_effect";
    public static final java.lang.String BUNDLE_FALLBACK_ANIM_TYPE = "view_seamless_fallback_anim_type";
    public static final java.lang.String BUNDLE_FILL_BGCOLOR = "view_seamless_fill_bgcolor";
    public static final java.lang.String BUNDLE_FORCE_LEASH_ALPHA_OUT = "view_seamless_force_leash_alpha_out";
    public static final java.lang.String BUNDLE_LIST_COVER = "view_seamless_list_cover";
    public static final java.lang.String BUNDLE_PRESS_EFFECT = "view_seamless_press_effect";
    public static final java.lang.String BUNDLE_RADIUS = "view_seamless_radius";
    public static final java.lang.String BUNDLE_RADIUS_BOTTOM_LEFT = "view_seamless_radius_bottom_left";
    public static final java.lang.String BUNDLE_RADIUS_BOTTOM_RIGHT = "view_seamless_radius_bottom_right";
    public static final java.lang.String BUNDLE_RADIUS_TOP_LEFT = "view_seamless_radius_top_left";
    public static final java.lang.String BUNDLE_RADIUS_TOP_RIGHT = "view_seamless_radius_top_right";
    public static final java.lang.String BUNDLE_RECT = "view_seamless_rect";
    public static final java.lang.String BUNDLE_RUS_DATA = "view_seamless_rus_data";
    public static final java.lang.String BUNDLE_SHADOW = "view_seamless_shadow_radius";
    public static final java.lang.String BUNDLE_SMOOTH_CORNER_TYPE = "view_seamless_smooth_corner_type";
    public static final java.lang.String BUNDLE_SMOOTH_CORNER_WEIGHT = "view_seamless_smooth_corner_weight";
    public static final java.lang.String BUNDLE_THIRD_PARTY = "view_seamless_third_party";
    public static final java.lang.String BUNDLE_USE_SCALE_ANIM = "view_seamless_use_scale_anim";
    public static final java.lang.String BUNDLE_VIEW_VISIBLE = "view_seamless_view_visible";
    public static final java.lang.String BUNDLE_VIEW_WITH_ALPHA = "view_seamless_view_with_alpha";
    public static final java.lang.String BUNDLE_VISIBLE_RECT = "view_seamless_visible_rect";
    public static final int OS_16_0_BASE = 37000;
    public static final int OS_16_1_BASE = 38000;
    public static final int OS_17_0_BASE = 40000;
    public static final java.lang.String REMOTE_DEBUG_NAME = "View Seamless";
    public static final int TRANSIT_FLAG_VIEW_SEAMLESS_REMOTE = 1048576;
    public static final int TRANSIT_FLAG_VIEW_SEAMLESS_SECURE_MASK = 2097152;
    public static final java.lang.String VIEW_SEAMLESS_CLOSE = "view_seamless_close";
    public static final java.lang.String VIEW_SEAMLESS_OPEN = "view_seamless_open";
    public static void applyTransitionOverride(android.app.Activity p0, android.os.Bundle p1) { }
    public static boolean finishCurrentAnimation() { return false; }
    public static int getVersion() { return 0; }
    public static boolean isFeatureEnabled() { return false; }
    public static void setForceLeashAlphaOut(android.app.Activity p0, boolean p1) { }
    public static boolean setSeamlessBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, float p2, android.os.Bundle p3, com.oplus.animation.OplusViewSeamless.AnimationCallback p4) { return false; }
    public static boolean setSeamlessView(android.view.View p0, android.content.Context p1, android.os.Bundle p2, com.oplus.animation.OplusViewSeamless.AnimationCallback p3) { return false; }
    public static void setSkipViewSeamless(android.app.Activity p0) { }
    public static void skipBackAnim(android.app.Activity p0) { }
    public static void useScaleAnim(android.app.Activity p0) { }

    public static class AnimationCallback {
        public AnimationCallback() { }
        public void animationProgress(float p0) { }
        public android.graphics.PointF getPositionOffset() { return null; }
        public void onAnimationEnd(boolean p0) { }
        public void onAnimationStart(boolean p0) { }
        public void setPositionOffset(android.graphics.PointF p0) { }
    }
}
