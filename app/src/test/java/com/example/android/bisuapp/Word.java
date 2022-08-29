/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.example.android.bisuapp;

public class Word {
    private static final int NO_AUDIO_PROVIDED = -1;
    public static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId = -1;
    private String mBisuTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = -1;

    public Word(String string2, String string3) {
        this.mDefaultTranslation = string2;
        this.mBisuTranslation = string3;
    }

    public Word(String string2, String string3, int n) {
        this.mDefaultTranslation = string2;
        this.mBisuTranslation = string3;
        this.mImageResourceId = n;
    }

    public Word(String string2, String string3, int n, int n2) {
        this.mDefaultTranslation = string2;
        this.mBisuTranslation = string3;
        this.mImageResourceId = n;
        this.mAudioResourceId = n2;
    }

    public int getAudioResourceId() {
        return this.mAudioResourceId;
    }

    public String getBisuTranslation() {
        return this.mBisuTranslation;
    }

    public String getDefaultTranslation() {
        return this.mDefaultTranslation;
    }

    public int getImageResourceId() {
        return this.mImageResourceId;
    }

    public boolean hasImage() {
        return this.mImageResourceId != -1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Word{mDefaultTranslation='");
        stringBuilder.append(this.mDefaultTranslation);
        stringBuilder.append('\'');
        stringBuilder.append(", mBisuTranslation='");
        stringBuilder.append(this.mBisuTranslation);
        stringBuilder.append('\'');
        stringBuilder.append(", mImageResourceId=");
        stringBuilder.append(this.mImageResourceId);
        stringBuilder.append(", mAudioResourceId=");
        stringBuilder.append(this.mAudioResourceId);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

