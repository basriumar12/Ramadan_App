package info.blogbasbas.carimasjid.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;



public class PreferenceApp {

    private static PreferenceApp preferenceApp;
    private SharedPreferences preferences;

    private PreferenceApp(Context context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void initPreferences(Context context) {
        if (preferenceApp == null) {
            preferenceApp = new PreferenceApp(context);
        }
    }

    public static boolean isFirstLaunch() {
        return preferenceApp.preferences.getBoolean("LAUNCH", true);
    }

    public static void hasFirstLaunch() {
        preferenceApp.preferences.edit().putBoolean("LAUNCH", false).apply();
    }
}
