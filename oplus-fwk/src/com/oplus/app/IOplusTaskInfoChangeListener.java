package com.oplus.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface IOplusTaskInfoChangeListener extends IInterface {
    void onVisibleTasksInfoChange(java.util.List<?> tasks) throws android.os.RemoteException;

    public static abstract class Stub extends Binder implements IOplusTaskInfoChangeListener {
        public Stub() {
            this.attachInterface(this, "com.oplus.app.IOplusTaskInfoChangeListener");
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onVisibleTasksInfoChange(java.util.List<?> tasks) {}
    }
}
