/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.text.Editable
 *  android.view.View
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.RadioButton
 *  android.widget.Toast
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.example.android.bisuapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity
extends AppCompatActivity {
    ImageView image;
    EditText question10_answer;
    RadioButton question1_choice3;
    EditText question2_answer;
    CheckBox question2_choice2;
    CheckBox question3_choice1;
    CheckBox question3_choice3;
    CheckBox question3_choice4;
    EditText question4_answer;
    RadioButton question5_choice2;
    RadioButton question6_answer1;
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    EditText question8_answer;
    RadioButton question9_choice2;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.image = (ImageView)this.findViewById(2131165247);
        this.setContentView(2131296285);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void submitAnswers(View view) {
        String string2;
        this.question1_choice3 = (RadioButton)this.findViewById(2131165278);
        int n = Boolean.valueOf((boolean)this.question1_choice3.isChecked()).booleanValue() ? 1 : 0;
        String string3 = n != 1 ? "You Failed Question 1 Dear." : "You Got Question 1 Correct.";
        this.question2_answer = (EditText)this.findViewById(2131165280);
        int n2 = this.question2_answer.getText().toString().equals((Object)"True");
        String string4 = n2 != 1 ? "You Failed Question 2 Dear." : "You Got Question 2 Correct.";
        this.question3_choice1 = (CheckBox)this.findViewById(2131165282);
        this.question2_choice2 = (CheckBox)this.findViewById(2131165283);
        this.question3_choice3 = (CheckBox)this.findViewById(2131165284);
        this.question3_choice4 = (CheckBox)this.findViewById(2131165285);
        Boolean bl = this.question3_choice1.isChecked();
        Boolean bl2 = this.question2_choice2.isChecked();
        Boolean bl3 = this.question3_choice3.isChecked();
        Boolean bl4 = this.question3_choice4.isChecked();
        int n3 = bl != false && bl2 == false && bl3 == false && bl4 == false ? 1 : 0;
        String string5 = n3 != 1 ? "You Failed Question 3 Dear." : "You Got Question 3 Correct.";
        this.question4_answer = (EditText)this.findViewById(2131165287);
        int n4 = this.question4_answer.getText().toString().equals((Object)"Obudu Ranch Resort, Obanliku, Cross River, Nigeria");
        String string6 = n4 != 1 ? "You Failed Question 4 Dear." : "You Got Question 4 Correct.";
        this.question5_choice2 = (RadioButton)this.findViewById(2131165291);
        int n5 = Boolean.valueOf((boolean)this.question5_choice2.isChecked()).booleanValue();
        String string7 = n5 != 1 ? "You Failed Question 5 Dear." : "You Got Question 5 Correct.";
        this.question6_answer1 = (RadioButton)this.findViewById(2131165294);
        int n6 = Boolean.valueOf((boolean)this.question6_answer1.isChecked()).booleanValue();
        String string8 = n6 != 1 ? "You Failed Question 6 Dear." : "You Got Question 6 Correct.";
        this.question7_choice1 = (CheckBox)this.findViewById(2131165298);
        this.question7_choice2 = (CheckBox)this.findViewById(2131165299);
        this.question7_choice3 = (CheckBox)this.findViewById(2131165300);
        this.question7_choice4 = (CheckBox)this.findViewById(2131165301);
        Boolean bl5 = this.question7_choice1.isChecked();
        Boolean bl6 = this.question7_choice2.isChecked();
        Boolean bl7 = this.question7_choice3.isChecked();
        String string9 = string8;
        Boolean bl8 = this.question7_choice4.isChecked();
        int n7 = bl5 != false && bl6 == false && bl7 == false && bl8 == false ? 1 : 0;
        String string10 = n7 != 1 ? "You Failed Question 7 Dear." : "You Got Question 7 Correct.";
        this.question8_answer = (EditText)this.findViewById(2131165303);
        int n8 = this.question8_answer.getText().toString().equals((Object)"google play store");
        String string11 = n8 != 1 ? "You Failed Question 8 Dear." : "You Got Question 8 Correct.";
        String string12 = string11;
        this.question9_choice2 = (RadioButton)this.findViewById(2131165306);
        int n9 = Boolean.valueOf((boolean)this.question9_choice2.isChecked()).booleanValue();
        String string13 = string10;
        String string14 = n9 != 1 ? "You Failed Question 9 Dear." : "You Got Question 9 Correct.";
        String string15 = string14;
        this.question10_answer = (EditText)this.findViewById(2131165275);
        int n10 = this.question10_answer.getText().toString().equals((Object)"Farming, Trading, Hospitality Services, Transport Services, Educational and more!");
        String string16 = n10 != 1 ? "You Failed Question 10 Dear." : "You Got Question 10 Correct.";
        int n11 = n10 + (n9 + (n8 + (n7 + (n6 + (n5 + (n4 + (n3 + (n + n2))))))));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
        stringBuilder.append(string6);
        stringBuilder.append(string7);
        stringBuilder.append(string9);
        stringBuilder.append(string13);
        stringBuilder.append(string12);
        stringBuilder.append(string15);
        stringBuilder.append(string16);
        String string17 = stringBuilder.toString();
        if (n11 == 10) {
            string2 = "Wow, Perfect! You scored 10 out of 10";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("No way, Try again. You scored ");
            stringBuilder2.append(n11);
            stringBuilder2.append(" out of 10");
            string2 = stringBuilder2.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string17.toString());
        stringBuilder3.append(string2.toString());
        String string18 = stringBuilder3.toString();
        Toast toast = Toast.makeText((Context)this.getApplicationContext(), (CharSequence)string18, (int)1);
        toast.setGravity(17, 0, 0);
        toast.show();
    }
}

