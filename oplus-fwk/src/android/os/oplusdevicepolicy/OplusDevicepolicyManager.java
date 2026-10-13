package android.os.oplusdevicepolicy;

public class OplusDevicepolicyManager {
    public static final int CUSTOMIZE_DATA_TYPE = 1;
    public static final java.lang.String SERVICE_NAME = "oplusdevicepolicy";
    public static final int SYSTEM_DATA_TYPE = 0;
    public static final android.os.oplusdevicepolicy.OplusDevicepolicyManager getInstance() { if (sStub == null) sStub = new OplusDevicepolicyManager(); return sStub; }
    public boolean addList(java.lang.String p0, java.util.List p1, int p2) { return false; }
    public boolean clearData(int p0) { return false; }
    public boolean clearList(int p0) { return false; }
    public boolean getBoolean(java.lang.String p0, int p1, boolean p2) { return false; }
    public java.lang.String getData(java.lang.String p0, int p1) { return null; }
    public java.util.List<java.lang.String> getList(java.lang.String p0, int p1) { return null; }
    public boolean registerOplusDevicepolicyObserver(java.lang.String p0, android.os.oplusdevicepolicy.OplusDevicepolicyManager.OplusDevicePolicyObserver p1) { return false; }
    public boolean removeData(java.lang.String p0, int p1) { return false; }
    public boolean removeList(java.lang.String p0, int p1) { return false; }
    public boolean removePartListData(java.lang.String p0, java.util.List p1, int p2) { return false; }
    public boolean setData(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public boolean setList(java.lang.String p0, java.util.List p1, int p2) { return false; }
    public boolean unregisterOplusDevicePolicyObserver(android.os.oplusdevicepolicy.OplusDevicepolicyManager.OplusDevicePolicyObserver p0) { return false; }
    private OplusDevicepolicyManager() { }
    private static OplusDevicepolicyManager sStub;

    public interface OplusDevicePolicyObserver {
        public void onOplusDevicePolicyUpdate(java.lang.String p0, java.lang.String p1);
        public void onOplusDevicePolicyUpdate(java.lang.String p0, java.util.List<java.lang.String> p1);
    }

    static class OplusDevicePolicyObserverDelegate extends android.os.oplusdevicepolicy.IOplusDevicePolicyObserver.Stub {
        public OplusDevicePolicyObserverDelegate(android.os.oplusdevicepolicy.OplusDevicepolicyManager p0, android.os.oplusdevicepolicy.OplusDevicepolicyManager.OplusDevicePolicyObserver p1) { }
        public void onOplusDevicePolicyListUpdate(java.lang.String p0, java.util.List<java.lang.String> p1) { }
        public void onOplusDevicePolicyValueUpdate(java.lang.String p0, java.lang.String p1) { }
    }
}
