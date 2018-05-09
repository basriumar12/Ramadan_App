package info.blogbasbas.carimasjid.activity.splascreen;

import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import butterknife.BindView;
import info.blogbasbas.carimasjid.R;
import info.blogbasbas.carimasjid.activity.HomeActivity;
import info.blogbasbas.carimasjid.activity.listsurah.QuranActivity;
import info.blogbasbas.carimasjid.base.BaseActivity;
import info.blogbasbas.carimasjid.utils.PreferenceApp;

public class SplashScreenActivity extends BaseActivity<SplashscreenPresenter> implements SplashscreenView {
    @BindView(R.id.layoutLoadingInfo)
    LinearLayout mLayoutLoadingInfo;

    @BindView(R.id.progressInfo)
    ProgressBar mProgressInfo;
    @Override
    public SplashscreenPresenter initPresenter() {
        return new SplashscreenPresenter(this);
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (PreferenceApp.isFirstLaunch()){
            mPresenter.startPrepareData();
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    startActivity(HomeActivity.class);
                    finish();
                }
            }, 5000);
        }
    }

    @Override
    public void onPrepare() {
        mLayoutLoadingInfo.setVisibility(View.VISIBLE);

    }

    @Override
    public void onProgress(int progress) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            mProgressInfo.setProgress(progress, true);
        } else {
            mProgressInfo.setProgress(progress);
        }
    }

    @Override
    public void onSuccess() {
        PreferenceApp.hasFirstLaunch();
        startActivity(HomeActivity.class);
        finish();

    }



}
