package com.example.scoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Football extends AppCompatActivity {
    TextView scoreTeamA_tv, scoreTeamB_tv, setTeamA_tv, setTeamB_tv;
    Button pointA_btn, pointB_btn, reset_btn;
    int scoreTeamA, scoreTeamB;
    ImageView back_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        back_iv = findViewById(R.id.backArrow_iv);

        scoreTeamA_tv = findViewById(R.id.scorePlayer1_tv);
        scoreTeamB_tv = findViewById(R.id.scorePlayer2_tv);

        pointA_btn = findViewById(R.id.pointA_btn);
        pointB_btn = findViewById(R.id.pointB_btn);
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