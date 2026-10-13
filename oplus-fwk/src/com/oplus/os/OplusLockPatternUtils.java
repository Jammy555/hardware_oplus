package com.oplus.os;

public class OplusLockPatternUtils {
    public OplusLockPatternUtils() { }
    public static com.oplus.os.IOplusLockPatternUtils getService() { return null; }
    public byte[] cryptoEngCommand(byte[] p0) { return null; }
    public byte[] generateDerivedPassword(byte[] p0, byte[] p1, byte[] p2) { return null; }
    public java.util.Map<java.lang.String, byte[]> getDerivedPasswordInfo(byte[] p0, byte[] p1) { return null; }
    public int getFailedAttempts(int p0) { return 0; }
    public byte[] getGateKeeperAuthToken() { return null; }
    public int getKeyguardStoredPasswordQuality(int p0) { return 0; }
    public int getLockPasswordMinLength(int p0, int p1) { return 0; }
    public byte[] getPublicKey() { return null; }
    public byte[] getVersionInfo() { return null; }
    public boolean isLockPasswordEnabled(int p0) { return false; }
    public boolean isLockPatternEnabled(int p0) { return false; }
    public boolean isLockScreenDisabled(int p0) { return false; }
    public boolean isSecure(int p0) { return false; }
    public void notifySrpLockVerify(byte[] p0) { }
    public void registSrpCredential() { }
    public boolean setLockCredential(com.oplus.wrapper.widget.LockscreenCredential p0, com.oplus.wrapper.widget.LockscreenCredential p1, int p2) { return false; }
    public void setLockScreenDisabled(boolean p0, int p1) { }
    public void unRegistSrpCredential() { }
    public boolean unlockUserWithToken(long p0, byte[] p1, int p2) { return false; }
    public byte[] verifyCredential(com.oplus.wrapper.widget.LockscreenCredential p0, int p1, int p2) { return null; }
    public com.oplus.os.RemoteCredentialResult verifyRemoteCredential(com.oplus.wrapper.widget.LockscreenCredential p0, int p1) { return null; }
}
