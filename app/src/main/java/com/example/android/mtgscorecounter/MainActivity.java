/*
 * Created by Diogo Rodrigues on 22-02-2018 20:29
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 22-02-2018 20:29
 *
 * ==================================================================
 *
 * This project was initially made as part of the Google Challenge 2017. It has evolved a bit and at the moment this is what you've in hands. Nobody knows about its future so who knows if it won't evolve further?
 *
 * This was made as a tool to help players of Magic: The Gathering play their duels/matches easier in the XXI century. It was not to be a full replacement of the game and never will.
 *
 *  I created this after watching a few Championship matches over Youtube and Twitch. They looked like crap and very painful to watch. The main reason is that , unless you're aware of everything (up to date with every single card and effect), it makes you feel lost. It's very like anti-returning/new players and one of many reasons why it's failing after being the number one game (the same can be said with many other card games).
 *
 *  With this I'm not trying to make the game better but instead giving it a hand where I hope someone notices its existence and decides to take a step further into the right direction (like with many other similar apps around). Magic: The Gathering is an old game that needs to be actualized with the present in lots of aspects or it will always be "the game that once was cool to play".
 *
 *  Have fun and I hope this app ends being useful to someone.
 *
 *  ==================================================================
 *
 *  Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License
 *  https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode
 *
 *  By exercising the Licensed Rights (defined below), You accept and agree to be bound by the terms and conditions of this Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License ("Public License"). To the extent this Public License may be interpreted as a contract, You are granted the Licensed Rights in consideration of Your acceptance of these terms and conditions, and the Licensor grants You such rights in consideration of benefits the Licensor receives from making the Licensed Material available under these terms and conditions.
 *
 *  Section 1 – Definitions.
 *
 *      Adapted Material means material subject to Copyright and Similar Rights that is derived from or based upon the Licensed Material and in which the Licensed Material is translated, altered, arranged, transformed, or otherwise modified in a manner requiring permission under the Copyright and Similar Rights held by the Licensor. For purposes of this Public License, where the Licensed Material is a musical work, performance, or sound recording, Adapted Material is always produced where the Licensed Material is synched in timed relation with a moving image.
 *      Adapter's License means the license You apply to Your Copyright and Similar Rights in Your contributions to Adapted Material in accordance with the terms and conditions of this Public License.
 *      BY-NC-SA Compatible License means a license listed at creativecommons.org/compatiblelicenses, approved by Creative Commons as essentially the equivalent of this Public License.
 *      Copyright and Similar Rights means copyright and/or similar rights closely related to copyright including, without limitation, performance, broadcast, sound recording, and Sui Generis Database Rights, without regard to how the rights are labeled or categorized. For purposes of this Public License, the rights specified in Section 2(b)(1)-(2) are not Copyright and Similar Rights.
 *      Effective Technological Measures means those measures that, in the absence of proper authority, may not be circumvented under laws fulfilling obligations under Article 11 of the WIPO Copyright Treaty adopted on December 20, 1996, and/or similar international agreements.
 *      Exceptions and Limitations means fair use, fair dealing, and/or any other exception or limitation to Copyright and Similar Rights that applies to Your use of the Licensed Material.
 *      License Elements means the license attributes listed in the name of a Creative Commons Public License. The License Elements of this Public License are Attribution, NonCommercial, and ShareAlike.
 *      Licensed Material means the artistic or literary work, database, or other material to which the Licensor applied this Public License.
 *      Licensed Rights means the rights granted to You subject to the terms and conditions of this Public License, which are limited to all Copyright and Similar Rights that apply to Your use of the Licensed Material and that the Licensor has authority to license.
 *      Licensor means the individual(s) or entity(ies) granting rights under this Public License.
 *      NonCommercial means not primarily intended for or directed towards commercial advantage or monetary compensation. For purposes of this Public License, the exchange of the Licensed Material for other material subject to Copyright and Similar Rights by digital file-sharing or similar means is NonCommercial provided there is no payment of monetary compensation in connection with the exchange.
 *      Share means to provide material to the public by any means or process that requires permission under the Licensed Rights, such as reproduction, public display, public performance, distribution, dissemination, communication, or importation, and to make material available to the public including in ways that members of the public may access the material from a place and at a time individually chosen by them.
 *      Sui Generis Database Rights means rights other than copyright resulting from Directive 96/9/EC of the European Parliament and of the Council of 11 March 1996 on the legal protection of databases, as amended and/or succeeded, as well as other essentially equivalent rights anywhere in the world.
 *      You means the individual or entity exercising the Licensed Rights under this Public License. Your has a corresponding meaning.
 *
 *  Section 2 – Scope.
 *
 *      License grant.
 *          Subject to the terms and conditions of this Public License, the Licensor hereby grants You a worldwide, royalty-free, non-sublicensable, non-exclusive, irrevocable license to exercise the Licensed Rights in the Licensed Material to:
 *              reproduce and Share the Licensed Material, in whole or in part, for NonCommercial purposes only; and
 *              produce, reproduce, and Share Adapted Material for NonCommercial purposes only.
 *          Exceptions and Limitations. For the avoidance of doubt, where Exceptions and Limitations apply to Your use, this Public License does not apply, and You do not need to comply with its terms and conditions.
 *          Term. The term of this Public License is specified in Section 6(a).
 *          Media and formats; technical modifications allowed. The Licensor authorizes You to exercise the Licensed Rights in all media and formats whether now known or hereafter created, and to make technical modifications necessary to do so. The Licensor waives and/or agrees not to assert any right or authority to forbid You from making technical modifications necessary to exercise the Licensed Rights, including technical modifications necessary to circumvent Effective Technological Measures. For purposes of this Public License, simply making modifications authorized by this Section 2(a)(4) never produces Adapted Material.
 *          Downstream recipients.
 *              Offer from the Licensor – Licensed Material. Every recipient of the Licensed Material automatically receives an offer from the Licensor to exercise the Licensed Rights under the terms and conditions of this Public License.
 *              Additional offer from the Licensor – Adapted Material. Every recipient of Adapted Material from You automatically receives an offer from the Licensor to exercise the Licensed Rights in the Adapted Material under the conditions of the Adapter’s License You apply.
 *              No downstream restrictions. You may not offer or impose any additional or different terms or conditions on, or apply any Effective Technological Measures to, the Licensed Material if doing so restricts exercise of the Licensed Rights by any recipient of the Licensed Material.
 *          No endorsement. Nothing in this Public License constitutes or may be construed as permission to assert or imply that You are, or that Your use of the Licensed Material is, connected with, or sponsored, endorsed, or granted official status by, the Licensor or others designated to receive attribution as provided in Section 3(a)(1)(A)(i).
 *
 *      Other rights.
 *          Moral rights, such as the right of integrity, are not licensed under this Public License, nor are publicity, privacy, and/or other similar personality rights; however, to the extent possible, the Licensor waives and/or agrees not to assert any such rights held by the Licensor to the limited extent necessary to allow You to exercise the Licensed Rights, but not otherwise.
 *          Patent and trademark rights are not licensed under this Public License.
 *          To the extent possible, the Licensor waives any right to collect royalties from You for the exercise of the Licensed Rights, whether directly or through a collecting society under any voluntary or waivable statutory or compulsory licensing scheme. In all other cases the Licensor expressly reserves any right to collect such royalties, including when the Licensed Material is used other than for NonCommercial purposes.
 *
 *  Section 3 – License Conditions.
 *
 *  Your exercise of the Licensed Rights is expressly made subject to the following conditions.
 *
 *      Attribution.
 *
 *          If You Share the Licensed Material (including in modified form), You must:
 *              retain the following if it is supplied by the Licensor with the Licensed Material:
 *                  identification of the creator(s) of the Licensed Material and any others designated to receive attribution, in any reasonable manner requested by the Licensor (including by pseudonym if designated);
 *                  a copyright notice;
 *                  a notice that refers to this Public License;
 *                  a notice that refers to the disclaimer of warranties;
 *                  a URI or hyperlink to the Licensed Material to the extent reasonably practicable;
 *              indicate if You modified the Licensed Material and retain an indication of any previous modifications; and
 *              indicate the Licensed Material is licensed under this Public License, and include the text of, or the URI or hyperlink to, this Public License.
 *          You may satisfy the conditions in Section 3(a)(1) in any reasonable manner based on the medium, means, and context in which You Share the Licensed Material. For example, it may be reasonable to satisfy the conditions by providing a URI or hyperlink to a resource that includes the required information.
 *          If requested by the Licensor, You must remove any of the information required by Section 3(a)(1)(A) to the extent reasonably practicable.
 *      ShareAlike.
 *
 *      In addition to the conditions in Section 3(a), if You Share Adapted Material You produce, the following conditions also apply.
 *          The Adapter’s License You apply must be a Creative Commons license with the same License Elements, this version or later, or a BY-NC-SA Compatible License.
 *          You must include the text of, or the URI or hyperlink to, the Adapter's License You apply. You may satisfy this condition in any reasonable manner based on the medium, means, and context in which You Share Adapted Material.
 *          You may not offer or impose any additional or different terms or conditions on, or apply any Effective Technological Measures to, Adapted Material that restrict exercise of the rights granted under the Adapter's License You apply.
 *
 *  Section 4 – Sui Generis Database Rights.
 *
 *  Where the Licensed Rights include Sui Generis Database Rights that apply to Your use of the Licensed Material:
 *
 *      for the avoidance of doubt, Section 2(a)(1) grants You the right to extract, reuse, reproduce, and Share all or a substantial portion of the contents of the database for NonCommercial purposes only;
 *      if You include all or a substantial portion of the database contents in a database in which You have Sui Generis Database Rights, then the database in which You have Sui Generis Database Rights (but not its individual contents) is Adapted Material, including for purposes of Section 3(b); and
 *      You must comply with the conditions in Section 3(a) if You Share all or a substantial portion of the contents of the database.
 *
 *  For the avoidance of doubt, this Section 4 supplements and does not replace Your obligations under this Public License where the Licensed Rights include other Copyright and Similar Rights.
 *
 *  Section 5 – Disclaimer of Warranties and Limitation of Liability.
 *
 *      Unless otherwise separately undertaken by the Licensor, to the extent possible, the Licensor offers the Licensed Material as-is and as-available, and makes no representations or warranties of any kind concerning the Licensed Material, whether express, implied, statutory, or other. This includes, without limitation, warranties of title, merchantability, fitness for a particular purpose, non-infringement, absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not known or discoverable. Where disclaimers of warranties are not allowed in full or in part, this disclaimer may not apply to You.
 *      To the extent possible, in no event will the Licensor be liable to You on any legal theory (including, without limitation, negligence) or otherwise for any direct, special, indirect, incidental, consequential, punitive, exemplary, or other losses, costs, expenses, or damages arising out of this Public License or use of the Licensed Material, even if the Licensor has been advised of the possibility of such losses, costs, expenses, or damages. Where a limitation of liability is not allowed in full or in part, this limitation may not apply to You.
 *
 *      The disclaimer of warranties and limitation of liability provided above shall be interpreted in a manner that, to the extent possible, most closely approximates an absolute disclaimer and waiver of all liability.
 *
 *  Section 6 – Term and Termination.
 *
 *      This Public License applies for the term of the Copyright and Similar Rights licensed here. However, if You fail to comply with this Public License, then Your rights under this Public License terminate automatically.
 *
 *      Where Your right to use the Licensed Material has terminated under Section 6(a), it reinstates:
 *          automatically as of the date the violation is cured, provided it is cured within 30 days of Your discovery of the violation; or
 *          upon express reinstatement by the Licensor.
 *      For the avoidance of doubt, this Section 6(b) does not affect any right the Licensor may have to seek remedies for Your violations of this Public License.
 *      For the avoidance of doubt, the Licensor may also offer the Licensed Material under separate terms or conditions or stop distributing the Licensed Material at any time; however, doing so will not terminate this Public License.
 *      Sections 1, 5, 6, 7, and 8 survive termination of this Public License.
 *
 *  Section 7 – Other Terms and Conditions.
 *
 *      The Licensor shall not be bound by any additional or different terms or conditions communicated by You unless expressly agreed.
 *      Any arrangements, understandings, or agreements regarding the Licensed Material not stated herein are separate from and independent of the terms and conditions of this Public License.
 *
 *  Section 8 – Interpretation.
 *
 *      For the avoidance of doubt, this Public License does not, and shall not be interpreted to, reduce, limit, restrict, or impose conditions on any use of the Licensed Material that could lawfully be made without permission under this Public License.
 *      To the extent possible, if any provision of this Public License is deemed unenforceable, it shall be automatically reformed to the minimum extent necessary to make it enforceable. If the provision cannot be reformed, it shall be severed from this Public License without affecting the enforceability of the remaining terms and conditions.
 *      No term or condition of this Public License will be waived and no failure to comply consented to unless expressly agreed to by the Licensor.
 *      Nothing in this Public License constitutes or may be interpreted as a limitation upon, or waiver of, any privileges and immunities that apply to the Licensor or You, including from the legal processes of any jurisdiction or authority.
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
