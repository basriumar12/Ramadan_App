package info.blogbasbas.carimasjid.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

/**
 * Created by Lenovo on 12/21/2016.
 */

public class Permissions {

  //  int ALL_PERMISSIONS = 1;

    Context context;


   public Permissions(Context context){
        this.context = context;

    }


   // String PERMISSIONS[] = {Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA, Manifest.permission.FLASHLIGHT};

    public static boolean haspermissions(Context context, String... permissions) {

        if (android.os.Build.VERSION.SDK_INT >= 26 && context != null && permissions != null) {

            for (String permission : permissions) {

                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED)
                    return false;
            }
        }

        return true;
    }

}

