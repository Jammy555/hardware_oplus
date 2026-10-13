package com.oplus.widget;

public class OplusItem {
    public static final int ITEM_FIFTH = 4;
    public static final int ITEM_FIRST = 0;
    public static final int ITEM_FOURTH = 3;
    public static final int ITEM_SECOND = 1;
    public static final int ITEM_THIRD = 2;
    public OplusItem() { }
    public android.graphics.drawable.Drawable getBackgroud() { return null; }
    public android.content.Context getContext() { return null; }
    public android.graphics.drawable.Drawable getIcon() { return null; }
    public java.lang.String getLabel() { return null; }
    public com.oplus.widget.OplusItem.OnItemClickListener getOnItemClickListener() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getText() { return null; }
    public boolean isPinned() { return false; }
    public void setBackgroud(android.graphics.drawable.Drawable p0) { }
    public void setContext(android.content.Context p0) { }
    public void setIcon(android.graphics.drawable.Drawable p0) { }
    public void setLabel(java.lang.String p0) { }
    public void setOnItemClickListener(com.oplus.widget.OplusItem.OnItemClickListener p0) { }
    public void setPackageName(java.lang.String p0) { }
    public void setPinned(java.lang.Boolean p0) { }
    public void setText(java.lang.String p0) { }

    public static class Builder {
        public Builder(android.content.Context p0) { }
        public com.oplus.widget.OplusItem create() { return null; }
        public com.oplus.widget.OplusItem.Builder setBackgroud(int p0) { return null; }
        public com.oplus.widget.OplusItem.Builder setBackgroud(android.graphics.drawable.Drawable p0) { return null; }
        public com.oplus.widget.OplusItem.Builder setIcon(int p0) { return null; }
        public com.oplus.widget.OplusItem.Builder setIcon(android.graphics.drawable.Drawable p0) { return null; }
        public com.oplus.widget.OplusItem.Builder setLabel(int p0) { return null; }
        public com.oplus.widget.OplusItem.Builder setLabel(java.lang.String p0) { return null; }
        public com.oplus.widget.OplusItem.Builder setOnItemClickListener(com.oplus.widget.OplusItem.OnItemClickListener p0) { return null; }
        public com.oplus.widget.OplusItem.Builder setPackageName(java.lang.String p0) { return null; }
        public com.oplus.widget.OplusItem.Builder setText(int p0) { return null; }
        public com.oplus.widget.OplusItem.Builder setText(java.lang.String p0) { return null; }
    }

    public interface OnItemClickListener {
        public void OnMenuItemClick(int p0);
    }
}
