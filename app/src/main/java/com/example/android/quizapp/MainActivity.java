package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


//    set a global variable

    int totalScoreOne = 0, totalScoreTwo = 0, totalScoreThree = 0;

    String quizAnswers = "Your answers are: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method works when the submit answer button is pressed.
     */

    public void submitAnswers(View view) {
        int finalScore = totalScoreOne + totalScoreTwo + totalScoreThree;



        Toast.makeText(this, "Your Total Score is " + finalScore, Toast.LENGTH_SHORT).show();
        Button button = findViewById(R.id.submit_answer_button);
        button.setEnabled(false);
    }

    /**
     * This method gives the answers from the radio buttons.
     */
    public void onRadioButtonClicked(View view) {

        //Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.transpoOfSubstances:
                if (checked) {
                    quizAnswers += "Transport of substance.";
                    totalScoreOne = totalScoreOne + 1;
                }
                break;
            case R.id.bloodClotting:
                if (checked) {
                    quizAnswers += "Blood clotting";

                }
                break;
            case R.id.maintainsDiffusion:
                if (checked) {
                    quizAnswers += "Maintains a diffusion gradient so that there is maximum uptake of oxygen";
                    totalScoreTwo = totalScoreTwo + 1;
                }
                break;
            case R.id.OxygenDiffuse:
                if (checked) {
                    quizAnswers += "Oxygen continues diffusing into blood and carbon iv oxide into Water";


                }
                break;
            case R.id.asthma:
                if (checked) {
                    quizAnswers += "Asthma";

                    totalScoreThree = totalScoreThree + 1;

                }
                break;
            case R.id.bronchitis:
                if (checked) {
                    quizAnswers += "Bronchitis";


                }
                break;
            case R.id.tuberculosis:
                if (checked) {
                    quizAnswers += "tuberculosis";


                }
                break;
        }
//        return quizAnswers;

    }

    /**
     * This method gives the answer for the check boxes.
     */
    public String onCheckboxClicked(View view) {

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.happy_to_continue_checkbox:
                if (checked) {
                    quizAnswers += "\nI am glad you enjoyed this quiz.";

                } else {
                    quizAnswers += "\nI am sorry you did not enjoy the quiz.";
                }
                break;
        }
        return quizAnswers;
    }

}
