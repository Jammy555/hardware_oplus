package com.oplus.media;

import java.io.FileDescriptor;

public class OplusHeifWriter {
    public OplusHeifWriter() {}

    public boolean createPrimaryImage(int width, int height, int stride, int format, int quality,
            int rotation, int flags) {
        return false;
    }

    public void destory() {}

    public boolean processPrimaryImage(byte[] image, byte[] metadata, FileDescriptor output) {
        return false;
    }
}
