package com.oplus.oshare;

public class OplusOshareServiceUtil extends com.oplus.oshare.IOplusOshareService.Stub {
    public static final java.lang.String ACTION_OSHARE_STATE = "coloros.intent.action.OSHARE_STATE";
    public static final int OSHARE_OFF = 0;
    public static final int OSHARE_ON = 1;
    public static final java.lang.String OSHARE_STATE = "oshare_state";
    protected static final java.lang.String TAG = "OShareServiceUtil";
    public OplusOshareServiceUtil(android.content.Context p0, com.oplus.oshare.IOplusOshareInitListener p1) { }
    public static boolean checkRuntimePermission(android.content.Context p0) { return false; }
    public static android.content.SharedPreferences getSharedPreferences(android.content.Context p0) { return null; }
    public static boolean isOshareOn(android.content.Context p0) { return false; }
    public static boolean isSecurityCheckAgain(android.content.Context p0) { return false; }
    public static void setSecurityCheckAgain(android.content.Context p0, boolean p1) { }
    public static void switchOshare(android.content.Context p0, boolean p1) { }
    public void cancelTask(com.oplus.oshare.OplusOshareDevice p0) { }
    public void initShareEngine() { }
    public boolean isSendOn() { return false; }
    public void pause() throws android.os.RemoteException { }
    public void registerCallback(com.oplus.oshare.IOplusOshareCallback p0) { }
    public void registerMultiCallback(int p0, com.oplus.oshare.IOplusOshareCallback p1) { }
    public void resume() throws android.os.RemoteException { }
    public void scan() { }
    public void sendData(android.content.Intent p0, com.oplus.oshare.OplusOshareDevice p1) { }
    public void stop() { }
    public void switchSend(boolean p0) { }
    public void unregisterCallback(com.oplus.oshare.IOplusOshareCallback p0) { }
    public void unregisterMultiCallback(int p0) { }
}
