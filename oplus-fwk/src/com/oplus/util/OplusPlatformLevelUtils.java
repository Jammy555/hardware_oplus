package com.oplus.util;

import android.content.Context;
import android.os.Process;
import android.os.SystemProperties;

/**
 * Device performance class as OPLUS apps ask for it. RAM level uses the thresholds of the
 * OPLUS implementation; the CPU and GPU levels come from SoC lists in OPLUS framework
 * resources that are not available here, so a property can set them and the default is high.
 */
public class OplusPlatformLevelUtils {

    public static final int LEVEL_HIGH = 3;
    public static final int LEVEL_LOW = 1;
    public static final int LEVEL_MIDDLE = 2;
    public static final int LEVEL_TYPE_FOR_CPU = 2;
    public static final int LEVEL_TYPE_FOR_GPU = 3;
    public static final int LEVEL_TYPE_FOR_RAM = 1;
    public static final int LEVEL_UNDEF = -1;

    private static final long GB = 1073741824L;
    private static final int THRESHOLD_HIGH_RAM = 12;
    private static final int THRESHOLD_LOW_RAM = 4;

    public static final boolean IS_LIGHT_OS = SystemProperties.getBoolean("ro.oplus.lightos", false);
    public static final int TOTAL_RAM = (int) Math.ceil(Process.getTotalMemory() / (double) GB);

    private static final int ANIMATION_LEVEL = SystemProperties.getInt("ro.oplus.animationlevel", 0);
    private static final int GAUSSIAN_LEVEL = SystemProperties.getInt("ro.oplus.gaussianlevel", 0);

    private static volatile OplusPlatformLevelUtils sInstance;

    private OplusPlatformLevelUtils(Context context) {
    }

    public static OplusPlatformLevelUtils getInstance(Context context) {
        if (sInstance == null) {
            synchronized (OplusPlatformLevelUtils.class) {
                if (sInstance == null) {
                    sInstance = new OplusPlatformLevelUtils(context);
                }
            }
        }
        return sInstance;
    }

    public int getPlatformLevel(int type) {
        switch (type) {
            case LEVEL_TYPE_FOR_RAM:
                if (TOTAL_RAM <= THRESHOLD_LOW_RAM) {
                    return LEVEL_LOW;
                }
                return TOTAL_RAM >= THRESHOLD_HIGH_RAM ? LEVEL_HIGH : LEVEL_MIDDLE;
            case LEVEL_TYPE_FOR_CPU:
                return SystemProperties.getInt("ro.oplus.platformlevel.cpu", LEVEL_HIGH);
            case LEVEL_TYPE_FOR_GPU:
                return SystemProperties.getInt("ro.oplus.platformlevel.gpu", LEVEL_HIGH);
            default:
                return LEVEL_UNDEF;
        }
    }

    public int getPlatformAnimationLevel() {
        return ANIMATION_LEVEL;
    }

    public int getPlatformGaussianLevel() {
        return GAUSSIAN_LEVEL;
    }
}
