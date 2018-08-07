package com.example.android.bisuapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

// Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","apa or Itah",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("mother","ama or Inah",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("son","uwan-unyichie",R.drawable.family_son,R.raw.family_son));
        words.add(new Word("daughter","uwan-unyie",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("older brother","uwana-unyichie wugbele",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Word("younger brother","uwan-unyichie wumee",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("older sister","uwan-unyie wugbele",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("younger sister","uwan-unyie wumee",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("grandmother","mama or mama-ule",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("grandfather","paapa apa-ule",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_family);

        ListView listView =  findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        //Onclick listeners to play audio
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();


            }
        });
    }}
