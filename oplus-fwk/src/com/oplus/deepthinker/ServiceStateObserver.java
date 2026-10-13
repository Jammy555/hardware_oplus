package com.oplus.deepthinker;

public interface ServiceStateObserver {
    public default void onServiceDied() { }
    public default void onStartup() { }
}
