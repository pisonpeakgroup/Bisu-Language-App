/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v4.content.ContextCompat
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.example.android.bisuapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.android.bisuapp.Word;
import java.util.ArrayList;
import java.util.List;

public class WordAdapter
extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> arrayList, int n) {
        super(context, 0, arrayList);
        this.mColorResourceId = n;
    }

    public View getView(int n, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from((Context)this.getContext()).inflate(2131296286, viewGroup, false);
        }
        Word word = (Word)this.getItem(n);
        TextView textView = (TextView)view.findViewById(2131165219);
        word.getClass();
        textView.setText((CharSequence)word.getBisuTranslation());
        ((TextView)view.findViewById(2131165233)).setText((CharSequence)word.getDefaultTranslation());
        ImageView imageView = (ImageView)view.findViewById(2131165246);
        if (word.hasImage()) {
            imageView.setImageResource(word.getImageResourceId());
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        view.findViewById(2131165351).setBackgroundColor(ContextCompat.getColor((Context)this.getContext(), (int)this.mColorResourceId));
        return view;
    }
}

