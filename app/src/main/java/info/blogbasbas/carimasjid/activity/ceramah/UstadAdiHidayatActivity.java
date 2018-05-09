package info.blogbasbas.carimasjid.activity.ceramah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import info.blogbasbas.carimasjid.R;

public class UstadAdiHidayatActivity extends AppCompatActivity {

    @BindView(R.id.rv_ustd_adi)
    RecyclerView rvUstdAdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ustad_adi_hidayat);
        ButterKnife.bind(this);
    }
}
