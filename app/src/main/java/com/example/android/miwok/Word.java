package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word the user wants to learn
 * It contains the english word and its miwok translation
 * */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    /**
     * @param defaultTranslation corresponds to the english word
     * @param miwokTranslation corresponds to the miwok word
     * @param imageResourceId points to the image associated with each image
     * */
    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }
    /**
     * @param defaultTranslation corresponds to the english word
     * @param miwokTranslation corresponds to the miwok word
     * Not all words have associated images, thus the constructor
     * */
    public Word (String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Getters
    public String getmDefaultTranslation() { return mDefaultTranslation; }

    public String getmMiwokTranslation() { return mMiwokTranslation; }

    public int getmImageResourceId() { return mImageResourceId; }
}
