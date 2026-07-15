package android.os.customize;

import android.content.Context;

public final class OplusCustomizeRestrictionManager {
    private static final OplusCustomizeRestrictionManager INSTANCE =
            new OplusCustomizeRestrictionManager();

    private OplusCustomizeRestrictionManager() {}

    public static OplusCustomizeRestrictionManager getInstance(Context context) {
        return INSTANCE;
    }

    public boolean getForbidRecordScreenState() {
        return false;
    }
}
