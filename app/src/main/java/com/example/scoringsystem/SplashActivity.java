package com.example.scoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    Animation fadeIn, fadeInDelayed;
    TextView scoring_tv, system_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        //Animation
        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in_animation);
        fadeInDelayed = AnimationUtils.loadAnimation(this, R.anim.fade_in_animation);
        fadeIn.setStartTime(100);
        fadeIn.setStartTime(200);
        scoring_tv = findViewById(R.id.scoring_tv);
        system_tv = findViewById(R.id.system_tv);

        scoring_tv.setAnimation(fadeIn);
        system_tv.setAnimation(fadeInDelayed);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}