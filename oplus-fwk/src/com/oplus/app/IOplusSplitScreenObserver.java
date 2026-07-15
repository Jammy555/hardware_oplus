package com.oplus.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface IOplusSplitScreenObserver extends IInterface {
    abstract class Stub extends Binder implements IOplusSplitScreenObserver {
        public Stub() {
            attachInterface(this, "com.oplus.app.IOplusSplitScreenObserver");
        }

        @Override
        public IBinder asBinder() {
            return this;
        }
    }
}
