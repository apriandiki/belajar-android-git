package com.example.amikom.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import com.example.amikom.myapplication.

public class MainActivity extends AppCompatActivity {
    preferencesHelper instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instance=preferencesHelper.getInstance(getApplicationContext());
        int splasInterval=10;
        new Hadler ().postDelayed(() -> {
            if (!instance.islogin(() {
                startActivities(new Intent (SplashActivity.this,LoginActivity.class));
            }else{
                startActivities(new intent(SplashActivity.this,mainActivity.class));
            }
        }, splashInterval);
    }
}
