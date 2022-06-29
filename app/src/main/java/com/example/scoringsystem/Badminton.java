package com.example.scoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Badminton extends AppCompatActivity {
    TextView scoreTeamA_tv, scoreTeamB_tv, setTeamA_tv, setTeamB_tv;
    Button pointA_btn, pointB_btn, reset_btn;
    boolean turn;
    int scoreTeamA, scoreTeamB, setTeamA, setTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);

        scoreTeamA_tv = findViewById(R.id.scorePlayer1_tv);
        scoreTeamB_tv = findViewById(R.id.scorePlayer2_tv);
        setTeamA_tv = findViewById(R.id.setPlayer1_tv);
        setTeamB_tv = findViewById(R.id.setPlayer2_tv);

        pointA_btn = findViewById(R.id.pointA_btn);
        pointB_btn = findViewById(R.id.pointB_btn);
        reset_btn = findViewById(R.id.reset_btn);

        scoreTeamA = 0;
        scoreTeamB = 0;
        setTeamA = 0;
        setTeamB = 0;

        turn = true;


        pointA_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA++;
                if((scoreTeamA == 21 ) && (scoreTeamA > scoreTeamB + 1)){
                    scoreTeamA = 0;
                    scoreTeamB = 0;
                    setTeamA++;
                    if(setTeamA == 3){
                        Toast.makeText(Badminton.this, "Team A won the Tournament", Toast.LENGTH_LONG).show();
                        setTeamA = 0;
                        setTeamB = 0;
                        setTeamA_tv.setText(Integer.toString(setTeamA));
                        setTeamB_tv.setText(Integer.toString(setTeamB));
                    }
                    Toast.makeText(Badminton.this, "Team A won the set", Toast.LENGTH_LONG).show();
                }
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));

            }
        });
        pointB_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB++;

                if((scoreTeamB == 21 ) && (scoreTeamB > scoreTeamA + 1)){
                    scoreTeamA = 0;
                    scoreTeamB = 0;
                    setTeamB++;
                    if(setTeamB == 3){
                        Toast.makeText(Badminton.this, "Team B won the Tournament", Toast.LENGTH_LONG).show();
                        setTeamA = 0;
                        setTeamB = 0;
                        setTeamB_tv.setText(Integer.toString(setTeamA));
                        setTeamB_tv.setText(Integer.toString(setTeamB));
                    }
                    Toast.makeText(Badminton.this, "Team B won the set", Toast.LENGTH_LONG).show();

                }
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));

            }
        });
        
        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));
                Toast.makeText(Badminton.this, "Score has been set to 0", Toast.LENGTH_LONG).show();

            }
        });



    }
}