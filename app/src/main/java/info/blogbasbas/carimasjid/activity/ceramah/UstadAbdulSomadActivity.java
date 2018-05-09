package info.blogbasbas.carimasjid.activity.ceramah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.infideap.atomic.Atom;
import com.infideap.atomic.FutureCallback;

import java.util.List;

import info.blogbasbas.carimasjid.R;
import info.blogbasbas.carimasjid.modelceramah.RecordsItem;
import info.blogbasbas.carimasjid.modelceramah.ResponseCeramah;
import info.blogbasbas.carimasjid.utils.Constant;

public class UstadAbdulSomadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ustad_abdul_somad);

        getData();
    }

    private void getData() {

        Atom.with(this)
                .load(Constant.BASE_URL.concat(Constant.URL_UAS))
                .as(ResponseCeramah.class)
                .setCallback(new FutureCallback<ResponseCeramah>() {
                    @Override
                    public void onCompleted(Exception e, ResponseCeramah result) {

                        if (e != null){
                            Log.e("TAG","e"+ new Gson().toJson(e));
                            e.printStackTrace();

                        }
                        if (result!=null){
                            List<RecordsItem> recordsItems = result.getRecords();
                            Log.e("Tag","result"+new Gson().toJson(recordsItems));
                        }
                    }
                });
    }
}
