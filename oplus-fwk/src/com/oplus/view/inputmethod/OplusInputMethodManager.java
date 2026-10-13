package com.oplus.view.inputmethod;

public final class OplusInputMethodManager {
    public static com.oplus.view.inputmethod.OplusInputMethodManager getInstance() { if (sStub == null) sStub = new OplusInputMethodManager(); return sStub; }
    public static void hideSoftInput(android.content.Context p0) { }
    public boolean clearDefaultInputMethodByCustomize() { return false; }
    public void commitTextByOtherSide() { }
    public java.lang.String getDefaultInputMethodByCustomize() { return null; }
    public int getInputMethodWindowVisibleHeight(android.content.Context p0) { return 0; }
    public void hideCurrentInputMethod() { }
    public void registerCursorAnchorInfoListener(android.os.ResultReceiver p0) { }
    public boolean registerInputMethodObserver(com.oplus.view.inputmethod.OplusInputMethodObserver p0, int p1) { return false; }
    public void registerInputMethodSynergyService(android.content.ComponentName p0, boolean p1) { }
    public void reportImeJank(android.content.Context p0, java.lang.String p1, int p2, java.lang.String p3) { }
    public boolean setDefaultInputMethodByCustomize(java.lang.String p0) { return false; }
    public void setShowSoftInputEnabled(boolean p0) { }
    public void unregisterCursorAnchorInfoListener(android.os.ResultReceiver p0) { }
    public boolean unregisterInputMethodObserver(com.oplus.view.inputmethod.OplusInputMethodObserver p0) { return false; }
    public void updateCursorAnchorInfoToSynergy(android.view.inputmethod.CursorAnchorInfo p0) { }
    public void updateTouchDeviceId(int p0) { }
    private OplusInputMethodManager() { }
    private static OplusInputMethodManager sStub;

    final static class OplusInputMethodManagerHolder {
    }
}
