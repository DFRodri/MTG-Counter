/*
 * Created by Diogo Rodrigues on 22-02-2018 20:29
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 22-02-2018 20:29
 *
 *
 */

package com.example.android.mtgscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //global variables used

    //variables used to handle the rotations
    private static final String PLAYER_A = "playerAStats";
    private static final String PLAYER_B = "playerBStats";
    private static final String LAST_DUELS = "duelsValues";
    private static final String CURRENT_SCORE = "currentScoreSaved";

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
    String currentScore;

    /**
     * adicionar cartas de magic ao fundo de vida e pontos de veneno
     * adicionar um cristal de cor como drawable a cada nome de jogador
     **/

    //saves the important variables to use when the screen rotates, before the onDestroy() happens
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putIntArray(PLAYER_A, playerA);
        savedInstanceState.putIntArray(PLAYER_B, playerB);
        savedInstanceState.putStringArray(LAST_DUELS, duels);
        savedInstanceState.putString(CURRENT_SCORE, currentScore);

    }

    //reloads the important saved stuff when the screen rotated, after the onDestroy() happens
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        playerA = savedInstanceState.getIntArray(PLAYER_A);
        playerB = savedInstanceState.getIntArray(PLAYER_B);
        duels = savedInstanceState.getStringArray(LAST_DUELS);
        currentScore = savedInstanceState.getString(CURRENT_SCORE);

        displayLifePlayerA();
        displayLifePlayerB();
        displayPoisonPlayerA();
        displayPoisonPlayerB();
        displayDuelsResults();
        displayResults();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //method to add a life point to player A
    public void addLife_A(View view) {

        playerA[0]++;
        displayLifePlayerA();

    }

    //method to remove a life point from player A and if it that value goes to zero, declare player B as the winner
    public void removeLife_A(View view) {

        playerA[0]--;
        displayLifePlayerA();

        if (playerA[0] < 1) {

            playerB[2]++;

            winType = 1;
            duelsOrder++;

            displayResults();
            displayLatestDuels();
            reset_duel(view);

        }

    }

    //method to add a poison counter to player A and if 10, declare player B as the winner of the current duel
    public void addPoison_A(View view) {

        playerA[1]++;
        displayPoisonPlayerA();

        if (playerA[1] > 9) {

            playerB[2]++;

            winType = 2;
            duelsOrder++;

            displayResults();
            displayLatestDuels();
            reset_duel(view);

        }

    }

    //method to remove a poison counter from player A and prevent it to go into negatives
    public void removePoison_A(View view) {

        playerA[1]--;

        if (playerA[1] < 0) {
            playerA[1] = 0;
        }

        displayPoisonPlayerA();

    }

    //method to declare that player A lost because he couldn't draw a card from his/her deck(a.k.a. mill)
    public void mill_A(View view) {

        playerB[2]++;

        winType = 3;
        duelsOrder++;

        displayResults();
        displayLatestDuels();
        reset_duel(view);

    }

    //method to declare that player A lost by a non-common method (e.g.: card effect)
    public void other_A(View view) {

        playerB[2]++;

        winType = 4;
        duelsOrder++;

        displayResults();
        displayLatestDuels();
        reset_duel(view);

    }

    //method to add a life point to player B
    public void addLife_B(View view) {

        playerB[0]++;
        displayLifePlayerB();

    }

    //method to remove a life point from player B and if it that value goes to zero, declare player A as the winner
    public void removeLife_B(View view) {

        playerB[0]--;
        displayLifePlayerB();

        if (playerB[0] < 1) {

            playerA[2]++;

            winType = 1;
            duelsOrder++;

            displayResults();
            displayLatestDuels();
            reset_duel(view);

        }

    }

    //method to add a poison counter to player B and if 10, declare player A as the winner of the current duel
    public void addPoison_B(View view) {

        playerB[1]++;
        displayPoisonPlayerB();

        if (playerB[1] > 9) {

            playerA[2]++;

            winType = 2;
            duelsOrder++;

            displayResults();
            displayLatestDuels();
            reset_duel(view);

        }

    }

    //method to remove a poison counter from player B and prevent it to go into negatives
    public void removePoison_B(View view) {

        playerB[1]--;

        if (playerB[1] < 0) {
            playerB[1] = 0;
        }

        displayPoisonPlayerB();

    }

    //method to declare that player B lost because he couldn't draw a card from his/her deck(a.k.a. mill)
    public void mill_B(View view) {

        playerA[2]++;

        winType = 3;
        duelsOrder++;

        displayResults();
        displayLatestDuels();
        reset_duel(view);

    }

    //method to declare that player B lost by a non-common method (e.g.: card effect)
    public void other_B(View view) {

        playerA[2]++;

        winType = 4;
        duelsOrder++;

        displayResults();
        displayLatestDuels();
        reset_duel(view);

    }

    //method to declare the current duel as a tie, restart the duel, and update the score at the top with that piece of info
    public void tie(View view) {

        playerA[2]++;
        playerB[2]++;

        duelsOrder++;
        winType = 5;

        displayResults();
        displayLatestDuels();
        reset_duel(view);

    }

    //method to reset the current duel to its initial values
    //it's also called by any other method when someone loses a duel
    public void reset_duel(View view) {

        playerA[0] = 20;
        playerB[0] = 20;
        playerA[1] = 0;
        playerB[1] = 0;

        displayLifePlayerA();
        displayLifePlayerB();
        displayPoisonPlayerA();
        displayPoisonPlayerB();

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

        displayLatestDuels();
        displayResults();
        reset_duel(view);

    }

    //method that displays the results for the last four duels with the respective winning conditions
    //it also pushes the results from the right to the left whenever a duel ends
    public void displayLatestDuels() {

        String win;

        //prevents data to be displayed offscreen
        if (duelsOrder > 3) {
            duelsOrder--;
        }

        //follow up to the offscreen data display; grabs data contained in the variables and push it to the left
        System.arraycopy(duels, 1, duels, 0, duels.length - 1);

        //makes the string to place into one of the boxes at the top bar
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

        displayDuelsResults();

    }

    public void displayDuelsResults(){

        TextView duelsText0 = this.findViewById(R.id.first_match);
        TextView duelsText1 = this.findViewById(R.id.second_match);
        TextView duelsText2 = this.findViewById(R.id.third_match);
        TextView duelsText3 = this.findViewById(R.id.fourth_match);

        duelsText0.setText(duels[0]);
        duelsText1.setText(duels[1]);
        duelsText2.setText(duels[2]);
        duelsText3.setText(duels[3]);

    }

    //method to display the life points for Player A
    public void displayLifePlayerA() {

        TextView lifeViewA = this.findViewById(R.id.life_player_a);
        lifeViewA.setText(String.valueOf(playerA[0]));

    }

    //method to display the poison counters for Player A
    public void displayPoisonPlayerA() {

        TextView poisonViewA = this.findViewById(R.id.poison_player_a);
        poisonViewA.setText(String.valueOf(playerA[1]));

    }

    //method to display the life points for Player B
    public void displayLifePlayerB() {

        TextView lifeViewB = this.findViewById(R.id.life_player_b);
        lifeViewB.setText(String.valueOf(playerB[0]));

    }

    //method to display the poison counters for Player B
    public void displayPoisonPlayerB() {

        TextView poisonViewB = this.findViewById(R.id.poison_player_b);
        poisonViewB.setText(String.valueOf(playerB[1]));

    }

    //method to display the current score
    public void displayResults() {

        currentScore = playerA[2] + " - " + playerB[2];
        TextView resultsView = this.findViewById(R.id.match_results);
        resultsView.setText(currentScore);

    }

}
