package com.oplus.resolver;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;

import com.oplus.widget.OplusItem;

/**
 * Icon and label of a share target for the OPLUS gallery's share page. OPLUS draws its themed
 * ("UX") icons here; this returns what the package manager has for the activity.
 */
public class OplusGalleryLoadIconHelper {

    public static final String TAG = "OplusGalleryLoadIconHelper";

    private static OplusGalleryLoadIconHelper sInstance;

    private final Context mContext;

    public OplusGalleryLoadIconHelper(Context context) {
        mContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }

    public static synchronized OplusGalleryLoadIconHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new OplusGalleryLoadIconHelper(context);
        }
        return sInstance;
    }

    public OplusItem getOplusItem(Intent intent, ResolveInfo info, PackageManager pm) {
        OplusItem item = new OplusItem();
        if (info == null) {
            return item;
        }
        if (pm == null) {
            pm = mContext.getPackageManager();
        }
        CharSequence label = info.loadLabel(pm);
        String text = label != null ? label.toString() : null;
        item.setContext(mContext);
        item.setIcon(info.loadIcon(pm));
        item.setText(text);
        item.setLabel(text);
        if (info.activityInfo != null) {
            item.setPackageName(info.activityInfo.packageName);
        }
        return item;
    }

    public Drawable loadUxIcon(Intent intent, ResolveInfo info) {
        return info != null ? info.loadIcon(mContext.getPackageManager()) : null;
    }

    public void updateUserHandle(UserHandle user) {
    }
}
