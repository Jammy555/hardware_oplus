package com.oplus.wrapper.hardware.display;

public class WifiDisplayStatus {
    public static int DISPLAY_STATE_CONNECTED;
    public static int DISPLAY_STATE_CONNECTING;
    public static int DISPLAY_STATE_NOT_CONNECTED;
    public WifiDisplayStatus(android.hardware.display.WifiDisplayStatus p0) { }
    public WifiDisplayStatus(android.os.Parcelable p0) throws java.lang.IllegalArgumentException { }
    public com.oplus.wrapper.hardware.display.WifiDisplay getActiveDisplay() { return null; }
    public int getActiveDisplayState() { return 0; }
    public com.oplus.wrapper.hardware.display.WifiDisplay[] getDisplays() { return null; }
    public int getScanState() { return 0; }
}
