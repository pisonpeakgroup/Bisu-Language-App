/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.Drawable
 *  android.media.MediaPlayer
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.ImageView
 *  java.lang.Object
 */
package com.example.android.bisuapp;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QuickCatchActivity
extends AppCompatActivity {
    AnimationDrawable rocketAnimation;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296284);
        ImageView imageView = (ImageView)this.findViewById(2131165315);
        imageView.setBackgroundResource(2131099750);
        this.rocketAnimation = (AnimationDrawable)imageView.getBackground();
        this.rocketAnimation.start();
        Button button = (Button)this.findViewById(2131165269);
        final MediaPlayer mediaPlayer = MediaPlayer.create((Context)this, (int)2131492882);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        ((Button)this.findViewById(2131165270)).setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });
    }

}

