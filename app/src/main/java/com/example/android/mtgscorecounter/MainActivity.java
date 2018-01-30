package com.example.android.mtgscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int winType;
    int duelsOrder = 3;
    String playerA;
    String playerB;
    String[] duels = {"--", "--", "--", "--"};
    int resultA;
    int resultB;
    String results;
    String win;
    int lifeA = 20;
    int lifeB = 20;
    int poisonA = 0;
    int poisonB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addLife_A(View view) {
        lifeA += 1;
        displayLifePlayerA(lifeA);
    }

    public void removeLife_A(View view) {
        lifeA -= 1;
        displayLifePlayerA(lifeA);
        if (lifeA < 1) {
            resultB += 1;
            lifeA = 20;
            lifeB = 20;
            poisonA = 0;
            poisonB = 0;
            winType = 1;
            duelsOrder += 1;
            displayResults(results);
            displayLatestDuels(duels);
            displayLifePlayerA(lifeA);
            displayLifePlayerB(lifeB);
            displayPoisonPlayerA(poisonA);
            displayPoisonPlayerB(poisonB);
        }
    }

    public void addPoison_A(View view) {
        poisonA += 1;
        displayPoisonPlayerA(poisonA);
        if (poisonA > 9) {
            resultB += 1;
            lifeA = 20;
            lifeB = 20;
            poisonA = 0;
            poisonB = 0;
            winType = 2;
            duelsOrder += 1;
            displayResults(results);
            displayLatestDuels(duels);
            displayLifePlayerA(lifeA);
            displayLifePlayerB(lifeB);
            displayPoisonPlayerA(poisonA);
            displayPoisonPlayerB(poisonB);
        }
    }

    public void removePoison_A(View view) {
        poisonA -= 1;
        if (poisonA < 0) {
            poisonA = 0;
        }
        displayPoisonPlayerA(poisonA);
    }

    public void mill_A(View view) {
        resultB += 1;
        lifeA = 20;
        lifeB = 20;
        poisonA = 0;
        poisonB = 0;
        winType = 3;
        duelsOrder += 1;
        displayResults(results);
        displayLatestDuels(duels);
        displayLifePlayerA(lifeA);
        displayLifePlayerB(lifeB);
        displayPoisonPlayerA(poisonA);
        displayPoisonPlayerB(poisonB);
    }

    public void other_A(View view) {
        resultB += 1;
        lifeA = 20;
        lifeB = 20;
        poisonA = 0;
        poisonB = 0;
        winType = 4;
        duelsOrder += 1;
        displayResults(results);
        displayLatestDuels(duels);
        displayLifePlayerA(lifeA);
        displayLifePlayerB(lifeB);
        displayPoisonPlayerA(poisonA);
        displayPoisonPlayerB(poisonB);
    }

    public void addLife_B(View view) {
        lifeB += 1;
        displayLifePlayerB(lifeB);
    }

    public void removeLife_B(View view) {
        lifeB -= 1;
        displayLifePlayerB(lifeB);
        if (lifeB < 1) {
            resultA += 1;
            lifeA = 20;
            lifeB = 20;
            poisonA = 0;
            poisonB = 0;
            winType = 1;
            duelsOrder += 1;
            displayResults(results);
            displayLatestDuels(duels);
            displayLifePlayerA(lifeA);
            displayLifePlayerB(lifeB);
            displayPoisonPlayerA(poisonA);
            displayPoisonPlayerB(poisonB);
        }
    }

    public void addPoison_B(View view) {
        poisonB += 1;
        displayPoisonPlayerB(poisonB);
        if (poisonB > 9) {
            resultA += 1;
            lifeA = 20;
            lifeB = 20;
            poisonA = 0;
            poisonB = 0;
            winType = 2;
            duelsOrder += 1;
            displayResults(results);
            displayLatestDuels(duels);
            displayLifePlayerA(lifeA);
            displayLifePlayerB(lifeB);
            displayPoisonPlayerA(poisonA);
            displayPoisonPlayerB(poisonB);
        }
    }

    public void removePoison_B(View view) {
        poisonB -= 1;
        if (poisonB < 0) {
            poisonB = 0;
        }
        displayPoisonPlayerB(poisonB);
    }

    public void mill_B(View view) {
        resultA += 1;
        lifeA = 20;
        lifeB = 20;
        poisonA = 0;
        poisonB = 0;
        winType = 3;
        duelsOrder += 1;
        displayResults(results);
        displayLatestDuels(duels);
        displayLifePlayerA(lifeA);
        displayLifePlayerB(lifeB);
        displayPoisonPlayerA(poisonA);
        displayPoisonPlayerB(poisonB);
    }

    public void other_B(View view) {
        resultA += 1;
        lifeA = 20;
        lifeB = 20;
        poisonA = 0;
        poisonB = 0;
        winType = 4;
        duelsOrder += 1;
        displayResults(results);
        displayLatestDuels(duels);
        displayLifePlayerA(lifeA);
        displayLifePlayerB(lifeB);
        displayPoisonPlayerA(poisonA);
        displayPoisonPlayerB(poisonB);
    }

    public void tie(View view) {
        resultA += 1;
        resultB += 1;
        lifeA = 20;
        lifeB = 20;
        poisonA = 0;
        poisonB = 0;
        duelsOrder += 1;
        winType = 5;
        displayResults(results);
        displayLatestDuels(duels);
        displayLifePlayerA(lifeA);
        displayLifePlayerB(lifeB);
        displayPoisonPlayerA(poisonA);
        displayPoisonPlayerB(poisonB);
    }

    public void reset_duel(View view) {
        lifeA = 20;
        lifeB = 20;
        poisonA = 0;
        poisonB = 0;
        displayLifePlayerA(lifeA);
        displayLifePlayerB(lifeB);
        displayPoisonPlayerA(poisonA);
        displayPoisonPlayerB(poisonB);
    }

    public void reset_match(View view) {
        playerA = "Player A";
        playerB = "Player B";
        resultA = 0;
        resultB = 0;
        lifeA = 20;
        lifeB = 20;
        poisonA = 0;
        poisonB = 0;
        duels[0] = "--";
        duels[1] = "--";
        duels[2] = "--";
        duels[3] = "--";
        winType = 0;
        displayLatestDuels(duels);
        displayResults(results);
        displayLifePlayerA(lifeA);
        displayLifePlayerB(lifeB);
        displayPoisonPlayerA(poisonA);
        displayPoisonPlayerB(poisonB);
    }

    /**
     * Displays the last four duels with the winning conditions.
     * If life points drop to zero, only the score is displayed.
     */
    public void displayLatestDuels(String[] duels) {
        if (duelsOrder > 3) {
            duelsOrder -= 1;
        }

        for (int i = 0; i < duelsOrder; i++) {
            duels[i] = duels[i + 1];
        }

        if (winType == 0) {
            win = "--";
        }
        if (winType == 1) {
            win = resultA + " - " + resultB + " " + getString(R.string.life);
        }
        if (winType == 2) {
            win = resultA + " - " + resultB + " " + getString(R.string.poison);
        }
        if (winType == 3) {
            win = resultA + " - " + resultB + " " + getString(R.string.mill);
        }
        if (winType == 4) {
            win = resultA + " - " + resultB + " " + getString(R.string.other);
        }
        if (winType == 5) {
            win = resultA + " - " + resultB + " " + getString(R.string.tie);
        }

        duels[duelsOrder] = win;

        TextView duels0View = (TextView) findViewById(R.id.first_match);
        duels0View.setText(String.valueOf(duels[0]));
        TextView duels1View = (TextView) findViewById(R.id.second_match);
        duels1View.setText(String.valueOf(duels[1]));
        TextView duels2View = (TextView) findViewById(R.id.third_match);
        duels2View.setText(String.valueOf(duels[2]));
        TextView duels3View = (TextView) findViewById(R.id.fourth_match);
        duels3View.setText(String.valueOf(duels[3]));
    }

    /**
     * Displays the life points for Player A.
     */
    public void displayLifePlayerA(int lifeA) {
        TextView lifeView = (TextView) findViewById(R.id.life_player_a);
        lifeView.setText(String.valueOf(lifeA));
    }

    /**
     * Displays the poison counters for Player A.
     */
    public void displayPoisonPlayerA(int poisonA) {
        TextView poisonView = (TextView) findViewById(R.id.poison_player_a);
        poisonView.setText(String.valueOf(poisonA));
    }

    /**
     * Displays the life points for Player B.
     */
    public void displayLifePlayerB(int lifeB) {
        TextView lifeView = (TextView) findViewById(R.id.life_player_b);
        lifeView.setText(String.valueOf(lifeB));
    }

    /**
     * Displays the poison counters for Player B.
     */
    public void displayPoisonPlayerB(int poisonB) {
        TextView poisonView = (TextView) findViewById(R.id.poison_player_b);
        poisonView.setText(String.valueOf(poisonB));
    }

    /**
     * Displays the score.
     */
    public void displayResults(String results) {
        results = resultA + " - " + resultB;
        TextView resultsView = (TextView) findViewById(R.id.match_results);
        resultsView.setText(String.valueOf(results));
    }
}
