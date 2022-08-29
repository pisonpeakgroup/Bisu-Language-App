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

public class ColorsActivity
extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296298);
        final ArrayList arrayList = new ArrayList();
        arrayList.add((Object)new Word("red", "color bwom-ubwom", 2131099738, 2131492870));
        arrayList.add((Object)new Word("green", "color kwen-ukwen", 2131099736, 2131492868));
        arrayList.add((Object)new Word("brown", "ubrown", 2131099733, 2131492865));
        arrayList.add((Object)new Word("gray", "ucolor gray", 2131099735, 2131492867));
        arrayList.add((Object)new Word("black", "ucolor ushu-shi", 2131099732, 2131492864));
        arrayList.add((Object)new Word("white", "pupu", 2131099739, 2131492871));
        arrayList.add((Object)new Word("dusty yellow", "udusty-yellow", 2131099734, 2131492866));
        arrayList.add((Object)new Word("mustard yellow", "umustard yellow", 2131099737, 2131492869));
        WordAdapter wordAdapter = new WordAdapter((Context)this, (ArrayList<Word>)arrayList, 2130968614);
        ListView listView = (ListView)this.findViewById(2131165252);
        listView.setAdapter((ListAdapter)wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int n, long l) {
                Word word = (Word)arrayList.get(n);
                ColorsActivity.this.mMediaPlayer = MediaPlayer.create((Context)ColorsActivity.this, (int)word.getAudioResourceId());
                ColorsActivity.this.mMediaPlayer.start();
            }
        });
    }

}

