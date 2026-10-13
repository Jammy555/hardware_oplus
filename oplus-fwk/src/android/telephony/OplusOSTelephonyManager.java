package android.telephony;

public class OplusOSTelephonyManager {
    public static final int RAF_1xRTT = 64;
    public static final int RAF_EDGE = 2;
    public static final int RAF_EHRPD = 8192;
    public static final int RAF_EVDO_0 = 16;
    public static final int RAF_EVDO_A = 32;
    public static final int RAF_EVDO_B = 2048;
    public static final int RAF_GPRS = 1;
    public static final int RAF_GSM = 32768;
    public static final int RAF_HSDPA = 128;
    public static final int RAF_HSPA = 512;
    public static final int RAF_HSPAP = 16384;
    public static final int RAF_HSUPA = 256;
    public static final int RAF_IS95A = 8;
    public static final int RAF_IS95B = 8;
    public static final int RAF_LTE = 4096;
    public static final int RAF_LTE_CA = 262144;
    public static final int RAF_NR = 524288;
    public static final int RAF_TD_SCDMA = 65536;
    public static final int RAF_UMTS = 4;
    public static final int RAF_UNKNOWN = 0;
    public OplusOSTelephonyManager(android.content.Context p0) { }
    public static boolean getBooleanCarrierConfig(android.content.Context p0, java.lang.String p1, int p2) { return false; }
    public static android.telephony.OplusOSTelephonyManager getDefault(android.content.Context p0) { if (sStub == null) sStub = new OplusOSTelephonyManager((android.content.Context) null); return sStub; }
    public static int getNetworkTypeFromRaf(int p0) { return 0; }
    public static int oplusgetActiveSubInfoCount(android.content.Context p0) { return 0; }
    public static int oplusgetDefaultDataPhoneId(android.content.Context p0) { return 0; }
    public static int oplusgetDefaultDataSubId(android.content.Context p0) { return 0; }
    public static int oplusgetDefaultSmsPhoneId(android.content.Context p0) { return 0; }
    public static int oplusgetDefaultSmsSubId(android.content.Context p0) { return 0; }
    public static int oplusgetDefaultSubId(android.content.Context p0) { return 0; }
    public static int oplusgetOnDemandDataSubId(android.content.Context p0) { return 0; }
    public static int oplusgetPhoneId(android.content.Context p0, int p1) { return 0; }
    public static int oplusgetSlotId(android.content.Context p0, int p1) { return 0; }
    public static int oplusgetSubId(android.content.Context p0, int p1) { return 0; }
    public static int oplusgetSubState(android.content.Context p0, int p1) { return 0; }
    public static boolean oplusisValidPhoneId(android.content.Context p0, int p1) { return false; }
    public static boolean oplusisValidSlotId(android.content.Context p0, int p1) { return false; }
    public static boolean oplusisValidSubId(android.content.Context p0, int p1) { return false; }
    public static void setDefaultApplication(java.lang.String p0, android.content.Context p1) { }
    public void activateSubId(int p0) { }
    public void answerRingingCallGemini(int p0) { }
    public void deactivateSubId(int p0) { }
    public boolean endCallGemini(int p0) { return false; }
    public boolean getBooleanCarrierConfig(java.lang.String p0, int p1) { return false; }
    public int getCallStateGemini(int p0) { return 0; }
    public android.telephony.CellLocation getCellLocation(int p0) { return null; }
    public int getCurrentPhoneTypeGemini(int p0) { return 0; }
    public java.lang.String getDeviceIdGemini(int p0) { return null; }
    public java.lang.String getIccCardTypeGemini(int p0) { return null; }
    public java.lang.String getIccOperatorNumeric(int p0) { return null; }
    public java.lang.String getLine1NumberGemini(int p0) { return null; }
    public java.lang.String getNetworkCountryIso(int p0) { return null; }
    public java.lang.String getNetworkOperatorGemini(int p0) { return null; }
    public int getNetworkTypeGemini(int p0) { return 0; }
    public java.util.List<android.telephony.SubscriptionInfo> getSelectableSubscriptionInfoList() { return null; }
    public java.lang.String getSimOperatorGemini(int p0) { return null; }
    public java.lang.String getSimSerialNumberGemini(int p0) { return null; }
    public int getSimStateGemini(int p0) { return 0; }
    public int getSubState(int p0) { return 0; }
    public java.lang.String getSubscriberIdGemini(int p0) { return null; }
    public java.lang.String getVoiceMailNumberGemini(int p0) { return null; }
    public int getVoiceNetworkTypeGemini(int p0) { return 0; }
    public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) { return false; }
    public boolean hasIccCardGemini(int p0) { return false; }
    public boolean isDualLteEnabled() { return false; }
    public boolean isDualLteSupportedByPlatform() { return false; }
    public boolean isIdleGemini(int p0) { return false; }
    public boolean isIdleGemini(int p0, java.lang.String p1) { return false; }
    public boolean isNetworkRoamingGemini(int p0) { return false; }
    public boolean isOffhookGemini(int p0, java.lang.String p1) { return false; }
    public boolean isOplusHasSoftSimCard() { return false; }
    public boolean isOplusSingleSimCard() { return false; }
    public boolean isRingingGemini(int p0) { return false; }
    public boolean isRingingGemini(int p0, java.lang.String p1) { return false; }
    public boolean isSimInsert(int p0) { return false; }
    public boolean isUriFileExist(java.lang.String p0) { return false; }
    public void listenGemini(android.content.Context p0, android.telephony.PhoneStateListener p1, int p2, int p3) { }
    public void listenGemini(android.telephony.PhoneStateListener p0, int p1, int p2) { }
    public int oplusGetActiveSubscriptionsCount(android.content.Context p0) { return 0; }
    public int oplusGetDataSubscription() { return 0; }
    public int oplusGetDefaultSubscription() { return 0; }
    public java.lang.String oplusGetIccCardTypeGemini(int p0) { return null; }
    public java.lang.String oplusGetIccId(int p0) { return null; }
    public boolean oplusGetIccLockEnabled(int p0) { return false; }
    public java.lang.String oplusGetMeid(int p0) { return null; }
    public java.lang.String oplusGetOemSpn(int p0) { return null; }
    public java.lang.String oplusGetPlmnOverride(java.lang.String p0, android.telephony.ServiceState p1) { return null; }
    public int oplusGetQcomActiveSubscriptionsCount() { return 0; }
    public java.lang.String oplusGetQcomImeiGemini(int p0) { return null; }
    public java.lang.String[] oplusGetQcomLTECDMAImei(int p0) { return null; }
    public java.lang.String oplusGetScAddressGemini(int p0, int p1) { return null; }
    public int oplusGetSimIndicatorState(int p0) { return 0; }
    public int oplusGetSoftSimCardSlotId() { return 0; }
    public boolean oplusIsImsRegistered(android.content.Context p0, int p1) { return false; }
    public boolean oplusIsQcomSubActive(int p0) { return false; }
    public boolean oplusIsSubActive(int p0) { return false; }
    public boolean oplusIsVolteEnabledByPlatform(android.content.Context p0, int p1) { return false; }
    public boolean oplusIsVtEnabledByPlatform(android.content.Context p0, int p1) { return false; }
    public boolean oplusIsWfcEnabledByPlatform(android.content.Context p0, int p1) { return false; }
    public boolean oplusIsWhiteSIMCard(int p0) { return false; }
    public boolean oplusMvnoMatches(int p0, int p1, java.lang.String p2, java.lang.String p3) { return false; }
    public void oplusSetDataRoamingEnabled(int p0, boolean p1) { }
    public void oplusSetDataSubscription(android.content.Context p0, int p1) { }
    public boolean oplusSetLine1Number(int p0, java.lang.String p1) { return false; }
    public int oplusSetPreferredNetworkType(int p0, int p1) { return 0; }
    public void oplusSetScAddressGemini(int p0, java.lang.String p1, int p2) { }
    public void setDualLteEnabled(boolean p0) { }
    public boolean showInCallScreenGemini(boolean p0, java.lang.String p1, java.lang.String p2) { return false; }
    public void silenceRingerGemini(int p0) { }
    public void silenceRingerGemini(int p0, java.lang.String p1) { }
    public boolean supplyPin(java.lang.String p0, int p1) { return false; }
    public int[] supplyPinReportResult(java.lang.String p0, int p1) { return null; }
    public boolean supplyPuk(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public int[] supplyPukReportResult(java.lang.String p0, java.lang.String p1, int p2) { return null; }
    private static OplusOSTelephonyManager sStub;
}
