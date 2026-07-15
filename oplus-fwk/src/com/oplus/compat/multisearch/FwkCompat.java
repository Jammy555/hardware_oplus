package com.oplus.compat.multisearch;

public class FwkCompat {

    private static FwkCompat sInstance;

    public static FwkCompat getInstance() {
        if (sInstance == null) {
            sInstance = new FwkCompat();
        }
        return sInstance;
    }

    public FwkCompat() {}

    public void setFocusedTask(int taskId) {}

    // lambda stubs (r8 synthetic)
    public String lambda$setFocusedTask$0(int taskId) { return ""; }
    public String a(int i) { return ""; }
}
