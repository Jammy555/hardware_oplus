package android.os.customize;

import android.content.Context;

public final class OplusCustomizeStateManager {
    private static final OplusCustomizeStateManager INSTANCE = new OplusCustomizeStateManager();

    private OplusCustomizeStateManager() {}

    public static OplusCustomizeStateManager getInstance(Context context) {
        return INSTANCE;
    }
}
