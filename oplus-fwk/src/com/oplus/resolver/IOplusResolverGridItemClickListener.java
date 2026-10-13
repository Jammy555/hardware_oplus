package com.oplus.resolver;

public interface IOplusResolverGridItemClickListener {
    public void onItemClick(int p0, int p1);
    public void onItemLongClick(int p0, int p1);
    public default void onItemLongClick(int p0, int p1, android.view.View p2) { }
}
