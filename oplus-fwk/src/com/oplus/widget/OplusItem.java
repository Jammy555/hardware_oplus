package com.oplus.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;

/** One entry of an OPLUS menu or share grid: icon, texts and a click listener. */
public class OplusItem {

    public static final int ITEM_FIFTH = 4;
    public static final int ITEM_FIRST = 0;
    public static final int ITEM_FOURTH = 3;
    public static final int ITEM_SECOND = 1;
    public static final int ITEM_THIRD = 2;

    private Drawable mBackgroud;
    private Context mContext;
    private Drawable mIcon;
    private String mLabel;
    private OnItemClickListener mOnItemClickListener;
    private String mPackageName;
    private boolean mPinned;
    private String mText;

    public OplusItem() {
    }

    public Drawable getBackgroud() {
        return mBackgroud;
    }

    public Context getContext() {
        return mContext;
    }

    public Drawable getIcon() {
        return mIcon;
    }

    public String getLabel() {
        return mLabel;
    }

    public OnItemClickListener getOnItemClickListener() {
        return mOnItemClickListener;
    }

    public String getPackageName() {
        return mPackageName;
    }

    public String getText() {
        return mText;
    }

    public boolean isPinned() {
        return mPinned;
    }

    public void setBackgroud(Drawable backgroud) {
        mBackgroud = backgroud;
    }

    public void setContext(Context context) {
        mContext = context;
    }

    public void setIcon(Drawable icon) {
        mIcon = icon;
    }

    public void setLabel(String label) {
        mLabel = label;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mOnItemClickListener = listener;
    }

    public void setPackageName(String packageName) {
        mPackageName = packageName;
    }

    public void setPinned(Boolean pinned) {
        mPinned = pinned != null && pinned;
    }

    public void setText(String text) {
        mText = text;
    }

    public static class Builder {

        private final OplusItem mItem = new OplusItem();

        public Builder(Context context) {
            mItem.mContext = context;
        }

        public OplusItem create() {
            return mItem;
        }

        public Builder setBackgroud(int resId) {
            mItem.mBackgroud = mItem.mContext.getDrawable(resId);
            return this;
        }

        public Builder setBackgroud(Drawable backgroud) {
            mItem.mBackgroud = backgroud;
            return this;
        }

        public Builder setIcon(int resId) {
            mItem.mIcon = mItem.mContext.getDrawable(resId);
            return this;
        }

        public Builder setIcon(Drawable icon) {
            mItem.mIcon = icon;
            return this;
        }

        public Builder setLabel(int resId) {
            mItem.mLabel = mItem.mContext.getString(resId);
            return this;
        }

        public Builder setLabel(String label) {
            mItem.mLabel = label;
            return this;
        }

        public Builder setOnItemClickListener(OnItemClickListener listener) {
            mItem.mOnItemClickListener = listener;
            return this;
        }

        public Builder setPackageName(String packageName) {
            mItem.mPackageName = packageName;
            return this;
        }

        public Builder setText(int resId) {
            mItem.mText = mItem.mContext.getString(resId);
            return this;
        }

        public Builder setText(String text) {
            mItem.mText = text;
            return this;
        }
    }

    public interface OnItemClickListener {
        void OnMenuItemClick(int position);
    }
}
