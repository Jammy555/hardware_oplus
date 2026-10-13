package com.oplus.wrapper.graphics;

public class BitmapFactory {

    private BitmapFactory() {
    }

    public static class Options {

        private final android.graphics.BitmapFactory.Options mOptions;
        // OPLUS keeps this flag in a field it adds to android.graphics.BitmapFactory.Options.
        private boolean mInPostProc;

        public Options(android.graphics.BitmapFactory.Options options) {
            mOptions = options;
        }

        public boolean getInPostProc() {
            return mInPostProc;
        }

        public void setInPostProc(boolean inPostProc) {
            mInPostProc = inPostProc;
        }
    }
}
