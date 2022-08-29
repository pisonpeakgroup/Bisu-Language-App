/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.text.util.Linkify
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.CharSequence
 */
package com.example.android.bisuapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

public class AboutActivity
extends AppCompatActivity {
    @SuppressLint(value={"SetTextI18n"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296282);
        TextView textView = (TextView)this.findViewById(2131165192);
        textView.setText((CharSequence)"https://www.facebook.com/Bisu-Language-App-866562296878057/");
        Linkify.addLinks((TextView)textView, (int)1);
    }
}

