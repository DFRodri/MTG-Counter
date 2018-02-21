package com.example.android.mtgscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  //global variables used

    //records the winning type
    int winType;

    //initial position of the first result to be displayed
    //if there was a zero here, the results would be updated from the left to the right instead from the right to the left
    int duelsOrder = 3;

    //format of playerA & B array: {life, poison counters, current result}
    //values declared are the starting values
    int[] playerA = {20, 0, 0};
    int[] playerB = {20, 0, 0};

    //initial displayed values at the last duels
    String[] duels = {"--", "--", "--", "--"};

    //stores the current duel score displayed
    String results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method to add life to player A
    public void addLife_A(View view) {

        playerA[0]++;
        displayLifePlayerA(playerA[0]);

    }

    //method to remove life from player A
    public void removeLife_A(View view) {

        playerA[0]--;
        displayLifePlayerA(playerA[0]);

        if (playerA[0] < 1) {

            playerB[2]++;

            winType = 1;
            duelsOrder++;

            displayResults(results);
            displayLatestDuels(duels);
            reset_duel(view);

        }

    }

    public void addPoison_A(View view) {

        playerA[1]++;
        displayPoisonPlayerA(playerA[1]);

        if (playerA[1] > 9) {

            playerB[2]++;

            winType = 2;
            duelsOrder++;

            displayResults(results);
            displayLatestDuels(duels);
            reset_duel(view);

        }

    }

    //method to remove a poison counter from player A
    public void removePoison_A(View view) {

        playerA[1]--;

        if (playerA[1] < 0) {
            playerA[1] = 0;
        }

        displayPoisonPlayerA(playerA[1]);

    }

    public void mill_A(View view) {

        playerB[2]++;

        winType = 3;
        duelsOrder++;

        displayResults(results);
        displayLatestDuels(duels);
        reset_duel(view);

    }

    public void other_A(View view) {

        playerB[2]++;

        winType = 4;
        duelsOrder++;

        displayResults(results);
        displayLatestDuels(duels);
        reset_duel(view);

    }

    //method to add a life point to player A
    public void addLife_B(View view) {

        playerB[0]++;
        displayLifePlayerB(playerB[0]);

    }

    //method to remove a life point from player A
    public void removeLife_B(View view) {

        playerB[0]--;
        displayLifePlayerB(playerB[0]);

        if (playerB[0] < 1) {

            playerA[2]++;

            winType = 1;
            duelsOrder++;

            displayResults(results);
            displayLatestDuels(duels);
            reset_duel(view);

        }

    }

    //method to add a poison counter to player B
    public void addPoison_B(View view) {

        playerB[1]++;
        displayPoisonPlayerB(playerB[1]);

        if (playerB[1] > 9) {

            playerA[2]++;

            winType = 2;
            duelsOrder++;

            displayResults(results);
            displayLatestDuels(duels);
            reset_duel(view);

        }

    }

    //method to remove a poison counter from player B
    public void removePoison_B(View view) {

        playerB[1]--;

        if (playerB[1] < 0) {
            playerB[1] = 0;
        }

        displayPoisonPlayerB(playerB[1]);

    }

    //method to declare that player B lost by being out of cards to draw(a.k.a. mill)
    public void mill_B(View view) {

        playerA[2]++;

        winType = 3;
        duelsOrder++;

        displayResults(results);
        displayLatestDuels(duels);
        reset_duel(view);

    }

    //method to declare that player B lost by a non-common method (e.g.: card effect)
    public void other_B(View view) {

        playerA[2]++;

        winType = 4;
        duelsOrder++;

        displayResults(results);
        displayLatestDuels(duels);
        reset_duel(view);

    }

    //method to declare the current duel as a tie, restart the duel, and update the score at the top with that piece of info
    public void tie(View view) {

        playerA[2]++;
        playerB[2]++;

        duelsOrder++;
        winType = 5;

        displayResults(results);
        displayLatestDuels(duels);
        reset_duel(view);

    }

    //method to reset the current duel to its initial values
    //it's also called by any other method when someone loses a duel
    public void reset_duel(View view) {

        playerA[0] = 20;
        playerB[0] = 20;
        playerA[1] = 0;
        playerB[1] = 0;

        displayLifePlayerA(playerA[0]);
        displayLifePlayerB(playerB[0]);
        displayPoisonPlayerA(playerA[1]);
        displayPoisonPlayerB(playerB[1]);

    }


    //method to reset everything to their initial values, even the name of the players
    public void reset_match(View view) {

        TextView namePlayerA = this.findViewById(R.id.name_player_a);
        TextView namePlayerB = this.findViewById(R.id.name_player_b);

        namePlayerA.setText("");
        namePlayerB.setText("");


        playerA[2] = 0;
        playerB[2] = 0;

        duels[0] = "--";
        duels[1] = "--";
        duels[2] = "--";
        duels[3] = "--";
        winType = 0;

        displayLatestDuels(duels);
        displayResults(results);
        reset_duel(view);

    }

    //method that displays the results for the last four duels with the respective winning conditions
    //it also pushes the results from the right to the left whenever a duel ends
    public void displayLatestDuels(String[] duels) {

        String win;

        //prevents data to be displayed offscreen
        if (duelsOrder > 3) {
            duelsOrder--;
        }

        //follow up to the offscreen data display; grabs data contained in the variables and push it to the left
        System.arraycopy(duels, 1, duels, 0, duels.length-1);

        if (winType == 0) {
            win = "--";
        } else {

            win = playerA[2] + " - " + playerB[2] + " ";

            if (winType == 1) {
                win += getString(R.string.life);
            }
            if (winType == 2) {
                win += getString(R.string.poison);
            }
            if (winType == 3) {
                win += getString(R.string.mill);
            }
            if (winType == 4) {
                win += getString(R.string.other);
            }
            if (winType == 5) {
                win += getString(R.string.tie);
            }

        }

        duels[duelsOrder] = win;

        TextView duelsText0 = this.findViewById(R.id.first_match);
        TextView duelsText1 = this.findViewById(R.id.second_match);
        TextView duelsText2 = this.findViewById(R.id.third_match);
        TextView duelsText3 = this.findViewById(R.id.fourth_match);

        duelsText0.setText(String.valueOf(duels[0]));
        duelsText1.setText(String.valueOf(duels[1]));
        duelsText2.setText(String.valueOf(duels[2]));
        duelsText3.setText(String.valueOf(duels[3]));
    }

    //method to display the life points for Player A
    public void displayLifePlayerA(int lifeA) {

        TextView lifeView = this.findViewById(R.id.life_player_a);
        lifeView.setText(String.valueOf(lifeA));

    }

    //method to display the poison counters for Player A
    public void displayPoisonPlayerA(int poisonA) {

        TextView poisonView = this.findViewById(R.id.poison_player_a);
        poisonView.setText(String.valueOf(poisonA));

    }

    //method to display the life points for Player B
    public void displayLifePlayerB(int lifeB) {

        TextView lifeView = this.findViewById(R.id.life_player_b);
        lifeView.setText(String.valueOf(lifeB));

    }

    //method to display the poison counters for Player B
    public void displayPoisonPlayerB(int poisonB) {

        TextView poisonView = this.findViewById(R.id.poison_player_b);
        poisonView.setText(String.valueOf(poisonB));

    }

    //method to display the current score
    public void displayResults(String results) {

        results = playerA[2] + " - " + playerB[2];
        TextView resultsView = this.findViewById(R.id.match_results);
        resultsView.setText(results);

    }

}
