package com.oplus.multiapp;

public class OplusMultiAppConfig implements android.os.Parcelable {
    public static final int CHOOSE_TYPE_NONE = -1;
    public static final int CHOOSE_TYPE_RECENT_TASK = 0;
    public static final int CHOOSE_TYPE_SKIP = 1;
    public static android.os.Parcelable.Creator<com.oplus.multiapp.OplusMultiAppConfig> CREATOR;
    public OplusMultiAppConfig() { }
    public OplusMultiAppConfig(android.os.Parcel p0) { }
    public int describeContents() { return 0; }
    public java.util.List<java.lang.String> getAllowedPkgList() { return null; }
    public java.lang.String getAndroidVersionName() { return null; }
    public int getAndroidVersionNumber() { return 0; }
    public java.util.List<android.content.ComponentName> getChooseRecentList() { return null; }
    public android.util.ArrayMap<java.lang.String, java.util.List<android.content.ComponentName>> getChooseSkipMap() { return null; }
    public java.util.List<java.lang.String> getCrossAuthorityList() { return null; }
    public int getMaxCloneUserNum() { return 0; }
    public int getMaxCreatedNum() { return 0; }
    public java.util.List<java.lang.String> getOpAllowedPkgList() { return null; }
    public java.util.List<java.lang.String> getRelatedPkgList() { return null; }
    public java.lang.String getVersionName() { return null; }
    public int getVersionNum() { return 0; }
    public boolean isCloneUserGmsRedirectEnabled() { return false; }
    public void setAllowedPkgList(java.util.List<java.lang.String> p0) { }
    public void setAndroidVersionName(java.lang.String p0) { }
    public void setAndroidVersionNumber(int p0) { }
    public void setChooseRecentList(java.util.List<android.content.ComponentName> p0) { }
    public void setChooseSkipMap(android.util.ArrayMap<java.lang.String, java.util.List<android.content.ComponentName>> p0) { }
    public void setCloneUserGmsRedirectEnabled(boolean p0) { }
    public void setCrossAuthorityList(java.util.List<java.lang.String> p0) { }
    public void setMaxCloneUserNum(int p0) { }
    public void setMaxCreatedNum(int p0) { }
    public void setOpAllowedPkgList(java.util.List<java.lang.String> p0) { }
    public void setRelatedPkgList(java.util.List<java.lang.String> p0) { }
    public void setVersionName(java.lang.String p0) { }
    public void setVersionNum(int p0) { }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }
}
