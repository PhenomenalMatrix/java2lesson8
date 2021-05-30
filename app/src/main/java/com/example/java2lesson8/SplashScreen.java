package com.example.java2lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        imageView = findViewById(R.id.icon_iv);

        //Держатель потока
        Handler handler = new Handler(Looper.getMainLooper());

        //Задерживаем поток
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext() ,MainActivity.class);
                startActivity(intent);
            }
            //Задерживаем поток на 1 сек
        },1000);
    }
}