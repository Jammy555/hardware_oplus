package com.oplus.widget;

public class OplusViewPager extends android.view.ViewGroup {
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public OplusViewPager(android.content.Context p0) { super((android.content.Context) null); }
    public OplusViewPager(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context) null); }
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1, int p2) { }
    com.oplus.widget.OplusViewPager.ItemInfo addNewItem(int p0, int p1) { return null; }
    public void addOnAdapterChangeListener(com.oplus.widget.OplusViewPager.OnAdapterChangeListener p0) { }
    public void addOnPageChangeListener(com.oplus.widget.OplusViewPager.OnPageChangeListener p0) { }
    public void addTouchables(java.util.ArrayList<android.view.View> p0) { }
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) { }
    public boolean arrowScroll(int p0) { return false; }
    public boolean beginFakeDrag() { return false; }
    public void bindSplitMenuCallback(com.oplus.widget.OplusBottomMenuCallback p0) { }
    protected boolean canScroll(android.view.View p0, boolean p1, int p2, int p3, int p4) { return false; }
    public boolean canScrollHorizontally(int p0) { return false; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public void computeScroll() { }
    void dataSetChanged() { }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    float distanceInfluenceForSnapDuration(float p0) { return 0f; }
    public void draw(android.graphics.Canvas p0) { }
    protected void drawableStateChanged() { }
    public void endFakeDrag() { }
    public boolean executeKeyEvent(android.view.KeyEvent p0) { return false; }
    public void fakeDragBy(float p0) { }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public com.oplus.widget.OplusPagerAdapter getAdapter() { return null; }
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    public java.lang.Object getCurrent() { return null; }
    public int getCurrentItem() { return 0; }
    boolean getDragState() { return false; }
    public int getOffscreenPageLimit() { return 0; }
    public int getPageMargin() { return 0; }
    int getScrollState() { return 0; }
    com.oplus.widget.OplusViewPager.ItemInfo infoForAnyChild(android.view.View p0) { return null; }
    com.oplus.widget.OplusViewPager.ItemInfo infoForChild(android.view.View p0) { return null; }
    com.oplus.widget.OplusViewPager.ItemInfo infoForCurrentScrollPosition() { return null; }
    com.oplus.widget.OplusViewPager.ItemInfo infoForPosition(int p0) { return null; }
    void initViewPager() { }
    public boolean isFakeDragging() { return false; }
    public boolean isLayoutRtl() { return false; }
    protected void onAttachedToWindow() { }
    protected void onDetachedFromWindow() { }
    protected void onDraw(android.graphics.Canvas p0) { }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) { }
    protected void onMeasure(int p0, int p1) { }
    protected void onPageScrolled(int p0, float p1, int p2) { }
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    public void onRestoreInstanceState(android.os.Parcelable p0) { }
    public android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onSizeChanged(int p0, int p1, int p2, int p3) { }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    boolean pageLeft() { return false; }
    boolean pageRight() { return false; }
    void populate() { }
    void populate(int p0) { }
    public void removeOnAdapterChangeListener(com.oplus.widget.OplusViewPager.OnAdapterChangeListener p0) { }
    public void removeOnPageChangeListener(com.oplus.widget.OplusViewPager.OnPageChangeListener p0) { }
    public void removeView(android.view.View p0) { }
    public void setAdapter(com.oplus.widget.OplusPagerAdapter p0) { }
    protected void setChildrenDrawingOrderEnabled(boolean p0) { }
    public void setCurrentItem(int p0) { }
    public void setCurrentItem(int p0, boolean p1) { }
    boolean setCurrentItemInternal(int p0, boolean p1, boolean p2) { return false; }
    boolean setCurrentItemInternal(int p0, boolean p1, boolean p2, int p3) { return false; }
    public void setDisableTouchEvent(boolean p0) { }
    com.oplus.widget.OplusViewPager.OnPageChangeListener setInternalPageChangeListener(com.oplus.widget.OplusViewPager.OnPageChangeListener p0) { return null; }
    public void setOffscreenPageLimit(int p0) { }
    public void setOnAdapterChangeListener(com.oplus.widget.OplusViewPager.OnAdapterChangeListener p0) { }
    public void setOnPageChangeListener(com.oplus.widget.OplusViewPager.OnPageChangeListener p0) { }
    public void setOnPageMenuChangeListener(com.oplus.widget.OplusViewPager.OnPageMenuChangeListener p0) { }
    public void setPageMargin(int p0) { }
    public void setPageMarginDrawable(int p0) { }
    public void setPageMarginDrawable(android.graphics.drawable.Drawable p0) { }
    public void setPageTransformer(boolean p0, com.oplus.widget.OplusViewPager.PageTransformer p1) { }
    void smoothScrollTo(int p0, int p1) { }
    void smoothScrollTo(int p0, int p1, int p2) { }
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }

    interface Decor {
    }

    static class ItemInfo {
        java.lang.Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;
        ItemInfo() { }
        public java.lang.String toString() { return null; }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;
        public LayoutParams() { super((android.view.ViewGroup.LayoutParams) null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams) null); }
    }

    static class MyAccessibilityDelegate extends android.view.View.AccessibilityDelegate {
        MyAccessibilityDelegate(com.oplus.widget.OplusViewPager p0) { }
        public void onInitializeAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { }
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) { }
        public boolean performAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    }

    public interface OnAdapterChangeListener {
        public void onAdapterChanged(com.oplus.widget.OplusPagerAdapter p0, com.oplus.widget.OplusPagerAdapter p1);
    }

    public interface OnPageChangeListener {
        public void onPageScrollStateChanged(int p0);
        public void onPageScrolled(int p0, float p1, int p2);
        public void onPageSelected(int p0);
    }

    public interface OnPageMenuChangeListener {
        public void onPageMenuScrollDataChanged();
        public void onPageMenuScrollStateChanged(int p0);
        public void onPageMenuScrolled(int p0, float p1);
        public void onPageMenuSelected(int p0);
    }

    public interface PageTransformer {
        public void transformPage(android.view.View p0, float p1);
    }

    static class PagerObserver extends android.database.DataSetObserver {
        public void onChanged() { }
        public void onInvalidated() { }
    }

    public static class SavedState extends android.view.View.BaseSavedState {
        public static android.os.Parcelable.ClassLoaderCreator<com.oplus.widget.OplusViewPager.SavedState> CREATOR;
        android.os.Parcelable adapterState;
        java.lang.ClassLoader loader;
        int position;
        SavedState(android.os.Parcel p0, java.lang.ClassLoader p1) { super((android.os.Parcel) null); }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel) null); }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) { }
    }

    public static class SimpleOnPageChangeListener implements com.oplus.widget.OplusViewPager.OnPageChangeListener {
        public SimpleOnPageChangeListener() { }
        public void onPageScrollStateChanged(int p0) { }
        public void onPageScrolled(int p0, float p1, int p2) { }
        public void onPageSelected(int p0) { }
    }

    static class ViewPositionComparator implements java.util.Comparator<android.view.View> {
        ViewPositionComparator() { }
        public int compare(android.view.View p0, android.view.View p1) { return 0; }
    }
}
