package android.os;

import android.content.Context;
import android.util.ArrayMap;

public class OplusKeyEventManager {

    private static OplusKeyEventManager sInstance;

    public interface OnKeyEventObserver {
        void onKeyEvent(android.view.KeyEvent event);
    }

    public static OplusKeyEventManager getInstance() {
        if (sInstance == null) {
            sInstance = new OplusKeyEventManager();
        }
        return sInstance;
    }

    public boolean registerKeyEventObserver(Context context,
            OnKeyEventObserver observer, int type) {
        return false;
    }

    public boolean unregisterKeyEventObserver(Context context,
            OnKeyEventObserver observer) {
        return false;
    }

    public boolean registerKeyEventInterceptor(Context context, String tag,
            OnKeyEventObserver observer, ArrayMap<String, Object> extra) {
        return false;
    }

    public boolean unregisterKeyEventInterceptor(Context context, String tag,
            OnKeyEventObserver observer) {
        return false;
    }
}
