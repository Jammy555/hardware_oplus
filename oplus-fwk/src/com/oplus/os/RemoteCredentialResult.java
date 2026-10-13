package com.oplus.os;

public class RemoteCredentialResult {
    public static final int RESULT_INVALID = 0;
    public static final int RESULT_LOCKOUT = 2;
    public static final int RESULT_VALID = 1;
    public RemoteCredentialResult() { }
    public int getResultCode() { return 0; }
    public int getTimeoutMillis() { return 0; }
    public void setResultCode(int p0) { }
    public void setTimeoutMillis(int p0) { }
}
