package com.oplus.view;

import android.content.Context;

public class JankManager {

    private static JankManager sInstance;

    public static JankManager getInstance() {
        if (sInstance == null) {
            sInstance = new JankManager();
        }
        return sInstance;
    }

    public void gfxSceneBegin(Context context, int scene, String name, long timeout) {}

    public void gfxSceneEnd(Context context, int scene) {}

    public void latencySceneBegin(android.content.Context p0, com.oplus.view.IJankManager.SceneInfo p1) { }

    public void latencySceneEnd(android.content.Context p0, int p1, java.util.ArrayList<String> p2) { }
}
