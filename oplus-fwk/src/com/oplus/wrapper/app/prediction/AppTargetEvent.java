package com.oplus.wrapper.app.prediction;

public class AppTargetEvent {
    public static int ACTION_DISMISS;
    public static int ACTION_LAUNCH;
    public static int ACTION_PIN;
    public static int ACTION_UNDISMISS;
    public static int ACTION_UNPIN;
    public int getAction() { return 0; }
    public android.app.prediction.AppTargetEvent getAppTargetEvent() { return null; }
    public java.lang.String getLaunchLocation() { return null; }
    public android.os.Parcelable getParcelable() { return null; }

    public final static class Builder {
        public Builder(com.oplus.wrapper.app.prediction.AppTarget p0, int p1) { }
        public com.oplus.wrapper.app.prediction.AppTargetEvent build() { return null; }
        public com.oplus.wrapper.app.prediction.AppTargetEvent.Builder setLaunchLocation(java.lang.String p0) { return null; }
    }
}
