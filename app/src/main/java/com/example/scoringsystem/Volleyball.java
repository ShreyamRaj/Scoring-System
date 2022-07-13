package com.example.scoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Volleyball extends AppCompatActivity {
    TextView scoreTeamA_tv, scoreTeamB_tv, setTeamA_tv, setTeamB_tv;
    Button pointA_btn, pointB_btn, reset_btn;
    int scoreTeamA, scoreTeamB, setTeamA, setTeamB;
    ImageView back_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_volleyball);

        back_iv = findViewById(R.id.backArrow_iv);

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

        pointA_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA++;
                if((scoreTeamA == 21 ) && (scoreTeamA > scoreTeamB + 1)){
                    scoreTeamA = 0;
                    scoreTeamB = 0;
                    setTeamA++;
                    if(setTeamA == 3){
                        openDialog("Team A has won the tournament!");
                        setTeamA = 0;
                        setTeamB = 0;
                        setTeamA_tv.setText(Integer.toString(setTeamA));
                        setTeamB_tv.setText(Integer.toString(setTeamB));
                    }
                    openDialog("Team A has won the set!");
                }
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));
                setTeamA_tv.setText(Integer.toString(setTeamA));
                setTeamB_tv.setText(Integer.toString(setTeamB));


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
                        openDialog("Team B has won the tournament!");
                        setTeamA = 0;
                        setTeamB = 0;
                        setTeamB_tv.setText(Integer.toString(setTeamA));
                        setTeamB_tv.setText(Integer.toString(setTeamB));
                    }
                    openDialog("Team B has won the set!");

                }
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));
                setTeamA_tv.setText(Integer.toString(setTeamA));
                setTeamB_tv.setText(Integer.toString(setTeamB));

            }
        });

        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                setTeamA = 0;
                setTeamB = 0;
                scoreTeamA_tv.setText(Integer.toString(scoreTeamA));
                scoreTeamB_tv.setText(Integer.toString(scoreTeamB));
                setTeamA_tv.setText(Integer.toString(setTeamA));
                setTeamB_tv.setText(Integer.toString(setTeamB));
                Toast.makeText(Volleyball.this, "Score has been set to 0", Toast.LENGTH_LONG).show();

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