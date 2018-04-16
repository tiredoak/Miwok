package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word the user wants to learn
 * It contains the english word and its miwok translation
 * */
public class Word {

    private final int NO_IMAGE = -1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE;
    private int mAudioResourceId;

    /**
     * @param defaultTranslation corresponds to the english word
     * @param miwokTranslation corresponds to the miwok word
     * @param imageResourceId points to the image associated with each image
     * @param audioResourceId points to the audio associated with each image
     * */
    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    public int getmAudioResourceId() { return mAudioResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE; }
}
