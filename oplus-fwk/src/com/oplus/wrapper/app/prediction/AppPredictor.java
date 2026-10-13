package com.oplus.wrapper.app.prediction;

public class AppPredictor {
    public AppPredictor(android.app.prediction.AppPredictor p0) { }
    public void destroy() { }
    public void notifyAppTargetEvent(com.oplus.wrapper.app.prediction.AppTargetEvent p0) { }
    public void registerPredictionUpdates(java.util.concurrent.Executor p0, com.oplus.wrapper.app.prediction.AppPredictor.Callback p1) { }
    public void requestPredictionUpdate() { }
    public void unregisterPredictionUpdates(com.oplus.wrapper.app.prediction.AppPredictor.Callback p0) { }

    public interface Callback {
        public void onTargetsAvailable(java.util.List<com.oplus.wrapper.app.prediction.AppTarget> p0);
    }

    static class CallbackImpl implements android.app.prediction.AppPredictor.Callback {
        CallbackImpl(com.oplus.wrapper.app.prediction.AppPredictor.Callback p0) { }
        public void onTargetsAvailable(java.util.List<android.app.prediction.AppTarget> p0) { }
    }
}
