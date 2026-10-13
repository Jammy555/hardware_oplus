package com.oplus.shortcuts;

public class ShortcutLoader {
    public ShortcutLoader(android.content.Context p0, com.oplus.wrapper.app.prediction.AppPredictor p1, android.os.UserHandle p2, android.content.IntentFilter p3, java.util.function.Consumer<com.oplus.shortcuts.ShortcutLoader.Result> p4) { }
    ShortcutLoader(android.content.Context p0, com.oplus.wrapper.app.prediction.AppPredictor p1, android.os.UserHandle p2, boolean p3, android.content.IntentFilter p4, java.util.concurrent.Executor p5, java.util.concurrent.Executor p6, java.util.function.Consumer<com.oplus.shortcuts.ShortcutLoader.Result> p7) { }
    public void destroy() { }
    protected boolean isProfileActive() { return false; }
    public void queryShortcuts(com.oplus.shortcuts.chooser.DisplayResolveInfo[] p0) { }

    static class Request {
        Request(com.oplus.shortcuts.chooser.DisplayResolveInfo[] p0) { }
    }

    public static class Result {
        public com.oplus.shortcuts.chooser.DisplayResolveInfo[] appTargets;
        public java.util.Map<android.service.chooser.ChooserTarget, com.oplus.wrapper.app.prediction.AppTarget> directShareAppTargetCache;
        public java.util.Map<android.service.chooser.ChooserTarget, android.content.pm.ShortcutInfo> directShareShortcutInfoCache;
        public boolean isFromAppPredictor;
        public com.oplus.shortcuts.ShortcutLoader.ShortcutResultInfo[] shortcutsByApp;
        public Result(boolean p0, com.oplus.shortcuts.chooser.DisplayResolveInfo[] p1, com.oplus.shortcuts.ShortcutLoader.ShortcutResultInfo[] p2, java.util.Map<android.service.chooser.ChooserTarget, com.oplus.wrapper.app.prediction.AppTarget> p3, java.util.Map<android.service.chooser.ChooserTarget, android.content.pm.ShortcutInfo> p4) { }
    }

    public static class ShortcutResultInfo {
        public com.oplus.shortcuts.chooser.DisplayResolveInfo appTarget;
        public java.util.List<android.service.chooser.ChooserTarget> shortcuts;
        public ShortcutResultInfo(com.oplus.shortcuts.chooser.DisplayResolveInfo p0, java.util.List<android.service.chooser.ChooserTarget> p1) { }
    }
}
