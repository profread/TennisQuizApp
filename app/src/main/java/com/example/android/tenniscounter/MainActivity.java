package com.example.android.tenniscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamNadal = 0;
    int scoreTeamNovak = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForNadal(scoreTeamNadal);
        displayForNovak(scoreTeamNovak);

    }
    /**
     * This method is called when the +15 button for Team Nadal button is clicked.
     */
    public void addFifteenPointForTeamNadal(View view) {
        scoreTeamNadal= scoreTeamNadal + 15;
        displayForNadal(scoreTeamNadal);

    }

    /**
     * This method is called when the ++15 button for Team Nadal button is clicked.
     */
    public void add2ndFifteenpointforTeamNadal(View view) {
        scoreTeamNadal= scoreTeamNadal + 3*5;
        displayForNadal(scoreTeamNadal);

    }
    /**
     * This method is called when the +10 button for Team Nadal button is clicked.
     */
    public void addTenPointForTeamNadal(View view) {
        scoreTeamNadal= scoreTeamNadal + 10;
        displayForNadal(scoreTeamNadal);

    }
    /**
     * This method is called when the ++10 button for Team Nadal button is clicked.
     */
    public void add2ndTenPointForTeamNadal(View view) {
        scoreTeamNadal= scoreTeamNadal + 2*5;
        displayForNadal(scoreTeamNadal);


    }

    /**
     * This method is called when the +15 button for Team Novak button is clicked.
     */
    public void addFifteenPointForTeamNovak(View view) {
        scoreTeamNovak= scoreTeamNovak + 15;
        displayForNovak(scoreTeamNovak);

    }

    /**
     * This method is called when the ++15 button for Team Novak button is clicked.
     */
    public void add2ndFifteenpointforTeamNovak(View view) {
        scoreTeamNovak= scoreTeamNovak + 3*5;
        displayForNovak(scoreTeamNovak);

    }
    /**
     * This method is called when the +10 button for Team Novak button is clicked.
     */
    public void addTenPointForTeamNovak(View view) {
        scoreTeamNovak= scoreTeamNovak + 10;
        displayForNovak(scoreTeamNovak);

    }
    /**
     * This method is called when the ++10 button for Team Novak button is clicked.
     */
    public void add2ndTenpointForTeamNovak(View view) {
        scoreTeamNovak= scoreTeamNovak + 2*5;
        displayForNovak(scoreTeamNovak);

    }
    /**
     * This method is called when the reset bottom is clicked.
     */

    public void resetScore(View view)  {
        scoreTeamNadal = 0;
        scoreTeamNovak = 0;
        displayForNadal(scoreTeamNadal);
        displayForNovak(scoreTeamNovak);
    }

    /**
     * Displays score for Team Nadal.
     */
    public void displayForNadal(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_nadal_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays score for Team Novak.
     */
    public void displayForNovak(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_novak_score);
        scoreView.setText(String.valueOf(score));

    }


}