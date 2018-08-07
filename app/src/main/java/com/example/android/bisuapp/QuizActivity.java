package com.example.android.bisuapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    // Question 1
    RadioButton question1_choice3;
    // Question 2
    EditText question2_answer;
    // Question 3
    CheckBox question3_choice1;
    CheckBox question2_choice2;
    CheckBox question3_choice3;
    CheckBox question3_choice4;
    // Question 4
    EditText question4_answer;
    // Question 5
    RadioButton question5_choice2;
    // Question 6
    RadioButton question6_answer1;
    // Question 7
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    // Question 8
    EditText question8_answer;
    // Question 9
    RadioButton question9_choice2;
    // Question 10
    EditText question10_answer;
    // Banner Image
    android.widget.ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Banner image
        image =  findViewById(R.id.imageView1);
        setContentView(R.layout.activity_quiz);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is answer1
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        question1_choice3 =  this.findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 2 - Correct Answer is "text"
        //------------------------------------------------------------------------------------------
        String answer2;
        String text;
         question2_answer = findViewById(R.id.question2_answer);
        answer2 = question2_answer.getText().toString();
        text = "True";
        if (answer2.equals(text)) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers is answer3_choice1
        //------------------------------------------------------------------------------------------
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_choice1 = this.findViewById(R.id.question3_choice1);
        question2_choice2 = this.findViewById(R.id.question3_choice2);
        question3_choice3 = this.findViewById(R.id.question3_choice3);
        question3_choice4 = this.findViewById(R.id.question3_choice4);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice2 = question2_choice2.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        answer3_choice4 = question3_choice4.isChecked();
        if (answer3_choice1 && !answer3_choice2 && !answer3_choice3 && !answer3_choice4) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is tet
        //------------------------------------------------------------------------------------------
        String answer4;
        String tet;
        question4_answer =  this.findViewById(R.id.question4_answer);
        answer4 = question4_answer.getText().toString();
        tet = "Obudu Ranch Resort, Obanliku, Cross River, Nigeria";
        if (answer4.equals(tet)) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is answer5
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        question5_choice2 =  this.findViewById(R.id.question5_choice2);
        answer5 = question5_choice2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is choice1
        //------------------------------------------------------------------------------------------
        Boolean answer6;
        question6_answer1 =  this.findViewById(R.id.question6_choice1);
        answer6 = question6_answer1.isChecked();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 7  - Correct Answers is answer7_choice1
        //------------------------------------------------------------------------------------------
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_choice1 =  this.findViewById(R.id.question7_choice1);
        question7_choice2 =  this.findViewById(R.id.question7_choice2);
        question7_choice3 =  this.findViewById(R.id.question7_choice3);
        question7_choice4 =  this.findViewById(R.id.question7_choice4);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();
        if (answer7_choice1 && !answer7_choice2 && !answer7_choice3 && !answer7_choice4) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is "text3"
        //------------------------------------------------------------------------------------------
        String answer8;
        String text3;
        question8_answer =  this.findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString();
        text3 = "google play store";
        if (answer8.equals(text3)) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 9  - Correct Answers is #2 "question9_choice2"
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        question9_choice2 =  this.findViewById(R.id.question9_choice2);
        answer9 = question9_choice2.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 10 - Correct Answer is "text4"
        //------------------------------------------------------------------------------------------
        String answer10;
        String text4;
        question10_answer =  this.findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString();
        text4 = "Farming, Trading, Hospitality Services, Transport Services, Educational and more!";
        if (answer10.equals(text4)) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 10) {
            resultsDisplay = "Wow, Perfect! You scored 10 out of 10";
        } else {
            resultsDisplay = "No way, Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();


    }
}
