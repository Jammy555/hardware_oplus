package com.oplus.widget;

public class OplusMenuView extends android.view.View {
    static final int MAX_MENU_ITEM_COUNTS = 5;
    static int[] STATE_ENABLED;
    static int[] STATE_NORMAL;
    static int[] STATE_PRESSED;
    static int[] STATE_UNENABLED;
    static final int VIEW_STATE_ENABLED = 16842910;
    static final int VIEW_STATE_PRESSED = 16842919;
    public OplusMenuView(android.content.Context p0) { super((android.content.Context) null); }
    public OplusMenuView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context) null); }
    public OplusMenuView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context) null); }
    public void clearAccessibilityFocus() { }
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void drawableStateChanged() { }
    public void onDraw(android.graphics.Canvas p0) { }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    boolean restoreAccessibilityFocus(int p0) { return false; }
    public void setItem(java.util.List<com.oplus.widget.OplusItem> p0) { }
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
}
