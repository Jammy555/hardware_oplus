package android.view;

public class OplusWindowManager {

    public OplusWindowManager() {}

    public void requestKeyguard(String command) {}

    public boolean setPreferredDisplayMode(int modeId) {
        return false;
    }

    public java.util.List<com.oplus.app.OplusWindowInfo> getAllVisibleWindowInfo() throws android.os.RemoteException { return null; }
    public int getLongshotSurfaceLayerByType(int p0) throws android.os.RemoteException { return 0; }
    public com.oplus.app.OplusScreenShotResult getScreenshot(com.oplus.app.OplusScreenShotOptions p0) throws android.os.RemoteException { return null; }
    public boolean isInputShow() throws android.os.RemoteException { return false; }
    public void registerOplusWindowStateObserver(android.view.IOplusWindowStateObserver p0) throws android.os.RemoteException { }
    public void unregisterOplusWindowStateObserver(android.view.IOplusWindowStateObserver p0) throws android.os.RemoteException { }

    public void getFocusedWindowFrame(android.graphics.Rect p0) throws android.os.RemoteException { }
    public java.util.List<android.graphics.Rect> getSplitAreaRegion() throws android.os.RemoteException { return new java.util.ArrayList<>(); }
}
