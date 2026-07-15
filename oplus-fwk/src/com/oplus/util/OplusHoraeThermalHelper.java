package com.oplus.util;

public class OplusHoraeThermalHelper {

    private static OplusHoraeThermalHelper sInstance;

    public OplusHoraeThermalHelper() {}

    public OplusHoraeThermalHelper(int mode) {}

    public static OplusHoraeThermalHelper getInstance() {
        if (sInstance == null) {
            sInstance = new OplusHoraeThermalHelper();
        }
        return sInstance;
    }

    /** Returns shell temperatures in milli-degrees Celsius. */
    public int[] getAllShellTemps() {
        return new int[0];
    }

    /** Returns ambient temperature in tenths of degrees Celsius. */
    public int getAmbientThermal() {
        return 0;
    }

    /** Returns current thermal level as a float (0.0 = cool, 1.0 = hot). */
    public float getCurrentThermal() {
        return 0.0f;
    }

    /** Returns [shellTemp, sensorType] pair. */
    public int[] getShellTempAndType() {
        return new int[]{0, 0};
    }

    /** Returns thermal status code (0 = none, 1 = light, 2 = moderate, 3 = severe, 4 = critical). */
    public int getThermalStatus() {
        return 0;
    }
}
