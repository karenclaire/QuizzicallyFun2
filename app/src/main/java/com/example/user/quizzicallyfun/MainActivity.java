package com.example.user.quizzicallyfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.security.acl.Group;
import java.text.NumberFormat;

import static android.R.attr.checked;
import static android.R.attr.y;
import static android.widget.Toast.makeText;
import static com.example.user.quizzicallyfun.R.id.radio_buttons;

public class MainActivity extends AppCompatActivity {
    int adidasPoint;
    int ferrariPoint;
    int bicPoint;
    int seatPoint;
    int lgPoint;
    int redbullPoint;
    int mazdaPoint;
    int jollibeePoint;
    int mcDonaldsPoint;
    int chevroletPoint;
    int reebokPoint;
    int dunlopPoint;
    int unPoint;
    int wwfPoint;
    int amnestyPoint;
    int internationalPoint;
    int bonusPoint;
    int score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when result button is pressed
     */

    public void result(View view) {
        EditText adidasClue = (EditText) findViewById(R.id.adidas_clue);
        String adidasAnswer = adidasClue.getText().toString();
        if (adidasAnswer.equals("Adidas")) {
            adidasPoint = +1;
        } else {
            adidasPoint = 0;
        }
        displayAdidasScore(adidasPoint);

        EditText ferrariClue = (EditText) findViewById(R.id.ferrari_clue);
        String ferrariAnswer = ferrariClue.getText().toString();
        if (ferrariAnswer.equals("Ferrari")) {
            ferrariPoint = +1;
        } else {
            ferrariPoint = 0;
        }
        displayFerrariScore(ferrariPoint);

        EditText bicClue = (EditText) findViewById(R.id.bic_clue);
        String bicAnswer = bicClue.getText().toString();
        if (bicAnswer.equals("Bic")) {
            bicPoint = +1;
        } else {
            bicPoint = 0;

        }
        displayBicScore(bicPoint);

        EditText seatClue = (EditText) findViewById(R.id.seat_clue);
        String seatAnswer = seatClue.getText().toString();
        if (seatAnswer.equals("Seat")) {
            seatPoint = +1;
        } else {
            seatPoint = 0;
        }
        displaySeatScore(seatPoint);

        EditText lgClue = (EditText) findViewById(R.id.lg_clue);
        String lgAnswer = lgClue.getText().toString();
        if (lgAnswer.equals("LG")) {
            lgPoint = +1;
        }else{
            lgPoint = 0;
        }
        displayLgScore(lgPoint);


        EditText redbullClue = (EditText) findViewById(R.id.redbull_clue);
        String redbullAnswer = redbullClue.getText().toString();
        if (redbullAnswer.equals("Redbull")) {
            redbullPoint = +1;
        } else {
            redbullPoint = 0;
        }
        displayRedbullScore(redbullPoint);

        EditText mazdaClue = (EditText) findViewById(R.id.mazda_clue);
        String mazdaAnswer = mazdaClue.getText().toString();
        if (mazdaAnswer.equals("Mazda")) {
            mazdaPoint = +1;
        } else {
            mazdaPoint = 0;
        }
        displayMazdaScore(mazdaPoint);

        EditText jollibeeClue = (EditText) findViewById(R.id.jollibee_clue);
        String jollibeeAnswer = jollibeeClue.getText().toString();
        if (jollibeeAnswer.equals("Jollibee")) {
            jollibeePoint = +1;
        }else{
            jollibeePoint = 0;
        }
        displayJollibeeScore(jollibeePoint);

        EditText mcDonaldsClue = (EditText) findViewById(R.id.mcdonalds_clue);
        String mcDonaldsAnswer = mcDonaldsClue.getText().toString();
        if (mcDonaldsAnswer.equals("McDonald's")) {
            mcDonaldsPoint = +1;
        } else {
            mcDonaldsPoint = 0;
        }
        displayMcDonaldsScore(mcDonaldsPoint);

        EditText chevroletClue = (EditText) findViewById(R.id.chevrolet_clue);
        String chevroletAnswer = chevroletClue.getText().toString();
        if (chevroletAnswer.equals("Chevrolet")) {
            chevroletPoint = +1;
        }else{
            chevroletPoint = 0;
        }
        displayChevroletScore(chevroletPoint);

        EditText reebokClue = (EditText) findViewById(R.id.reebok_clue);
        String reebokAnswer = reebokClue.getText().toString();
        if (reebokAnswer.equals("Reebok")) {
            reebokPoint = +1;
        }else{
            reebokPoint = 0;
        }
        displayReebokScore(reebokPoint);

        EditText dunlopClue = (EditText) findViewById(R.id.dunlop_clue);
        String dunlopAnswer = dunlopClue.getText().toString();
        if (dunlopAnswer.equals("Dunlop")) {
            dunlopPoint = +1;
        }else{
            dunlopPoint = 0;
        }
        displayDunlopScore(dunlopPoint);

        CheckBox unCheckbox = (CheckBox) findViewById(R.id.un_checkbox);
        CheckBox wwfCheckbox = (CheckBox) findViewById(R.id.wwf_checkbox);
        CheckBox amnestyCheckbox = (CheckBox) findViewById(R.id.amnesty_checkbox);
        if (unCheckbox.isChecked()&& (wwfCheckbox.isChecked()&& !amnestyCheckbox.isChecked())){
            unPoint= +1; wwfPoint= +1;amnestyPoint= -1;
        }else {
            unPoint=+0;wwfPoint=+0;amnestyPoint=+0;
        }

        internationalPoint = (unPoint+wwfPoint+amnestyPoint);
        displayInternationalScore (internationalPoint);


        score = (adidasPoint + ferrariPoint + bicPoint + seatPoint + lgPoint + redbullPoint
                + mazdaPoint + jollibeePoint + mcDonaldsPoint + chevroletPoint + reebokPoint
                + dunlopPoint + internationalPoint + bonusPoint);
        if (score >= 13) {
            makeText(this, "You scored " + score + "! You're so brand conscious!", Toast.LENGTH_SHORT).show();
            makeText(this, "You scored " + score + "! You have some knowledge about it!", Toast.LENGTH_SHORT).show();
        } else if (score >= 10) {
            makeText(this, "You scored " + score + "! You are in the know!", Toast.LENGTH_SHORT).show();
        } else if (score >= 7) {
            makeText(this, "You scored " + score + "! You have some knowledge about it!", Toast.LENGTH_SHORT).show();
        } else if (score >= 4) {
            makeText(this, "You scored " + score + "! You find it a blur!", Toast.LENGTH_SHORT).show();
        } else if (score >= 1) {
            makeText(this, "You scored " + score + "! You usually buy generics!", Toast.LENGTH_SHORT).show();
        }
        TextView finalScore = (TextView) findViewById(R.id.final_score);
        finalScore.setText(String.valueOf(score));
        displayFinalScore (score);
    }

    public void choose (View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.yes_button:
                if (checked) {
                    bonusPoint = +1;
                    break;
                }
            case R.id.no_button:
                if (checked) {
                    bonusPoint = 0;
                    break;
                }
        }
    }


    // method for reset button
    public void reset (View view) {
        adidasPoint = 0;
        ferrariPoint = 0;
        bicPoint = 0;
        seatPoint = 0;
        lgPoint = 0;
        redbullPoint = 0;
        mazdaPoint = 0;
        jollibeePoint = 0;
        mcDonaldsPoint = 0;
        chevroletPoint = 0;
        reebokPoint = 0;
        dunlopPoint = 0;
        internationalPoint = 0;
        bonusPoint = 0;
        score = 0;

        //returns all questions to original state
        EditText adidasClue = (EditText) findViewById(R.id.adidas_clue);
        adidasClue.setText(R.string.clue_adidas);
        EditText ferrariClue = (EditText) findViewById(R.id.ferrari_clue);
        ferrariClue.setText(R.string.clue_ferrari);
        EditText bicClue = (EditText) findViewById(R.id.bic_clue);
        bicClue.setText(R.string.clue_bic);
        EditText seatClue = (EditText) findViewById(R.id.seat_clue);
        seatClue.setText(R.string.clue_seat);
        EditText lgClue = (EditText) findViewById(R.id.lg_clue);
        lgClue.setText(R.string.clue_lg);
        EditText redbullClue = (EditText) findViewById(R.id.redbull_clue);
        redbullClue.setText(R.string.clue_redbull);
        EditText mazdaClue = (EditText) findViewById(R.id.mazda_clue);
        mazdaClue.setText(R.string.clue_mazda);
        EditText jollibeeClue = (EditText) findViewById(R.id.jollibee_clue);
        jollibeeClue.setText(R.string.clue_jollibee);
        EditText mcDonaldsClue = (EditText) findViewById(R.id.mcdonalds_clue);
        mcDonaldsClue.setText(R.string.clue_mcdonalds);
        EditText chevroletClue = (EditText) findViewById(R.id.chevrolet_clue);
        chevroletClue.setText(R.string.clue_chevrolet);
        EditText reebokClue = (EditText) findViewById(R.id.reebok_clue);
        reebokClue.setText(R.string.clue_reebok);
        EditText dunlopClue = (EditText) findViewById(R.id.dunlop_clue);
        dunlopClue.setText(R.string.clue_dunlop);


        CheckBox unCheckbox = (CheckBox) findViewById(R.id.un_checkbox);
        if ( unCheckbox.isChecked()) {
            unCheckbox.setChecked(false);
        }
        CheckBox wwfCheckbox = (CheckBox) findViewById(R.id.wwf_checkbox);
        if ( wwfCheckbox.isChecked()) {
            wwfCheckbox.setChecked(false);
        }

        CheckBox amnestyCheckbox = (CheckBox) findViewById(R.id.amnesty_checkbox);
        if ( amnestyCheckbox.isChecked()) {
            amnestyCheckbox.setChecked(false);
        }


        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_buttons);
        radioGroup.clearCheck();

        // displays all scores to 0
        displayAdidasScore(adidasPoint);
        displayFerrariScore(ferrariPoint);
        displayBicScore(bicPoint);
        displaySeatScore(seatPoint);
        displayLgScore(lgPoint);
        displayMazdaScore(mazdaPoint);
        displayRedbullScore(redbullPoint);
        displayJollibeeScore(jollibeePoint);
        displayMcDonaldsScore(mcDonaldsPoint);
        displayChevroletScore(chevroletPoint);
        displayDunlopScore(dunlopPoint);
        displayReebokScore(reebokPoint);
        displayInternationalScore(internationalPoint);
        displayReset (score);

    }
/**
 *
 * @param adidasPoint shows the score when Adidas quiz is answered
 */
    public void displayAdidasScore(int adidasPoint) {
        TextView adidasScore = (TextView) findViewById(R.id.adidas_score);
        adidasScore.setText(String.valueOf(adidasPoint));
    }
    /**
     *
     * @param ferrariPoint shows the score when Ferrari quiz is answered
     */
    public void displayFerrariScore(int ferrariPoint) {
        TextView ferrariScore = (TextView) findViewById(R.id.ferrari_score);
        ferrariScore.setText(String.valueOf(ferrariPoint));
    }
    /**
     *
     * @param bicPoint shows the score when Bic quiz is answered
     */
    public void displayBicScore(int bicPoint) {
        TextView bicScore = (TextView) findViewById(R.id.bic_score);
        bicScore.setText(String.valueOf(bicPoint));
    }
    /**
     *
     * @param seatPoint shows the score when Seat quiz is answered
     */
    public void displaySeatScore(int seatPoint) {
        TextView seatScore = (TextView) findViewById(R.id.seat_score);
        seatScore.setText(String.valueOf(seatPoint));
    }
    /**
     *
     * @param lgPoint shows the score when LG quiz is answered
     */
    public void displayLgScore(int lgPoint) {
        TextView lgScore = (TextView) findViewById(R.id.lg_score);
        lgScore.setText(String.valueOf(lgPoint));
    }
    /**
     *
     * @param redbullPoint shows the score when RedBull quiz is answered
     */
    public void displayRedbullScore(int redbullPoint) {
        TextView redbullScore = (TextView) findViewById(R.id.redbull_score);
        redbullScore.setText(String.valueOf(redbullPoint));
    }
    /**
     *
     * @param mazdaPoint shows the score when Mazda quiz is answered
     */
    public void displayMazdaScore(int mazdaPoint) {
        TextView mazdaScore = (TextView) findViewById(R.id.redbull_score);
        mazdaScore.setText(String.valueOf(mazdaPoint));
    }

    /**
     *
     * @param jollibeePoint shows the score when Jollibee quiz is answered
     */
    public void displayJollibeeScore(int jollibeePoint) {
        TextView jollibeeScore = (TextView) findViewById(R.id.jollibee_score);
        jollibeeScore.setText(String.valueOf(jollibeePoint));
    }

    /**
     *
     * @param mcDonaldsPoint shows the score when McDonald's quiz is answered
     */
    public void displayMcDonaldsScore(int mcDonaldsPoint) {
        TextView mcDonaldsScore = (TextView) findViewById(R.id.mcdonalds_score);
        mcDonaldsScore.setText(String.valueOf(mcDonaldsPoint));
    }
    /**
     *
     * @param chevroletPoint shows the score when Chevrolet quiz is answered
     */
    public void displayChevroletScore(int chevroletPoint) {
        TextView chevroletScore = (TextView) findViewById(R.id.chevrolet_score);
        chevroletScore.setText(String.valueOf(chevroletPoint));
    }
    /**
     *
     * @param reebokPoint shows the score when Reebok quiz is answered
     */
    public void displayReebokScore(int reebokPoint) {
        TextView reebokScore = (TextView) findViewById(R.id.chevrolet_score);
        reebokScore.setText(String.valueOf(reebokPoint));
    }
    /**
     *
     * @param dunlopPoint shows the score when Dunlop quiz is answered
     */
    public void displayDunlopScore(int dunlopPoint) {
        TextView dunlopScore = (TextView) findViewById(R.id.dunlop_score);
        dunlopScore.setText(String.valueOf(dunlopPoint));
    }
    public void displayFinalScore(int score) {
        TextView finalScore = (TextView) findViewById(R.id.final_score);
        finalScore.setText(String.valueOf(score));

    }
    public void displayReset(int score) {
        TextView finalScore = (TextView) findViewById(R.id.final_score);
        finalScore.setText(String.valueOf(score));

    }
    public void displayInternationalScore(int internationalPoint) {
        TextView internationalScore = (TextView) findViewById(R.id.international_score);
        internationalScore.setText(String.valueOf(internationalPoint));



    }


}


