package com.oplus.wrapper.content.pm;

/* JADX INFO: loaded from: classes2.dex */
public class ResolveInfo {
    private final android.content.pm.ResolveInfo mResolveInfo;

    @Deprecated
    public ResolveInfo(android.content.pm.ResolveInfo resolveInfo) {
        this.mResolveInfo = resolveInfo;
    }

    public static android.content.pm.ComponentInfo getComponentInfo(android.content.pm.ResolveInfo target) {
        return target.getComponentInfo();
    }

    @Deprecated
    public android.content.pm.ComponentInfo getComponentInfo() {
        return this.mResolveInfo.getComponentInfo();
    }

    public static boolean isSystem(android.content.pm.ResolveInfo target) {
        return target.system;
    }

    @Deprecated
    public boolean isSystem() {
        return this.mResolveInfo.system;
    }

    public static int getTargetUserId(android.content.pm.ResolveInfo target) {
        return target.targetUserId;
    }

    @Deprecated
    public int getTargetUserId() {
        return this.mResolveInfo.targetUserId;
    }
}
