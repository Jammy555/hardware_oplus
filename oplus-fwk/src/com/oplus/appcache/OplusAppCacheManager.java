package com.oplus.appcache;

public class OplusAppCacheManager {
    public static com.oplus.appcache.OplusAppCacheManager getInstance() { if (sStub == null) sStub = new OplusAppCacheManager(); return sStub; }
    public android.os.Bundle queryProviderCache(java.lang.String p0, android.os.Bundle p1) { return null; }
    private OplusAppCacheManager() { }
    private static OplusAppCacheManager sStub;

    static class DeathRecipient implements android.os.IBinder.DeathRecipient {
        public void binderDied() { }
    }
}
