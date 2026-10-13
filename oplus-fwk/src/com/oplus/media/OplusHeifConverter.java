package com.oplus.media;

public class OplusHeifConverter {
    public OplusHeifConverter() { }
    public static boolean convertHeifToJpegFromPath(java.lang.String p0, int p1, java.io.OutputStream p2) { return false; }
    public static boolean convertHeifToJpegFromStream(java.io.InputStream p0, int p1, java.io.OutputStream p2) { return false; }
    public int byteArrayToInt(byte[] p0, int p1) { return 0; }
    public boolean createDecoder() { return false; }
    public com.oplus.media.OplusHeifConverter.HeifDecodedFrame decode(java.io.FileDescriptor p0, int p1, boolean p2) { return null; }
    public com.oplus.media.OplusHeifConverter.HeifDecodedFrame decode(java.io.InputStream p0, int p1, boolean p2) { return null; }
    public boolean decode(java.io.FileDescriptor p0, int p1, android.view.Surface p2) { return false; }
    public boolean decode(java.io.InputStream p0, int p1, android.view.Surface p2) { return false; }
    public com.oplus.media.OplusHeifConverter.HeifDecodedFrame decodeRegion(java.io.FileDescriptor p0, android.graphics.Rect p1, int p2, boolean p3) { return null; }
    public com.oplus.media.OplusHeifConverter.HeifDecodedFrame decodeRegion(java.io.InputStream p0, android.graphics.Rect p1, int p2, boolean p3) { return null; }
    public boolean decodeRegion(java.io.FileDescriptor p0, android.graphics.Rect p1, int p2, android.view.Surface p3) { return false; }
    public boolean decodeRegion(java.io.InputStream p0, android.graphics.Rect p1, int p2, android.view.Surface p3) { return false; }
    public boolean destroyDecoder() { return false; }
    public int getFormat(java.io.FileDescriptor p0) throws java.io.IOException { return 0; }
    public int getFormat(java.io.InputStream p0) throws java.io.IOException { return 0; }
    public boolean isHEIFFile(java.io.InputStream p0) { return false; }

    public static class HeifDecodedFrame {
        public android.graphics.ColorSpace m_ColorSpace;
        public long m_buffer_id;
        public long m_buffer_id_sub;
        public int m_frame_height;
        public int m_frame_width;
        public boolean m_recycled;
        public byte[] m_yuvdata;
        public HeifDecodedFrame(byte[] p0, int p1, int p2, long p3) { }
        public final boolean isRecycled() { return false; }
        public void recycle() { }
        public boolean render(android.view.Surface p0, boolean p1) { return false; }
        public boolean render(android.view.Surface p0, boolean p1, android.graphics.ColorSpace p2) { return false; }
    }
}
