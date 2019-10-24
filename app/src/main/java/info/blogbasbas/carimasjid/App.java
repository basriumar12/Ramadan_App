package info.blogbasbas.carimasjid;

import android.app.Application;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import info.blogbasbas.carimasjid.database.DatabaseHelper;
import info.blogbasbas.carimasjid.utils.PreferenceApp;

//bagian ini untuk memudahkan saja, tidak semua apps membutuhkan file ini
// akan tetapi apps lebih bagus pakai ini

public class App extends Application {

    private static Resources resources;

    @Override
    public void onCreate() {
        super.onCreate();

        resources = getResources();
        DatabaseHelper.initDatabase(this);
        PreferenceApp.initPreferences(this);
    }

    public static BufferedReader getRawResources(int res){
        InputStream streamReader = resources.openRawResource(res);
        return new BufferedReader(new InputStreamReader(streamReader));
    }

}
