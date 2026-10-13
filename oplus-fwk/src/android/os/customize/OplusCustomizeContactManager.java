package android.os.customize;

public class OplusCustomizeContactManager {
    public static final int BLACK_LIST_BLOCK_PATTERN_BLACK_LIST = 1;
    public static final int BLACK_LIST_BLOCK_PATTERN_INVALID = 0;
    public static final int BLACK_LIST_BLOCK_PATTERN_WHITE_LIST = 2;
    public static final int BLACK_LIST_MATCH_PATTERN_ALL = 0;
    public static final int BLACK_LIST_MATCH_PATTERN_ALLOW_ALL = 4;
    public static final int BLACK_LIST_MATCH_PATTERN_FUZZY = 2;
    public static final int BLACK_LIST_MATCH_PATTERN_INTERCEPT_ALL = 3;
    public static final int BLACK_LIST_MATCH_PATTERN_PREFIX = 1;
    public static final int BLACK_LIST_OUTGO_OR_INCOME_PATTERN_ALL = 2;
    public static final int BLACK_LIST_OUTGO_OR_INCOME_PATTERN_INCOME = 1;
    public static final int BLACK_LIST_OUTGO_OR_INCOME_PATTERN_OUTGO = 0;
    public static final int FORBID_CALL_LOG_DISABLE = 0;
    public static final int FORBID_CALL_LOG_ENABLE = 1;
    public static final int NUMBER_MASK_HIDE_DISABLE = 2;
    public static final int NUMBER_MASK_HIDE_ENABLE = 1;
    public static final int NUMBER_MASK_HIDE_MODE_END = 2;
    public static final int NUMBER_MASK_HIDE_MODE_MIDDLE = 1;
    public static final android.os.customize.OplusCustomizeContactManager getInstance(android.content.Context p0) { if (sStub == null) sStub = new OplusCustomizeContactManager(); return sStub; }
    public int getContactBlockPattern() { return 0; }
    public int getContactMatchPattern() { return 0; }
    public int getContactNumberHideMode() { return 0; }
    public int getContactNumberMaskEnable() { return 0; }
    public int getContactOutgoOrIncomePattern() { return 0; }
    public boolean isContactBlackListEnable() { return false; }
    public boolean isForbidCallLogEnable() { return false; }
    public boolean setContactBlackListEnable(boolean p0) { return false; }
    public boolean setContactBlockPattern(int p0) { return false; }
    public boolean setContactMatchPattern(int p0) { return false; }
    public boolean setContactNumberHideMode(int p0) { return false; }
    public boolean setContactNumberMaskEnable(int p0) { return false; }
    public boolean setContactOutgoOrIncomePattern(int p0) { return false; }
    public boolean setForbidCallLogEnable(int p0) { return false; }
    private OplusCustomizeContactManager() { }
    private static OplusCustomizeContactManager sStub;
}
