/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  java.lang.Class
 *  java.lang.Object
 */
package com.example.android.bisuapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.android.bisuapp.AboutActivity;
import com.example.android.bisuapp.ColorsActivity;
import com.example.android.bisuapp.FamilyActivity;
import com.example.android.bisuapp.NumbersActivity;
import com.example.android.bisuapp.PhrasesActivity;
import com.example.android.bisuapp.QuickCatchActivity;
import com.example.android.bisuapp.QuizActivity;

public class MainActivity
extends AppCompatActivity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296283);
        ((TextView)this.findViewById(2131165264)).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, NumbersActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        ((TextView)this.findViewById(2131165239)).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, FamilyActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        ((TextView)this.findViewById(2131165227)).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, ColorsActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        ((TextView)this.findViewById(2131165268)).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, PhrasesActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        ((TextView)this.findViewById(2131165190)).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, AboutActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        ((TextView)this.findViewById(2131165309)).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, QuickCatchActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        ((TextView)this.findViewById(2131165310)).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, QuizActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

}

