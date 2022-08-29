/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.example.android.bisuapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.android.bisuapp.Word;
import com.example.android.bisuapp.WordAdapter;
import java.util.ArrayList;

public class PhrasesActivity
extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296298);
        final ArrayList arrayList = new ArrayList();
        arrayList.add((Object)new Word("Where are you going?", "kinne wah yi?", -1, 2131492901));
        arrayList.add((Object)new Word("What is your name?", "Bang yi li gin liwon?", -1, 2131492900));
        arrayList.add((Object)new Word("My name is...", "li gin liye liyi...", -1, 2131492899));
        arrayList.add((Object)new Word("How are you feeling?", "nah woo yi?", -1, 2131492895));
        arrayList.add((Object)new Word("I\u2019m feeling good.", "iyi kang-kang", -1, 2131492897));
        arrayList.add((Object)new Word("Are you coming?", "wah bah ga?", -1, 2131492893));
        arrayList.add((Object)new Word("Yes, I\u2019m coming.", "eh i bah ging", -1, 2131492902));
        arrayList.add((Object)new Word("I\u2019m coming.", "i bah ging", -1, 2131492896));
        arrayList.add((Object)new Word("Let\u2019s go.", "li ye", -1, 2131492898));
        arrayList.add((Object)new Word("Come here.", "beh ging", -1, 2131492894));
        WordAdapter wordAdapter = new WordAdapter((Context)this, (ArrayList<Word>)arrayList, 2130968617);
        ListView listView = (ListView)this.findViewById(2131165252);
        listView.setAdapter((ListAdapter)wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int n, long l) {
                Word word = (Word)arrayList.get(n);
                PhrasesActivity.this.mMediaPlayer = MediaPlayer.create((Context)PhrasesActivity.this, (int)word.getAudioResourceId());
                PhrasesActivity.this.mMediaPlayer.start();
            }
        });
    }

}

