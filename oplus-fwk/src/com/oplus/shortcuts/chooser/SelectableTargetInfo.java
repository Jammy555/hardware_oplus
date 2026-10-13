package com.oplus.shortcuts.chooser;

public final class SelectableTargetInfo extends com.oplus.shortcuts.chooser.ChooserTargetInfo {
    public static com.oplus.shortcuts.chooser.TargetInfo newSelectableTargetInfo(com.oplus.shortcuts.chooser.DisplayResolveInfo p0, android.content.pm.ResolveInfo p1, android.content.Intent p2, android.content.ComponentName p3, java.lang.CharSequence p4, android.graphics.drawable.Icon p5, android.os.Bundle p6, float p7, android.content.pm.ShortcutInfo p8, com.oplus.wrapper.app.prediction.AppTarget p9, android.content.Intent p10) { return null; }
    public java.util.List<android.content.Intent> getAllSourceIntents() { return null; }
    public android.content.ComponentName getChooserTargetComponentName() { return null; }
    public android.graphics.drawable.Icon getChooserTargetIcon() { return null; }
    public android.os.Bundle getChooserTargetIntentExtras() { return null; }
    public com.oplus.wrapper.app.prediction.AppTarget getDirectShareAppTarget() { return null; }
    public android.content.pm.ShortcutInfo getDirectShareShortcutInfo() { return null; }
    public com.oplus.shortcuts.chooser.TargetInfo.IconHolder getDisplayIconHolder() { return null; }
    public java.lang.CharSequence getDisplayLabel() { return null; }
    public com.oplus.shortcuts.chooser.DisplayResolveInfo getDisplayResolveInfo() { return null; }
    public java.lang.CharSequence getExtendedInfo() { return null; }
    public float getModifiedScore() { return 0f; }
    public android.content.pm.ResolveInfo getResolveInfo() { return null; }
    public android.content.ComponentName getResolvedComponentName() { return null; }
    public android.content.Intent getResolvedIntent() { return null; }
    public android.content.Intent getTargetIntent() { return null; }
    public boolean isPinned() { return false; }
    public boolean isSelectableTargetInfo() { return false; }
    public boolean isSuspended() { return false; }
    public boolean startAsCaller(android.app.Activity p0, android.os.Bundle p1, int p2) { return false; }
    public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
    public com.oplus.shortcuts.chooser.TargetInfo tryToCloneWithAppliedRefinement(android.content.Intent p0) { return null; }

    interface TargetActivityStarter {
        public boolean start(android.app.Activity p0, android.os.Bundle p1);
        public boolean startAsCaller(android.app.Activity p0, android.os.Bundle p1, int p2);
        public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2);
    }
}
