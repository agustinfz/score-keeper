package works.agus.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;

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

    private void displayScoreA (int number){
        TextView scoreATextView = (TextView) findViewById(R.id.team_a_score);
        scoreATextView.setText("" + number);
    }
}
