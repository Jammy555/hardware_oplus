package android.bluetooth;

import com.oplus.bluetooth.OplusA2dpSharingManager;

public class OplusBluetoothAdapter {

    private static volatile OplusBluetoothAdapter sAdapter = null;
    
    public static OplusBluetoothAdapter getOplusBluetoothAdapter() {
        if (sAdapter == null) {
            synchronized (OplusBluetoothAdapter.class) {
                if (sAdapter == null) {
                    sAdapter = new OplusBluetoothAdapter();
                }
            }
        }
        return sAdapter;
    }

    public static OplusBluetoothAdapter getDefaultAdapter() {
        return getOplusBluetoothAdapter();
    }

    public OplusA2dpSharingManager getA2dpSharingManager() {
        return OplusA2dpSharingManager.getInstance();
    }

    public boolean isAudioSharingSupported() {
        return true;
    }
}
