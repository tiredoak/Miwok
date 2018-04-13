package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word the user wants to learn
 * It contains the english word and its miwok translation
 * */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    /**
     * @param defaultTranslation corresponds to the english word
     * @param miwokTranslation corresponds to the miwok word
     * */
    public Word (String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Getters
    public String getmDefaultTranslation() { return mDefaultTranslation; }

    public String getmMiwokTranslation() { return mMiwokTranslation; }
}
