package com.oplus.multiapp;

public class MultiAppInfo implements android.os.Parcelable {
    public static final int ACCESS_DEFAULT = 0;
    public static final int ACCESS_MAIN_APP = 1;
    public static final int ACCESS_MULTI_APP = 2;
    public static android.os.Parcelable.Creator<com.oplus.multiapp.MultiAppInfo> CREATOR;
    public static final int STATUS_CREATED = 1;
    public static final int STATUS_DEFAULT = 0;
    public static final int STATUS_DISABLED = 4;
    public static final int STATUS_ENABLED = 2;
    public MultiAppInfo() { }
    public MultiAppInfo(android.os.Parcel p0) { }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAccessMode() { return 0; }
    public java.lang.String getAlias() { return null; }
    public java.lang.String getAlias(int p0) { return null; }
    public android.util.SparseArray<java.lang.String> getAliases() { return null; }
    public java.util.List<java.lang.Integer> getCreatedUserIdList() { return null; }
    public int getEndIndex() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int getStartIndex() { return 0; }
    public int getStatus() { return 0; }
    public java.lang.String getTitle() { return null; }
    public int hashCode() { return 0; }
    public boolean isCreated() { return false; }
    public boolean isDisabled() { return false; }
    public boolean isEnabled() { return false; }
    public void setAccessMode(int p0) { }
    public void setAlias(java.lang.String p0) { }
    public void setAlias(java.lang.String p0, int p1) { }
    public void setAliases(android.util.SparseArray<java.lang.String> p0) { }
    public void setCreatedUserIdList(java.util.List<java.lang.Integer> p0) { }
    public void setEndIndex(int p0) { }
    public void setPackageName(java.lang.String p0) { }
    public void setStartIndex(int p0) { }
    public void setStatus(int p0) { }
    public void setTitle(java.lang.String p0) { }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) { }

    public static class MultiAppInfoComparator implements java.util.Comparator<com.oplus.multiapp.MultiAppInfo> {
        public MultiAppInfoComparator() { }
        public int compare(com.oplus.multiapp.MultiAppInfo p0, com.oplus.multiapp.MultiAppInfo p1) { return 0; }
    }
}
