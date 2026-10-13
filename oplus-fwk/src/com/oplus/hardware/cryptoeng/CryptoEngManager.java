package com.oplus.hardware.cryptoeng;

public class CryptoEngManager {
    public static com.oplus.hardware.cryptoeng.CryptoEngManager getInstance() { if (sStub == null) sStub = new CryptoEngManager(); return sStub; }
    public byte[] cryptoEngCommand(byte[] p0) { return null; }
    private CryptoEngManager() { }
    private static CryptoEngManager sStub;

    public static class CommandId {
        public static final byte CE_CMD_CLEAN_UP = 53;
        public static final byte CE_CMD_CRYPTO_SUPPORT = 60;
        public static final byte CE_CMD_ENGINEER = 90;
        public static final byte CE_CMD_FINDPHONE_GET_STATUS = 18;
        public static final byte CE_CMD_GENERATE_PKI_CERT = 24;
        public static final byte CE_CMD_GET_SECURETYPE = 54;
        public static final byte CE_CMD_GOOGLE_ATTESTATION_VERIFY = 4;
        public static final byte CE_CMD_GOOGLE_ATTESTATION_WRITE = 3;
        public static final byte CE_CMD_HDCP_KEY_VERIFY = 52;
        public static final byte CE_CMD_HDCP_KEY_WRITE = 51;
        public static final byte CE_CMD_VERIFY_PKI_CERT = 25;
        public static final byte CE_CMD_WIDEVINE_SUPPORT = 59;
        public CommandId() { }
    }
}
