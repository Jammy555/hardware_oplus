package com.oplus.shortcuts.chooser;

public interface TargetInfo {
    public static android.content.Intent mergeRefinementIntoMatchingBaseIntent(android.content.Intent p0, android.content.Intent p1) { return null; }
    public static void prepareIntentForCrossProfileLaunch(android.app.Activity p0, android.content.Intent p1, int p2) { }
    public static void prepareIntentForCrossProfileLaunch(android.content.Intent p0, int p1) { }
    public static void refreshIntentCreatorToken(android.content.Intent p0) { }
    public java.util.ArrayList<com.oplus.shortcuts.chooser.DisplayResolveInfo> getAllDisplayTargets();
    public java.util.List<android.content.Intent> getAllSourceIntents();
    public default android.content.ComponentName getChooserTargetComponentName() { return null; }
    public default com.oplus.wrapper.app.prediction.AppTarget getDirectShareAppTarget() { return null; }
    public default java.lang.String getDirectShareShortcutId() { return null; }
    public default android.content.pm.ShortcutInfo getDirectShareShortcutInfo() { return null; }
    public com.oplus.shortcuts.chooser.TargetInfo.IconHolder getDisplayIconHolder();
    public java.lang.CharSequence getDisplayLabel();
    public default com.oplus.shortcuts.chooser.DisplayResolveInfo getDisplayResolveInfo() { return null; }
    public java.lang.CharSequence getExtendedInfo();
    public default float getModifiedScore() { return 0f; }
    public android.content.pm.ResolveInfo getResolveInfo();
    public android.content.ComponentName getResolvedComponentName();
    public android.content.Intent getResolvedIntent();
    public android.content.Intent getTargetIntent();
    public default boolean hasDisplayIcon() { return false; }
    public default boolean isChooserTargetInfo() { return false; }
    public default boolean isDisplayResolveInfo() { return false; }
    public default boolean isEmptyTargetInfo() { return false; }
    public default boolean isInDirectShareMetricsCategory() { return false; }
    public default boolean isMultiDisplayResolveInfo() { return false; }
    public default boolean isNotSelectableTargetInfo() { return false; }
    public boolean isPinned();
    public default boolean isPlaceHolderTargetInfo() { return false; }
    public default boolean isSelectableTargetInfo() { return false; }
    public default boolean isSimilar(com.oplus.shortcuts.chooser.TargetInfo p0) { return false; }
    public boolean isSuspended();
    public boolean startAsCaller(android.app.Activity p0, android.os.Bundle p1, int p2);
    public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2);
    public com.oplus.shortcuts.chooser.TargetInfo tryToCloneWithAppliedRefinement(android.content.Intent p0);

    public interface IconHolder {
        public android.graphics.drawable.Drawable getDisplayIcon();
        public void setDisplayIcon(android.graphics.drawable.Drawable p0);
    }

    public final static class SettableIconHolder implements com.oplus.shortcuts.chooser.TargetInfo.IconHolder {
        public SettableIconHolder() { }
        public android.graphics.drawable.Drawable getDisplayIcon() { return null; }
        public void setDisplayIcon(android.graphics.drawable.Drawable p0) { }
    }
}
