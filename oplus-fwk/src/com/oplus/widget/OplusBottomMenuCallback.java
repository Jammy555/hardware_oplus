package com.oplus.widget;

public interface OplusBottomMenuCallback extends com.oplus.widget.OplusPagerCallback {
    public static final int INVALID_POSITION = -1;
    public static final int UPDATE_MODE_ANIMATE = 1;
    public static final int UPDATE_MODE_DIRECT = 0;
    public static final int UPDATE_MODE_OUTER = 2;
    public void lockMenuUpdate();
    public void setMenuUpdateMode(int p0);
    public void unlockMenuUpdate();
    public void updateMenuScrollData();
    public void updateMenuScrollPosition(int p0, float p1);
    public void updateMenuScrollState(int p0);

    public interface Updater {
        public android.animation.Animator getUpdater(int p0, int p1);
        public boolean visibleFirst();
    }
}
