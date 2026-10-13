package com.oplus.view;

public interface IJankManager extends android.common.IOplusCommonFeature {
    public static final com.oplus.view.IJankManager DEFAULT = null;
    public static final int MS_TO_NS = 1000000;
    public static final java.lang.String NAME = "IJankManager";
    public static final int TASK_OPERATION_LATENCY_THRESHOLD = 435;
    public static final int TRANSIT_CLOSE = 2;
    public static final int TRANSIT_OPEN = 1;
    public static final int TRANSIT_TO_BACK = 4;
    public static final int TRANSIT_TO_FRONT = 3;
    public default void asyncLatencySceneBegin(com.oplus.view.IJankManager.SceneInfo p0) { }
    public default void asyncLatencySceneEnd(java.lang.String p0, int p1, int p2, java.lang.String p3) { }
    public default void finishDrawing(java.lang.String p0, java.lang.String p1) { }
    public default long getAnimCostThreshold() { return 0L; }
    public default int getAppAction(java.lang.String p0) { return 0; }
    public default int getAppScene(java.lang.String p0) { return 0; }
    public default android.common.IOplusCommonFeature getDefault() { return null; }
    public default long getLatencyThresholdNs() { return 0L; }
    public default int getScene() { return 0; }
    public default long getSceneBeginTime() { return 0L; }
    public default java.lang.String getSceneDescription() { return null; }
    public default long getScenePolicy() { return 0L; }
    public default int getSceneType() { return 0; }
    public default int getSkippedAnimFrame() { return 0; }
    public default int getSkippedFrame() { return 0; }
    public default long getSkippedFrameThreshold() { return 0L; }
    public default int getSlideScene() { return 0; }
    public default long getSlideSceneBeginTime() { return 0L; }
    public default long getSlideScenePolicy() { return 0L; }
    public default int getSlideSceneSkippedFrame() { return 0; }
    public default long getSlideSceneThreshold() { return 0L; }
    public default int getSlideSceneType() { return 0; }
    public default void gfxSceneBegin(android.content.Context p0, int p1, java.lang.String p2, long p3) { }
    public default void gfxSceneBegin(android.content.Context p0, com.oplus.view.IJankManager.SceneInfo p1) { }
    public default void gfxSceneEnd(android.content.Context p0, int p1) { }
    public default android.common.OplusFeatureList.OplusIndex index() { return null; }
    public default boolean isSceneEnabled(int p0, int p1) { return false; }
    public default void latencySceneBegin(android.content.Context p0, int p1, java.lang.String p2, long p3) { }
    public default void latencySceneBegin(android.content.Context p0, com.oplus.view.IJankManager.SceneInfo p1) { }
    public default void latencySceneEnd(android.content.Context p0, int p1, java.util.ArrayList<java.lang.String> p2) { }
    public default void notifyActivityStarted(java.lang.String p0, java.lang.String p1, long p2) { }
    public default void notifyAddStartingWindow(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) { }
    public default void onAnimationUpdate() { }
    public default void requestEndTransition(int p0) { }
    public default void requestStartTransition(int p0, int p1, java.lang.String p2, long p3, int p4, boolean p5) { }
    public default void slideSceneBegin(android.content.Context p0, com.oplus.view.IJankManager.SceneInfo p1) { }
    public default void slideSceneEnd(android.content.Context p0, int p1) { }
    public default void ssAnimSceneBegin(int p0, java.lang.String p1, int p2, long p3) { }
    public default void ssAnimSceneEnd(int p0, boolean p1) { }
    public default void startActivity(java.lang.String p0, java.lang.String p1) { }
    public default void startRemoteAnimation(java.lang.String p0, java.lang.String p1) { }
    public default void updateAppSceneAndAction(java.lang.String p0, int p1, int p2) { }
    public default void updateFaultThresholdMs(java.lang.String p0, int p1, int p2) { }

    public static class Action {
        public static final int ACTION_END = 0;
        public static final int ACTION_START = 1;
        public Action() { }
    }

    public final static class AppLatencyPolicy {
        public static final int SCENE_APPEND = 4;
        public static final int SCENE_BEGIN = 2;
        public static final int SCENE_END = 8;
        public static final int SCENE_EXIT = 16;
        AppLatencyPolicy() { }
    }

    public final static class AppSceneType {
        public static final int SCENE_TYPE_GFX_FRAME = 2;
        public static final int SCENE_TYPE_LATENCY = 0;
        public static final int SCENE_TYPE_SLIDE = 3;
        public static final int SCENE_TYPE_SS_ANIM = 1;
        public AppSceneType() { }
        public static boolean isInvalidType(int p0) { return false; }
    }

    public final static class CameraSceneId {
        public static final int ENTER_PHOTO = 200;
        public static final int EXIT_PHOTO = 201;
        CameraSceneId() { }
    }

    public final static class FaultType {
        public static final int ACTIVITY_LAUNCH_FROM_LAUNCHER = 1;
        public static final int ACTIVITY_LAUNCH_WITHIN_APP = 2;
        public static final int ACTIVITY_RESPOND_WITHIN_APP = 3;
        FaultType() { }
    }

    public final static class JPolicy {
        public static final long FLING_TYPE = 128l;
        public static final long IGNORE_CONTINUOUS_JANK = 512l;
        public static final long IGNORE_NEXT_SCENE_FLAG = 256l;
        public static final long IGNORE_TIMEOUT = 32l;
        public static final long MOVE_TYPE = 64l;
        public static final long OVERRIDE_BY_NEXT_SCENE_FLAG = 16l;
        public static final long USD_SELF_TIME_FLAG = 2l;
        public static final long USE_DOWN_EVENT_FLAG = 4l;
        public static final long USE_UP_EVENT_FLAG = 8l;
        public JPolicy() { }
    }

    public static class LauncherScene {
        public static final int APP_START_ANIM = 1;
        public static final int BACK_TO_LAUNCHER_ANIM = 2;
        public static final int ENTER_RECENT_TASK_ANIM_FROM_APP = 4;
        public static final int ENTER_RECENT_TASK_ANIM_FROM_LAUNCHER = 3;
        public static final int LAUNCH_ANIM_FROM_RECENT = 6;
        public static final int OUT_RECENT_TASK_ANIM = 5;
        public LauncherScene() { }
    }

    public enum SceneDescription {
        FLUTTER_VIEW_SLIDE, LIST_VIEW_SLIDE, VIDEO_SLIDE, WEBVIEW_SLIDE;
        java.lang.String mDescription;
        public java.lang.String getDescription() { return null; }
    }

    public enum SceneIndex {
        FLUTTER_VIEW_SLIDE, LIST_VIEW_SLIDE, VIDEO_SLIDE, WEBVIEW_SLIDE;
        int mValue;
        public int getValue() { return 0; }
    }

    public final static class SceneInfo {
        public SceneInfo() { }
        protected SceneInfo(int p0, int p1, java.lang.String p2, long p3, int p4) { }
        public void addPreCount() { }
        public long getAnimCostThreshold() { return 0L; }
        public long getLatencyThresholdNs() { return 0L; }
        public java.lang.String getPackageName() { return null; }
        public int getPreCount() { return 0; }
        public int getScene() { return 0; }
        public long getSceneBeginTime() { return 0L; }
        public java.lang.String getSceneDescription() { return null; }
        public long getScenePolicy() { return 0L; }
        public int getSceneType() { return 0; }
        public int getSkippedAnimFrame() { return 0; }
        public int getSkippedFrame() { return 0; }
        public long getSkippedFrameThreshold() { return 0L; }
        public int getTransitionSyncId() { return 0; }
        public void initBasicInfo(android.content.Context p0, int p1, int p2, java.lang.String p3) { }
        public void reset() { }
        public void resetPreCount() { }
        public void resetSceneType() { }
        public void setAnimCostThreshold(long p0) { }
        public void setLatencyThresholdMs(long p0) { }
        public void setPackageName(java.lang.String p0) { }
        public void setPolicy(long p0) { }
        public void setTransitionSyncId(int p0) { }
        public java.lang.String toString() { return null; }
        public void updateSceneBeginTime() { }
        public void updateThreshold(long p0, long p1, int p2, long p3, int p4, long p5) { }
    }

    public final static class SideGestureSceneId {
        public static final int BACK_TO_LAST_ACTIVITY = 1;
        public static final int BACK_TO_LAUNCHER = 2;
        SideGestureSceneId() { }
    }

    public final static class SsOperationScene {
        public static final int TASK_OPERATION_LATENCY = 1;
        public static final java.lang.String TASK_OPERATION_LATENCY_DESC = "app_transition_latency";
        public SsOperationScene() { }
    }
}
