package works.agus.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamA2points (View view){
        teamAScore = teamAScore + 2;
        displayScoreA(teamAScore);
    }

    public void teamA3points (View view) {
        teamAScore = teamAScore + 3;
        displayScoreA(teamAScore);
    }

    public void teamA1point (View view) {
        teamAScore = teamAScore + 1;
        displayScoreA(teamAScore);
    }

    public void teamB2points (View view){
        teamBScore = teamBScore + 2;
        displayScoreB(teamBScore);
    }

    public void teamB3points (View view) {
        teamBScore = teamBScore + 3;
        displayScoreB(teamBScore);
    }

    public void teamB1point (View view) {
        teamBScore = teamBScore + 1;
        displayScoreB (teamBScore);
    }

    public void resetScore (View view){
        teamAScore = 0;
        teamBScore = 0;
        displayScoreA (teamAScore);
        displayScoreB (teamBScore);
    }

    private void displayScoreA (int number){
        TextView scoreATextView = (TextView) findViewById(R.id.team_a_score);
        scoreATextView.setText("" + number);
    }

    private void displayScoreB (int number){
        TextView scoreATextView = (TextView) findViewById(R.id.team_b_score);
        scoreATextView.setText("" + number);
    }
}
