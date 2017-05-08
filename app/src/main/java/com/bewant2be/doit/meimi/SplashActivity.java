package com.bewant2be.doit.meimi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent starter = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(starter);
                finish();
                overridePendingTransition(R.anim.stand, R.anim.splash);
            }
        }, 500);
    }
}
