package com.oplus.wrapper.os.storage;

public class StorageManager {
    public StorageManager(android.os.storage.StorageManager p0) { }
    public static boolean isFileEncryptedNativeOnly() { return false; }
    public long getPrimaryStorageSize() { return 0L; }
    public android.os.storage.StorageVolume[] getVolumeList() { return null; }
    public java.lang.String[] getVolumePaths() { return null; }
    public java.lang.String getVolumeState(java.lang.String p0) { return null; }
    public java.util.List<com.oplus.wrapper.os.storage.VolumeInfo> getVolumes() { return null; }
    public void registerListener(com.oplus.wrapper.os.storage.StorageEventListener p0) { }
    public void unregisterListener(com.oplus.wrapper.os.storage.StorageEventListener p0) { }
}
