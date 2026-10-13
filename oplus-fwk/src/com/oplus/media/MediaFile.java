package com.oplus.media;

public class MediaFile {
    public static final int FILE_TYPE_3GPP = 23;
    public static final int FILE_TYPE_3GPP2 = 24;
    public static final int FILE_TYPE_AAC = 8;
    public static final int FILE_TYPE_AMR = 4;
    public static final int FILE_TYPE_APE = 1001;
    public static final int FILE_TYPE_APK = 10011;
    public static final int FILE_TYPE_ARW = 304;
    public static final int FILE_TYPE_ASF = 26;
    public static final int FILE_TYPE_AUDIO_3GPP = 11;
    public static final int FILE_TYPE_AVI = 29;
    public static final int FILE_TYPE_AWB = 5;
    public static final int FILE_TYPE_BMP = 34;
    public static final int FILE_TYPE_CHM = 10021;
    public static final int FILE_TYPE_CR2 = 301;
    public static final int FILE_TYPE_CSV = 10022;
    public static final int FILE_TYPE_CUE = 1003;
    public static final int FILE_TYPE_DNG = 300;
    public static final int FILE_TYPE_EBK = 10026;
    public static final int FILE_TYPE_EPUB = 10027;
    public static final int FILE_TYPE_FL = 51;
    public static final int FILE_TYPE_FLAC = 10;
    public static final int FILE_TYPE_FLV = 1101;
    public static final int FILE_TYPE_GIF = 32;
    public static final int FILE_TYPE_HEIF = 37;
    public static final int FILE_TYPE_HTML = 101;
    public static final int FILE_TYPE_HTTPLIVE = 44;
    public static final int FILE_TYPE_ICS = 10023;
    public static final int FILE_TYPE_IMY = 13;
    public static final int FILE_TYPE_JAR = 10002;
    public static final int FILE_TYPE_JPEG = 31;
    public static final int FILE_TYPE_M2TS = 1104;
    public static final int FILE_TYPE_M3U = 41;
    public static final int FILE_TYPE_M4A = 2;
    public static final int FILE_TYPE_M4V = 22;
    public static final int FILE_TYPE_MID = 11;
    public static final int FILE_TYPE_MKA = 9;
    public static final int FILE_TYPE_MKV = 27;
    public static final int FILE_TYPE_MOV = 1103;
    public static final int FILE_TYPE_MP2 = 1002;
    public static final int FILE_TYPE_MP2PS = 200;
    public static final int FILE_TYPE_MP2TS = 28;
    public static final int FILE_TYPE_MP3 = 1;
    public static final int FILE_TYPE_MP4 = 21;
    public static final int FILE_TYPE_MS_EXCEL = 105;
    public static final int FILE_TYPE_MS_POWERPOINT = 106;
    public static final int FILE_TYPE_MS_WORD = 104;
    public static final int FILE_TYPE_NEF = 302;
    public static final int FILE_TYPE_NRW = 303;
    public static final int FILE_TYPE_OGG = 7;
    public static final int FILE_TYPE_ORF = 306;
    public static final int FILE_TYPE_PDF = 102;
    public static final int FILE_TYPE_PEF = 308;
    public static final int FILE_TYPE_PLS = 42;
    public static final int FILE_TYPE_PNG = 33;
    public static final int FILE_TYPE_QT = 201;
    public static final int FILE_TYPE_RA = 1004;
    public static final int FILE_TYPE_RAF = 307;
    public static final int FILE_TYPE_RAR = 10001;
    public static final int FILE_TYPE_RV = 1102;
    public static final int FILE_TYPE_RW2 = 305;
    public static final int FILE_TYPE_SMF = 12;
    public static final int FILE_TYPE_SRW = 309;
    public static final int FILE_TYPE_TEXT = 100;
    public static final int FILE_TYPE_VCF = 10024;
    public static final int FILE_TYPE_VCS = 10025;
    public static final int FILE_TYPE_WAV = 3;
    public static final int FILE_TYPE_WBMP = 35;
    public static final int FILE_TYPE_WEBM = 30;
    public static final int FILE_TYPE_WEBP = 36;
    public static final int FILE_TYPE_WMA = 6;
    public static final int FILE_TYPE_WMV = 25;
    public static final int FILE_TYPE_WPL = 43;
    public static final int FILE_TYPE_XML = 103;
    public static final int FILE_TYPE_ZIP = 107;
    public static final int MEDIA_TYPE_APK = 10002;
    public static final int MEDIA_TYPE_COMPRESS = 10001;
    public static final int MEDIA_TYPE_DOC = 10003;
    public static final java.lang.String OPLUS_DEFAULT_ALARM = "oplus_customize_default_alarm";
    public static final java.lang.String OPLUS_DEFAULT_NOTIFICATION = "oplus_customize_default_notification";
    public static final java.lang.String OPLUS_DEFAULT_NOTIFICATION_SIM2 = "oplus_customize_default_notification_sim2";
    public static final java.lang.String OPLUS_DEFAULT_RINGTONE = "oplus_customize_default_ringtone";
    public static final java.lang.String OPLUS_DEFAULT_RINGTONE_SIM2 = "oplus_customize_default_ringtone_sim2";
    public static final java.lang.String OPLUS_DEFAULT_SMS_NOTIFICATION = "oplus_customize_default_sms_notification_sound";
    public static final int SCAN_ALL_FILE = 0;
    public static final int SCAN_AUDIO_FILE = 1;
    public static final int SCAN_IMAGE_FILE = 2;
    public static final int SCAN_OTHER_FILE = 8;
    public static final int SCAN_VIDEO_FILE = 4;
    public MediaFile() { }
    static void addFileAndMineType(java.lang.String p0, int p1, java.lang.String p2) { }
    static void addFileType(java.lang.String p0, int p1, java.lang.String p2) { }
    public static android.net.Uri getDefaultAlarmUri(android.content.Context p0) { return null; }
    public static android.net.Uri getDefaultNotificationUri(android.content.Context p0) { return null; }
    public static android.net.Uri getDefaultNotificationUriSIM2(android.content.Context p0) { return null; }
    public static android.net.Uri getDefaultRingtoneUri(android.content.Context p0) { return null; }
    public static android.net.Uri getDefaultRingtoneUriSIM2(android.content.Context p0) { return null; }
    public static android.net.Uri getDefaultSmsNotificationUri(android.content.Context p0) { return null; }
    public static java.lang.String getFileExtension(java.lang.String p0) { return null; }
    public static java.lang.String getFileTitle(java.lang.String p0) { return null; }
    public static com.oplus.media.MediaFile.MediaFileType getFileType(java.lang.String p0) { return null; }
    public static int getFileTypeForMimeType(java.lang.String p0) { return 0; }
    public static int getFormatCode(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int getFormatCodeForFile(java.lang.String p0) { return 0; }
    public static int getFormatCodeForMimeType(java.lang.String p0) { return 0; }
    public static java.lang.String getMimeType(java.lang.String p0, int p1) { return null; }
    public static java.lang.String getMimeTypeForFile(java.lang.String p0) { return null; }
    public static java.lang.String getMimeTypeForFormatCode(int p0) { return null; }
    public static boolean isApkFileType(int p0) { return false; }
    public static boolean isApkMimeType(java.lang.String p0) { return false; }
    public static boolean isAudioFileType(int p0) { return false; }
    public static boolean isAudioMimeType(java.lang.String p0) { return false; }
    public static boolean isCompressFileType(int p0) { return false; }
    public static boolean isCompressMimeType(java.lang.String p0) { return false; }
    public static boolean isDocFileType(int p0) { return false; }
    public static boolean isDocMimeType(java.lang.String p0) { return false; }
    public static boolean isDrmFileType(int p0) { return false; }
    public static boolean isDrmMimeType(java.lang.String p0) { return false; }
    public static boolean isExifMimeType(java.lang.String p0) { return false; }
    public static boolean isImageFileType(int p0) { return false; }
    public static boolean isImageMimeType(java.lang.String p0) { return false; }
    public static boolean isMediaMimeType(java.lang.String p0) { return false; }
    public static boolean isMimeTypeMedia(java.lang.String p0) { return false; }
    public static boolean isPlayListFileType(int p0) { return false; }
    public static boolean isPlayListMimeType(java.lang.String p0) { return false; }
    public static boolean isRawImageFileType(int p0) { return false; }
    public static boolean isRawImageMimeType(java.lang.String p0) { return false; }
    public static boolean isVideoFileType(int p0) { return false; }
    public static boolean isVideoMimeType(java.lang.String p0) { return false; }

    public static class MediaFileType {
        public int fileType;
        public java.lang.String mimeType;
        MediaFileType(int p0, java.lang.String p1) { }
    }
}
