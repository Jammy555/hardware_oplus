package com.oplus.shortcuts.chooser;

public class DisplayResolveInfo implements com.oplus.shortcuts.chooser.TargetInfo {
    public static com.oplus.shortcuts.chooser.DisplayResolveInfo newDisplayResolveInfo(android.content.Intent p0, android.content.pm.ResolveInfo p1, android.content.Intent p2) { if (sStub == null) sStub = new DisplayResolveInfo(); return sStub; }
    public static com.oplus.shortcuts.chooser.DisplayResolveInfo newDisplayResolveInfo(android.content.Intent p0, android.content.pm.ResolveInfo p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.content.Intent p4) { if (sStub == null) sStub = new DisplayResolveInfo(); return sStub; }
    public void addAlternateSourceIntent(android.content.Intent p0) { }
    public com.oplus.shortcuts.chooser.DisplayResolveInfo copy() { return null; }
    public java.util.ArrayList<com.oplus.shortcuts.chooser.DisplayResolveInfo> getAllDisplayTargets() { return null; }
    public java.util.List<android.content.Intent> getAllSourceIntents() { return null; }
    public com.oplus.shortcuts.chooser.TargetInfo.IconHolder getDisplayIconHolder() { return null; }
    public java.lang.CharSequence getDisplayLabel() { return null; }
    public java.lang.CharSequence getExtendedInfo() { return null; }
    public android.content.pm.ResolveInfo getResolveInfo() { return null; }
    public android.content.ComponentName getResolvedComponentName() { return null; }
    public android.content.Intent getResolvedIntent() { return null; }
    public android.content.Intent getTargetIntent() { return null; }
    public boolean hasDisplayLabel() { return false; }
    public final boolean isDisplayResolveInfo() { return false; }
    public boolean isPinned() { return false; }
    public boolean isSuspended() { return false; }
    public void setDisplayLabel(java.lang.CharSequence p0) { }
    public void setExtendedInfo(java.lang.CharSequence p0) { }
    public void setPinned(boolean p0) { }
    public boolean startAsCaller(android.app.Activity p0, android.os.Bundle p1, int p2) { return false; }
    public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
    public com.oplus.shortcuts.chooser.DisplayResolveInfo tryToCloneWithAppliedRefinement(android.content.Intent p0) { return null; }
    private DisplayResolveInfo() { }
    private static DisplayResolveInfo sStub;
}
