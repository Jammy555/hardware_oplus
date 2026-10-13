package com.oplus.wrapper.app.contentsuggestions;

public class ContentSuggestionsManager {
    public static java.lang.String EXTRA_BITMAP;
    public ContentSuggestionsManager(android.content.Context p0) { }
    public void classifyContentSelections(com.oplus.wrapper.app.contentsuggestions.ClassificationsRequest p0, java.util.concurrent.Executor p1, com.oplus.wrapper.app.contentsuggestions.ContentSuggestionsManager.ClassificationsCallback p2) { }
    public void notifyInteraction(java.lang.String p0, android.os.Bundle p1) { }
    public void provideContextImage(int p0, android.os.Bundle p1) { }
    public void provideContextImage(android.graphics.Bitmap p0, android.os.Bundle p1) { }
    public void suggestContentSelections(com.oplus.wrapper.app.contentsuggestions.SelectionsRequest p0, java.util.concurrent.Executor p1, com.oplus.wrapper.app.contentsuggestions.ContentSuggestionsManager.SelectionsCallback p2) { }

    public interface ClassificationsCallback {
        public void onContentClassificationsAvailable(int p0, java.util.List<com.oplus.wrapper.app.contentsuggestions.ContentClassification> p1);
    }

    static class ClassificationsCallbackDelegate implements android.app.contentsuggestions.ContentSuggestionsManager.ClassificationsCallback {
        public ClassificationsCallbackDelegate(com.oplus.wrapper.app.contentsuggestions.ContentSuggestionsManager.ClassificationsCallback p0) { }
        public void onContentClassificationsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentClassification> p1) { }
    }

    public interface SelectionsCallback {
        public void onContentSelectionsAvailable(int p0, java.util.List<com.oplus.wrapper.app.contentsuggestions.ContentSelection> p1);
    }

    static class SelectionsCallbackDelegate implements android.app.contentsuggestions.ContentSuggestionsManager.SelectionsCallback {
        public SelectionsCallbackDelegate(com.oplus.wrapper.app.contentsuggestions.ContentSuggestionsManager.SelectionsCallback p0) { }
        public void onContentSelectionsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentSelection> p1) { }
    }
}
