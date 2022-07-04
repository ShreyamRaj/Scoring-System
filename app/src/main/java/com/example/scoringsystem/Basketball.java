package com.example.scoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Basketball extends AppCompatActivity {
    TextView scoreTeamA_tv, scoreTeamB_tv;
    Button pointA_btn, pointB_btn, reset_btn, twoPointA_btn, twoPointB_btn, threePointA_btn, threePointB_btn;
    int scoreTeamA, scoreTeamB;
    ImageView back_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);

        back_iv = findViewById(R.id.backArrow_iv);

        scoreTeamA_tv = findViewById(R.id.scorePlayer1_tv);
        scoreTeamB_tv = findViewById(R.id.scorePlayer2_tv);

        pointA_btn = findViewById(R.id.pointA_btn);
        pointB_btn = findViewById(R.id.pointB_btn);
        twoPointA_btn = findViewById(R.id.twoPointA_btn);
        twoPointB_btn = findViewById(R.id.twoPointB_btn);
        threePointA_btn = findViewById(R.id.threePointA_btn);
        threePointB_btn = findViewById(R.id.threePointB_btn);
        reset_btn = findViewById(R.id.reset_btn);

        scoreTeamA = 0;
        scoreTeamB = 0;
        pointA_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA++;
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));

            }
        });
        pointB_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB++;
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));

            }
        });
        twoPointA_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 2;
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));

            }
        });
        twoPointB_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 2;
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));

            }
        });
        threePointA_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 3;
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));

            }
        });
        pointB_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 3;
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));

            }
        });

        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(scoreTeamA > scoreTeamB){
                    openDialog("Team A has won the match");
                }
                else{
                    openDialog("Team B has won the match");
                }

                scoreTeamA = 0;
                scoreTeamB = 0;
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));
            }
        });

        back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void openDialog(String msg){
        Dialog dialog = new Dialog(msg);
        dialog.show(getSupportFragmentManager(),"dialog");
    }
}