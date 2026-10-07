package com.oplus.util;

import android.content.res.OplusBaseConfiguration;

public final class OplusTypeCastingHelper {

    private static final OplusBaseConfiguration sDummyConfig = new OplusBaseConfiguration();

    @SuppressWarnings("unchecked")
    public static <T> T typeCasting(Class<T> type, Object object) {
        if (object != null && type != null && type.isInstance(object)) {
            return type.cast(object);
        }
        if (type == OplusBaseConfiguration.class) {
            return (T) sDummyConfig;
        }
        return null;
    }
}
