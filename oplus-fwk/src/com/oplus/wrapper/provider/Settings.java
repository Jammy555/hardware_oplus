package com.oplus.wrapper.provider;

import android.content.ContentResolver;

public class Settings {

    public static class System {

        public static int getIntForUser(ContentResolver resolver, String name, int def,
                int userHandle) {
            return android.provider.Settings.System.getIntForUser(resolver, name, def,
                    userHandle);
        }
    }

    public static class Secure {

        public static int getIntForUser(ContentResolver resolver, String name, int userHandle)
                throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.Secure.getIntForUser(resolver, name, userHandle);
        }

        public static int getIntForUser(ContentResolver resolver, String name, int def,
                int userHandle) {
            return android.provider.Settings.Secure.getIntForUser(resolver, name, def, userHandle);
        }

        public static boolean putStringForUser(ContentResolver resolver, String name, String value,
                int userHandle) {
            return android.provider.Settings.Secure.putStringForUser(resolver, name, value,
                    userHandle);
        }

        public static String getStringForUser(ContentResolver resolver, String name,
                int userHandle) {
            return android.provider.Settings.Secure.getStringForUser(resolver, name, userHandle);
        }
    }
}
