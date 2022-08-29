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

public class FamilyActivity
extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296298);
        final ArrayList arrayList = new ArrayList();
        arrayList.add((Object)new Word("father", "apa or Itah", 2131099741, 2131492873));
        arrayList.add((Object)new Word("mother", "ama or Inah", 2131099744, 2131492876));
        arrayList.add((Object)new Word("son", "uwan-unyichie", 2131099747, 2131492879));
        arrayList.add((Object)new Word("daughter", "uwan-unyie", 2131099740, 2131492872));
        arrayList.add((Object)new Word("older brother", "uwana-unyichie wugbele", 2131099745, 2131492877));
        arrayList.add((Object)new Word("younger brother", "uwan-unyichie wumee", 2131099748, 2131492880));
        arrayList.add((Object)new Word("older sister", "uwan-unyie wugbele", 2131099746, 2131492878));
        arrayList.add((Object)new Word("younger sister", "uwan-unyie wumee", 2131099749, 2131492881));
        arrayList.add((Object)new Word("grandmother", "mama or mama-ule", 2131099743, 2131492875));
        arrayList.add((Object)new Word("grandfather", "paapa apa-ule", 2131099742, 2131492874));
        WordAdapter wordAdapter = new WordAdapter((Context)this, (ArrayList<Word>)arrayList, 2130968615);
        ListView listView = (ListView)this.findViewById(2131165252);
        listView.setAdapter((ListAdapter)wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int n, long l) {
                Word word = (Word)arrayList.get(n);
                FamilyActivity.this.mMediaPlayer = MediaPlayer.create((Context)FamilyActivity.this, (int)word.getAudioResourceId());
                FamilyActivity.this.mMediaPlayer.start();
            }
        });
    }

}

