package com.oplus.wrapper.os.storage;

/* JADX INFO: loaded from: classes2.dex */
public class StorageVolume {
    private final android.os.storage.StorageVolume mStorageVolume;

    public StorageVolume(android.os.storage.StorageVolume storageVolume) {
        this.mStorageVolume = storageVolume;
    }

    public String getPath() {
        return this.mStorageVolume.getPath();
    }

    public int getFatVolumeId() {
        return this.mStorageVolume.getFatVolumeId();
    }
}
