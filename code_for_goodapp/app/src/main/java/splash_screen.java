package com.example.shubhamkumar.code_for_good;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {
    private static int SPLASH_SCREEN_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent=new Intent(splash_screen.this,MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_SCREEN_OUT);
    }
}


