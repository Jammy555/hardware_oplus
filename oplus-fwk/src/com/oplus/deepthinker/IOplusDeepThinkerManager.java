package com.oplus.deepthinker;

public interface IOplusDeepThinkerManager extends android.common.IOplusCommonFeature {
    public static final com.oplus.deepthinker.IOplusDeepThinkerManager DEFAULT = null;
    public default android.os.Bundle call(android.os.Bundle p0) { return null; }
    public default int getAlgorithmPlatformVersion() { return 0; }
    public default com.oplus.deepthinker.sdk.aidl.proton.appactionpredict.PredictResult getAppPredictResult(java.lang.String p0) { return null; }
    public default java.util.List<com.oplus.deepthinker.sdk.aidl.proton.appactionpredict.PredictResult> getAppPredictResultMap(java.lang.String p0) { return null; }
    public default java.util.List<java.lang.String> getAppQueueSortedByComplex() { return null; }
    public default java.util.List<java.lang.String> getAppQueueSortedByCount() { return null; }
    public default java.util.List<java.lang.String> getAppQueueSortedByTime() { return null; }
    public default int getAppType(java.lang.String p0) { return 0; }
    public default java.util.Map getAppTypeMap(java.util.List<java.lang.String> p0) { return null; }
    public default java.util.List<com.oplus.eventhub.sdk.aidl.Event> getAvailableEvent() { return null; }
    public default com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepPredictResult getDeepSleepPredictResult() { return null; }
    public default com.oplus.deepthinker.sdk.aidl.proton.deepsleep.TotalPredictResult getDeepSleepTotalPredictResult() { return null; }
    public default android.common.IOplusCommonFeature getDefault() { return null; }
    public default int getInOutDoorState() { return 0; }
    public default int getInOutDoorState(android.os.Bundle p0) { return 0; }
    public default com.oplus.deepthinker.sdk.aidl.proton.deepsleep.SleepRecord getLastDeepSleepRecord() { return null; }
    public default com.oplus.deepthinker.sdk.aidl.proton.appactionpredict.PredictAABResult getPredictAABResult() { return null; }
    public default com.oplus.deepthinker.sdk.aidl.proton.deepsleep.DeepSleepPredictResult getPredictResultWithFeedBack() { return null; }
    public default java.util.List<java.lang.String> getSmartGpsBssidList() { return null; }
    public default java.util.List<com.oplus.deepthinker.sdk.aidl.proton.userprofile.WifiLocationLabel> getWifiLocationLabels() { return null; }
    public default android.common.OplusFeatureList.OplusIndex index() { return null; }
    public default boolean isApplicationEnable() { return false; }
    public default boolean isAvailableEvent(com.oplus.eventhub.sdk.aidl.Event p0) { return false; }
    public default boolean registerCallback(com.oplus.eventhub.sdk.aidl.IEventCallback p0, com.oplus.eventhub.sdk.aidl.EventRequestConfig p1) { return false; }
    public default int registerEventCallback(com.oplus.eventhub.sdk.aidl.IEventCallback p0, com.oplus.eventhub.sdk.aidl.EventConfig p1) { return 0; }
    public default void registerEventCallbackAsync(com.oplus.eventhub.sdk.aidl.IEventCallback p0, com.oplus.eventhub.sdk.aidl.EventConfig p1) { }
    public default void registerServiceStateObserver(com.oplus.deepthinker.ServiceStateObserver p0) { }
    public default void run(java.lang.Runnable p0) { }
    public default void triggerHookEvent(int p0, int p1, java.lang.String p2, android.os.Bundle p3) { }
    public default void triggerHookEvent(com.oplus.eventhub.sdk.aidl.TriggerEvent p0) { }
    public default void triggerHookEventAsync(android.os.Handler p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) { }
    public default boolean unregisterCallback(com.oplus.eventhub.sdk.aidl.IEventCallback p0) { return false; }
    public default int unregisterEventCallback(com.oplus.eventhub.sdk.aidl.IEventCallback p0) { return 0; }
}
