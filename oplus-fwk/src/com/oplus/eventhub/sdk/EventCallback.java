package com.oplus.eventhub.sdk;

public abstract class EventCallback extends com.oplus.eventhub.sdk.aidl.IEventCallback.Stub {
    public EventCallback() { }
    public abstract void onEventStateChanged(com.oplus.eventhub.sdk.aidl.DeviceEventResult p0);
}
