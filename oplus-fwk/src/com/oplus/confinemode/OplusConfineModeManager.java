package com.oplus.confinemode;

public class OplusConfineModeManager {
    public static final int OPLUS_CONFINE_MODE_CHILDREN = 2;
    public static final int OPLUS_CONFINE_MODE_DRIVE = 1;
    public static final int OPLUS_CONFINE_MODE_FOCUS = 4;
    public static final int OPLUS_CONFINE_MODE_GAME_FOCUS = 8;
    public static final int OPLUS_CONFINE_MODE_LEARN = 16;
    public static final int OPLUS_CONFINE_MODE_NORMAL = 0;
    public static final int OPLUS_CONFINE_MODE_RETAIL = 32;
    public static final int OPLUS_PERMIT_TYPE_APPEND = 2;
    public static final int OPLUS_PERMIT_TYPE_CLEAR = 0;
    public static final int OPLUS_PERMIT_TYPE_CPN = 8;
    public static final int OPLUS_PERMIT_TYPE_PKG = 4;
    public static final int OPLUS_PERMIT_TYPE_REPLACE = 1;
    public static final int OPLUS_WITH_BINDER_LINK_FLAG = 536870912;
    public static com.oplus.confinemode.OplusConfineModeManager getInstance() { if (sStub == null) sStub = new OplusConfineModeManager(); return sStub; }
    public int getConfineMode() { return 0; }
    public boolean registerConfineModeObserver(android.content.Context p0, com.oplus.confinemode.OplusConfineModeManager.ConfineModeObserver p1) { return false; }
    public void setConfineMode(int p0, boolean p1) { }
    public void setPermitList(int p0, int p1, java.util.List<java.lang.String> p2, boolean p3) { }
    public boolean unregisterConfineModeObserver(android.content.Context p0, com.oplus.confinemode.OplusConfineModeManager.ConfineModeObserver p1) { return false; }
    private OplusConfineModeManager() { }
    private static OplusConfineModeManager sStub;

    public interface ConfineModeObserver {
        public void onChange(int p0, int p1, int p2);
    }

    static class ConfineModeObserverDelegate extends com.oplus.confinemode.IOplusConfineModeObserver.Stub {
        public ConfineModeObserverDelegate(com.oplus.confinemode.OplusConfineModeManager p0, com.oplus.confinemode.OplusConfineModeManager.ConfineModeObserver p1) { }
        public void onChange(int p0, int p1, int p2) { }
    }
}
