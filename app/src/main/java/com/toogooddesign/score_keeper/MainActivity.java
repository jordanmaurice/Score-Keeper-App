package com.toogooddesign.score_keeper;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView teamOne;
    TextView teamTwo;
    TextView teamOneFouls;
    TextView teamTwoFouls;
    TextView teamOneTimeouts;
    TextView teamTwoTimeouts;

    int score1;
    int score2;
    int timeouts1;
    int timeouts2;
    int fouls1;
    int fouls2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamOne = (TextView) findViewById(R.id.team1score);
        teamTwo = (TextView) findViewById(R.id.team2score);
        teamOneFouls= (TextView) findViewById(R.id.fouls1);
        teamTwoFouls = (TextView) findViewById(R.id.fouls2);
        teamOneTimeouts= (TextView) findViewById(R.id.timeouts1);
        teamTwoTimeouts= (TextView) findViewById(R.id.timeouts2);

    }

    public void clickButton(View arg0){
        score1    =  Integer.parseInt(teamOne.getText().toString());
        score2    =  Integer.parseInt(teamTwo.getText().toString());
        timeouts1 =  Integer.parseInt(teamOneTimeouts.getText().toString());
        timeouts2 =  Integer.parseInt(teamTwoTimeouts.getText().toString());
        fouls1    =  Integer.parseInt(teamOneFouls.getText().toString());
        fouls2    =  Integer.parseInt(teamTwoFouls.getText().toString());
        switch(arg0.getId()) {
            case R.id.team1score1:
                score1+=1;
                teamOne.setText(String.valueOf(score1));
                break;
            case R.id.team1score2:
                score1+=2;
                teamOne.setText(String.valueOf(score1));
                break;
            case R.id.team1score3:
                score1+=3;
                teamOne.setText(String.valueOf(score1));
                break;
            case R.id.team2score1:
                score2+=1;
                teamTwo.setText(String.valueOf(score2));
                break;
            case R.id.team2score2:
                score2+=2;
                teamTwo.setText(String.valueOf(score2));
                break;
            case R.id.team2score3:
                score2+=3;
                teamTwo.setText(String.valueOf(score2));
                break;
            case R.id.reset:
                teamOne.setText("0");
                teamTwo.setText("0");
                teamOneFouls.setText("0");
                teamTwoFouls.setText("0");
                teamOneTimeouts.setText("6");
                teamTwoTimeouts.setText("6");
                break;
            case R.id.foulsOne:
                fouls1+=1;
                teamOneFouls.setText(String.valueOf(fouls1));
                break;
            case R.id.foulsTwo:
                fouls2+=1;
                teamTwoFouls.setText(String.valueOf(fouls2));
                break;
            case R.id.timeoutsOne:
                if(timeouts1>0) {
                    timeouts1-=1;
                    teamOneTimeouts.setText(String.valueOf(timeouts1));
                }
                else{
                    //Toast no timeouts left
                }
                break;
            case R.id.timeoutsTwo:
                if(timeouts2>0){
                    timeouts2-=1;
                    teamTwoTimeouts.setText(String.valueOf(timeouts2));
                }
                else{
                    //Toast no timeouts left
                }
                break;
        }
    }


}
