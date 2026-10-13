package android.app;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;

import com.oplus.app.OplusAppInfo;
import com.oplus.osense.complexscene.OplusComplexSceneObserver;

import java.util.ArrayList;
import java.util.List;

public class OplusActivityManager {

    private static OplusActivityManager sOplusActivityManager = null;
    private static ArrayList<OplusAppInfo> sTopAppInfos = new ArrayList<OplusAppInfo>();

    public static OplusActivityManager getInstance() {
        if (sOplusActivityManager == null) {
            sOplusActivityManager = new OplusActivityManager();
        }
        return sOplusActivityManager;
    }

    public List<OplusAppInfo> getAllTopAppInfos() throws RemoteException {
        return (ArrayList<OplusAppInfo>) sTopAppInfos.clone();
    }

    public void startActivity(Intent intent) {}

    public boolean requestDeviceFolded(int state, boolean folded) {
        return false;
    }

    public ComponentName getTopActivityComponentName() {
        return null;
    }

    public boolean registerComplexSceneObserver(Bundle options,
            OplusComplexSceneObserver observer) {
        return false;
    }

    public boolean unregisterComplexSceneObserver(Bundle options,
            OplusComplexSceneObserver observer) {
        return false;
    }

    public static java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, boolean p1) { return null; }
    public java.util.List<java.lang.String> getTaskPkgList(int p0) throws android.os.RemoteException { return null; }
    public void handleAppFromControlCenter(java.lang.String p0, int p1) throws android.os.RemoteException { }
    public boolean isAppCallRefuseMode() throws android.os.RemoteException { return false; }
    public void setAppCallRefuseMode(boolean p0) throws android.os.RemoteException { }
    public void setChildSpaceMode(boolean p0) throws android.os.RemoteException { }
    public void setPreventIndulgeController(com.oplus.app.IOplusAppStartController p0) throws android.os.RemoteException { }

    public void addBackgroundRestrictedInfo(String p0, java.util.List<String> p1) { }
    public void addPreventIndulgeList(java.util.List<String> p0) { }
    public void setAllowLaunchApps(java.util.List<String> p0) { }
}
