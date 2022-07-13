package com.example.scoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout badminton_rl , volleyball_rl , basketball_rl, football_rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        badminton_rl = findViewById(R.id.badminton_rl);
        badminton_rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Badminton.class);
                startActivity(intent);
            }
        });

        volleyball_rl = findViewById(R.id.volleyball_rl);
        volleyball_rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Volleyball.class);
                startActivity(intent);
            }
        });
        basketball_rl = findViewById(R.id.basketball_rl);
        basketball_rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Basketball.class);
                startActivity(intent);
            }
        });
        football_rl = findViewById(R.id.football_rl);
        football_rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Football.class);
                startActivity(intent);
            }
        });

    }
}