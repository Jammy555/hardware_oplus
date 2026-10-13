package com.oplus.widget;

public class OplusGridView extends android.view.View {
    public static final int COLUMN_SIZE = 4;
    public static final java.lang.String TAG = "OplusGridView";
    public int mPageNumber;
    public OplusGridView(android.content.Context p0) { super((android.content.Context) null); }
    public OplusGridView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context) null); }
    public OplusGridView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context) null); }
    public static int get2DimenArrayCounts(com.oplus.widget.OplusItem[][] p0) { return 0; }
    public static int getNum(java.lang.String p0) { return 0; }
    public static boolean isChinese(java.lang.String p0) { return false; }
    public static java.lang.String trancateText(java.lang.String p0, int p1) { return null; }
    public void clearAccessibilityFocus() { }
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    com.oplus.widget.OplusItem getAccessibilityFocus() { return null; }
    public com.oplus.widget.OplusItem[][] getAppInfo() { return null; }
    com.oplus.widget.OplusItem getAppinfo(int p0) { return null; }
    public void initGetureDetecor() { }
    protected void onDraw(android.graphics.Canvas p0) { }
    protected void onMeasure(int p0, int p1) { }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    boolean restoreAccessibilityFocus(int p0) { return false; }
    public void setAppInfo(com.oplus.widget.OplusItem[][] p0) { }
    public void setMoreIconIndex(int p0) { }
    public void setOnItemClickListener(com.oplus.widget.OplusGridView.OnItemClickListener p0) { }
    public void setPageCount(int p0) { }
    public void setPagerSize(int p0) { }
    public void startExpandAnimation() { }

    public interface OnItemClickListener {
        public void OnItemClick(int p0);
        public void OnItemLongClick(int p0);
    }

    static class OplusViewTouchHelper extends com.android.internal.widget.ExploreByTouchHelper {
        public OplusViewTouchHelper(com.oplus.widget.OplusGridView p0, android.view.View p1) { super((android.view.View) null); }
        public void clearFocusedVirtualView() { }
        protected int getVirtualViewAt(float p0, float p1) { return 0; }
        protected void getVisibleVirtualViews(android.util.IntArray p0) { }
        protected boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2) { return false; }
        protected void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1) { }
        protected void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1) { }
        public void setFocusedVirtualView(int p0) { }
    }
}
