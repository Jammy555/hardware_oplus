package android.app;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.oplus.app.IOplusProtectConnection;
import com.oplus.app.OplusAppInfo;
import com.oplus.app.OplusTaskInfoChangeListener;
import java.util.ArrayList;
import java.util.List;
import oplus.app.OplusCommonManager;

public class OplusActivityManager extends OplusCommonManager {

    private static OplusActivityManager sOplusActivityManager;
    private static ArrayList<OplusAppInfo> sTopAppInfos = new ArrayList<>();

    public OplusActivityManager() {
        super(Context.ACTIVITY_SERVICE);
    }

    public static OplusActivityManager getInstance() {
        if (sOplusActivityManager == null) {
            sOplusActivityManager = new OplusActivityManager();
        }
        return sOplusActivityManager;
    }

    public List<OplusAppInfo> getAllTopAppInfos() throws RemoteException {
        return new ArrayList<>();
    }

    public boolean requestDeviceFolded(int displayId, boolean folded) {
        return false;
    }

    public void startActivity(Intent intent) {}

    public boolean registerTaskInfoChangeListener(
            OplusTaskInfoChangeListener listener, int flags, int displayId) {
        return false;
    }

    public boolean unregisterTaskInfoChangeListener(
            OplusTaskInfoChangeListener listener) {
        return false;
    }

    public void addStageProtectInfo(String callerPkg, String pkg, long timeout,
            IOplusProtectConnection connection) {}

    public void removeStageProtectInfo(String pkg) {}
}
