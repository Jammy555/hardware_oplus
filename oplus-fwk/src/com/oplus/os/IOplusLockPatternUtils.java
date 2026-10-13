package com.oplus.os;

public interface IOplusLockPatternUtils extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.oplus.os.IOplusLockPatternUtils";
    public byte[] cryptoEngCommand(byte[] p0) throws android.os.RemoteException;
    public byte[] generateDerivedPassword(byte[] p0, byte[] p1, byte[] p2) throws android.os.RemoteException;
    public java.util.Map getDerivedPasswordInfo(byte[] p0, byte[] p1) throws android.os.RemoteException;
    public int getFailedAttempts(int p0) throws android.os.RemoteException;
    public byte[] getGateKeeperAuthToken() throws android.os.RemoteException;
    public int getKeyguardStoredPasswordQuality(int p0) throws android.os.RemoteException;
    public int getLockPasswordMinLength(int p0, int p1) throws android.os.RemoteException;
    public byte[] getPublicKey() throws android.os.RemoteException;
    public byte[] getVersionInfo() throws android.os.RemoteException;
    public boolean isLockPasswordEnabled(int p0) throws android.os.RemoteException;
    public boolean isLockPatternEnabled(int p0) throws android.os.RemoteException;
    public boolean isLockScreenDisabled(int p0) throws android.os.RemoteException;
    public boolean isSecure(int p0) throws android.os.RemoteException;
    public void notifySrpLockVerify(byte[] p0) throws android.os.RemoteException;
    public void registSrpCredential() throws android.os.RemoteException;
    public void registerPasswordChangedCallback(com.oplus.os.IOplusPasswordChangedCallback p0) throws android.os.RemoteException;
    public boolean setLockCredentialOplus(com.android.internal.widget.LockscreenCredential p0, com.android.internal.widget.LockscreenCredential p1, int p2) throws android.os.RemoteException;
    public void setLockScreenDisabled(boolean p0, int p1) throws android.os.RemoteException;
    public void triggerChannelOpen() throws android.os.RemoteException;
    public void unRegistSrpCredential() throws android.os.RemoteException;
    public boolean unlockCeStorageWithSyntheticPassword(byte p0, byte[] p1) throws android.os.RemoteException;
    public boolean unlockUserWithToken(long p0, byte[] p1, int p2) throws android.os.RemoteException;
    public com.android.internal.widget.VerifyCredentialResponse verifyCredential(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) throws android.os.RemoteException;
    public com.android.internal.widget.VerifyCredentialResponse verifyRemoteCredential(com.android.internal.widget.LockscreenCredential p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.oplus.os.IOplusLockPatternUtils {
        public Default() { }
        public android.os.IBinder asBinder() { return null; }
        public byte[] cryptoEngCommand(byte[] p0) throws android.os.RemoteException { return null; }
        public byte[] generateDerivedPassword(byte[] p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return null; }
        public java.util.Map getDerivedPasswordInfo(byte[] p0, byte[] p1) throws android.os.RemoteException { return null; }
        public int getFailedAttempts(int p0) throws android.os.RemoteException { return 0; }
        public byte[] getGateKeeperAuthToken() throws android.os.RemoteException { return null; }
        public int getKeyguardStoredPasswordQuality(int p0) throws android.os.RemoteException { return 0; }
        public int getLockPasswordMinLength(int p0, int p1) throws android.os.RemoteException { return 0; }
        public byte[] getPublicKey() throws android.os.RemoteException { return null; }
        public byte[] getVersionInfo() throws android.os.RemoteException { return null; }
        public boolean isLockPasswordEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isLockPatternEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isLockScreenDisabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isSecure(int p0) throws android.os.RemoteException { return false; }
        public void notifySrpLockVerify(byte[] p0) throws android.os.RemoteException { }
        public void registSrpCredential() throws android.os.RemoteException { }
        public void registerPasswordChangedCallback(com.oplus.os.IOplusPasswordChangedCallback p0) throws android.os.RemoteException { }
        public boolean setLockCredentialOplus(com.android.internal.widget.LockscreenCredential p0, com.android.internal.widget.LockscreenCredential p1, int p2) throws android.os.RemoteException { return false; }
        public void setLockScreenDisabled(boolean p0, int p1) throws android.os.RemoteException { }
        public void triggerChannelOpen() throws android.os.RemoteException { }
        public void unRegistSrpCredential() throws android.os.RemoteException { }
        public boolean unlockCeStorageWithSyntheticPassword(byte p0, byte[] p1) throws android.os.RemoteException { return false; }
        public boolean unlockUserWithToken(long p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
        public com.android.internal.widget.VerifyCredentialResponse verifyCredential(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public com.android.internal.widget.VerifyCredentialResponse verifyRemoteCredential(com.android.internal.widget.LockscreenCredential p0, int p1) throws android.os.RemoteException { return null; }
    }

    public abstract static class Stub extends android.os.Binder implements com.oplus.os.IOplusLockPatternUtils {
        static final int TRANSACTION_cryptoEngCommand = 23;
        static final int TRANSACTION_generateDerivedPassword = 7;
        static final int TRANSACTION_getDerivedPasswordInfo = 5;
        static final int TRANSACTION_getFailedAttempts = 24;
        static final int TRANSACTION_getGateKeeperAuthToken = 11;
        static final int TRANSACTION_getKeyguardStoredPasswordQuality = 17;
        static final int TRANSACTION_getLockPasswordMinLength = 12;
        static final int TRANSACTION_getPublicKey = 6;
        static final int TRANSACTION_getVersionInfo = 1;
        static final int TRANSACTION_isLockPasswordEnabled = 20;
        static final int TRANSACTION_isLockPatternEnabled = 19;
        static final int TRANSACTION_isLockScreenDisabled = 18;
        static final int TRANSACTION_isSecure = 13;
        static final int TRANSACTION_notifySrpLockVerify = 2;
        static final int TRANSACTION_registSrpCredential = 3;
        static final int TRANSACTION_registerPasswordChangedCallback = 9;
        static final int TRANSACTION_setLockCredentialOplus = 14;
        static final int TRANSACTION_setLockScreenDisabled = 21;
        static final int TRANSACTION_triggerChannelOpen = 8;
        static final int TRANSACTION_unRegistSrpCredential = 4;
        static final int TRANSACTION_unlockCeStorageWithSyntheticPassword = 10;
        static final int TRANSACTION_unlockUserWithToken = 22;
        static final int TRANSACTION_verifyCredential = 15;
        static final int TRANSACTION_verifyRemoteCredential = 16;
        public Stub() { }
        public static com.oplus.os.IOplusLockPatternUtils asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        final static class Proxy implements com.oplus.os.IOplusLockPatternUtils {
            Proxy(android.os.IBinder p0) { }
            public android.os.IBinder asBinder() { return null; }
            public byte[] cryptoEngCommand(byte[] p0) throws android.os.RemoteException { return null; }
            public byte[] generateDerivedPassword(byte[] p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return null; }
            public java.util.Map getDerivedPasswordInfo(byte[] p0, byte[] p1) throws android.os.RemoteException { return null; }
            public int getFailedAttempts(int p0) throws android.os.RemoteException { return 0; }
            public byte[] getGateKeeperAuthToken() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getKeyguardStoredPasswordQuality(int p0) throws android.os.RemoteException { return 0; }
            public int getLockPasswordMinLength(int p0, int p1) throws android.os.RemoteException { return 0; }
            public byte[] getPublicKey() throws android.os.RemoteException { return null; }
            public byte[] getVersionInfo() throws android.os.RemoteException { return null; }
            public boolean isLockPasswordEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isLockPatternEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isLockScreenDisabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isSecure(int p0) throws android.os.RemoteException { return false; }
            public void notifySrpLockVerify(byte[] p0) throws android.os.RemoteException { }
            public void registSrpCredential() throws android.os.RemoteException { }
            public void registerPasswordChangedCallback(com.oplus.os.IOplusPasswordChangedCallback p0) throws android.os.RemoteException { }
            public boolean setLockCredentialOplus(com.android.internal.widget.LockscreenCredential p0, com.android.internal.widget.LockscreenCredential p1, int p2) throws android.os.RemoteException { return false; }
            public void setLockScreenDisabled(boolean p0, int p1) throws android.os.RemoteException { }
            public void triggerChannelOpen() throws android.os.RemoteException { }
            public void unRegistSrpCredential() throws android.os.RemoteException { }
            public boolean unlockCeStorageWithSyntheticPassword(byte p0, byte[] p1) throws android.os.RemoteException { return false; }
            public boolean unlockUserWithToken(long p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
            public com.android.internal.widget.VerifyCredentialResponse verifyCredential(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public com.android.internal.widget.VerifyCredentialResponse verifyRemoteCredential(com.android.internal.widget.LockscreenCredential p0, int p1) throws android.os.RemoteException { return null; }
        }
    }
}
