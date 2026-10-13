package com.oplus.wrapper.app.contentsuggestions;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentClassification {
    private final android.app.contentsuggestions.ContentClassification mContentClassification;

    ContentClassification(android.app.contentsuggestions.ContentClassification contentClassification) {
        this.mContentClassification = contentClassification;
    }

    public String getId() {
        return this.mContentClassification.getId();
    }

    public Bundle getExtras() {
        return this.mContentClassification.getExtras();
    }
}
