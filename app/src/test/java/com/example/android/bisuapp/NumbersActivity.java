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

public class NumbersActivity
extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296298);
        final ArrayList arrayList = new ArrayList();
        arrayList.add((Object)new Word("one", "ikinne", 2131099801, 2131492887));
        arrayList.add((Object)new Word("two", "ifua", 2131099806, 2131492892));
        arrayList.add((Object)new Word("three", "ichie", 2131099805, 2131492891));
        arrayList.add((Object)new Word("four", "ini", 2131099799, 2131492885));
        arrayList.add((Object)new Word("five", "idang", 2131099798, 2131492884));
        arrayList.add((Object)new Word("six", "idang-ikenne", 2131099803, 2131492889));
        arrayList.add((Object)new Word("seven", "idang-ifua", 2131099802, 2131492888));
        arrayList.add((Object)new Word("eight", "idang-ichie", 2131099797, 2131492883));
        arrayList.add((Object)new Word("nine", "idang-ini", 2131099800, 2131492886));
        arrayList.add((Object)new Word("ten", "liwhoo", 2131099804, 2131492890));
        WordAdapter wordAdapter = new WordAdapter((Context)this, (ArrayList<Word>)arrayList, 2130968616);
        ListView listView = (ListView)this.findViewById(2131165252);
        listView.setAdapter((ListAdapter)wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int n, long l) {
                Word word = (Word)arrayList.get(n);
                NumbersActivity.this.mMediaPlayer = MediaPlayer.create((Context)NumbersActivity.this, (int)word.getAudioResourceId());
                NumbersActivity.this.mMediaPlayer.start();
            }
        });
    }

}

