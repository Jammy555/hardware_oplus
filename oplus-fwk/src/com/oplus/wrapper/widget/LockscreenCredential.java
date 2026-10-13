package com.oplus.wrapper.widget;

public class LockscreenCredential {
    LockscreenCredential(com.android.internal.widget.LockscreenCredential p0) { }
    public static com.oplus.wrapper.widget.LockscreenCredential createNone() { if (sStub == null) sStub = new LockscreenCredential((com.android.internal.widget.LockscreenCredential) null); return sStub; }
    public static com.oplus.wrapper.widget.LockscreenCredential createPassword(java.lang.CharSequence p0) { if (sStub == null) sStub = new LockscreenCredential((com.android.internal.widget.LockscreenCredential) null); return sStub; }
    public static com.oplus.wrapper.widget.LockscreenCredential createPattern(byte[] p0) { if (sStub == null) sStub = new LockscreenCredential((com.android.internal.widget.LockscreenCredential) null); return sStub; }
    public static com.oplus.wrapper.widget.LockscreenCredential createPin(java.lang.CharSequence p0) { if (sStub == null) sStub = new LockscreenCredential((com.android.internal.widget.LockscreenCredential) null); return sStub; }
    public android.os.Parcelable getLockscreenCredential() { return null; }
    private static LockscreenCredential sStub;
}
