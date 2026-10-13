package com.oplus.widget;

public class OplusResolverPagerAdapter extends com.oplus.widget.OplusPagerAdapter implements com.oplus.resolver.IOplusResolverGridItemClickListener {
    public static int COLUMN_SIZE = 0;
    public static final java.lang.String KEY_FOLDING_MODE = "oplus_system_folding_mode";
    public static final java.lang.String TAG = "OplusResolverPagerAdapter";
    public OplusResolverPagerAdapter(android.content.Context p0, java.util.List<android.content.pm.ResolveInfo> p1, android.content.Intent p2, android.widget.CheckBox p3, boolean p4) { }
    public OplusResolverPagerAdapter(android.content.Context p0, java.util.List<com.oplus.widget.OplusGridView> p1, java.util.List<android.content.pm.ResolveInfo> p2, int p3, android.content.Intent p4, android.widget.CheckBox p5, android.app.Dialog p6, boolean p7) { }
    public OplusResolverPagerAdapter(boolean p0, android.os.UserHandle p1, android.content.Context p2, java.util.List<android.content.pm.ResolveInfo> p3, android.content.Intent p4, android.widget.CheckBox p5, boolean p6) { }
    public void OnItemClick(int p0) { }
    public void OnItemLongClick(int p0) { }
    public void destroyItem(android.view.ViewGroup p0, int p1, java.lang.Object p2) { }
    public int getCount() { return 0; }
    public int getItemPosition(java.lang.Object p0) { return 0; }
    public java.lang.Object instantiateItem(android.view.ViewGroup p0, int p1) { return null; }
    public boolean isViewFromObject(android.view.View p0, java.lang.Object p1) { return false; }
    public void loadBitmap(int p0, com.oplus.widget.OplusGridView p1) { }
    public void notifyDataSetChanged() { }
    public void onInstantiateDataFinished(int p0, java.util.List<com.oplus.widget.OplusItem> p1) { }
    public void onItemClick(int p0, int p1) { }
    public void onItemLongClick(int p0, int p1) { }
    public void onItemLongClick(int p0, int p1, android.view.View p2) { }
    public void setChosenComponentSender(android.content.IntentSender p0) { }
    public void unRegister() { }
    public void updateIntent(android.content.Intent p0) { }
    public void updatePageSize(boolean p0) { }
    public void updatePageSize(boolean p0, android.os.UserHandle p1) { }
}
