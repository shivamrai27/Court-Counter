package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int score=0;
int scoreb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View v){
        score=score+3;
        displayForTeamA(score);
    }
    public void addTwoForTeamA(View v){
        score=score+2;
        displayForTeamA(score);
    }
    public void addOneForTeamA(View v){
        score=score+1;
        displayForTeamA(score);
    }

    public void displayForTeamB(int scoreb){
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreb));
    }
    public void addThreeForTeamB(View v ){
        scoreb=scoreb+3;
        displayForTeamB(scoreb);
    }
    public void addTwoForTeamB(View v){
        scoreb=scoreb+2;
        displayForTeamB(scoreb);
    }
    public void addOneForTeamB(View v){
        scoreb=scoreb+1;
        displayForTeamB(scoreb);
    }
    public void reset(View view) {
        score=0;
        scoreb=0;
        displayForTeamA(score);
        displayForTeamB(scoreb);
    }
}