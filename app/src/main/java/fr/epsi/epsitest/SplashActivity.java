package fr.epsi.epsitest;

import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends EpsiTestActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                HomeActivity.displayActivity(SplashActivity.this);
                finish();
            }
        },5000);
    }

    @Override
    public void onBackPressed() {

    }
}