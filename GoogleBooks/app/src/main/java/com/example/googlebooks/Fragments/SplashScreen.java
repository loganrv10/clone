package com.example.googlebooks.Fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.googlebooks.GetStartedPage;
import com.example.googlebooks.R;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);


        int SPLASH_SCREEN_TIME_OUT = 2500;
        new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i=new Intent(SplashScreen.this, GetStartedPage.class);


                    startActivity(i);
                    finish();
                }
            }, SPLASH_SCREEN_TIME_OUT);
        }
    }


