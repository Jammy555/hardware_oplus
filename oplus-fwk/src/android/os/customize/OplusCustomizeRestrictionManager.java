package android.os.customize;

import android.content.Context;

public class OplusCustomizeRestrictionManager {

    private static OplusCustomizeRestrictionManager sInstance;

    public static final OplusCustomizeRestrictionManager getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new OplusCustomizeRestrictionManager();
        }
        return sInstance;
    }

    public boolean getForbidRecordScreenState() {
        return false;
    }

    public boolean isFloatTaskDisabled(android.content.ComponentName p0) { return false; }
    public boolean isPrivateSafeDisabled() { return false; }
    public boolean setFloatTaskDisabled(android.content.ComponentName p0, boolean p1) { return false; }
}
