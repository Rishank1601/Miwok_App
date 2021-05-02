package com.example.android.miwok;

import android.widget.ImageView;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage_not_provided = -1;
    private int mImageResourceID = mImage_not_provided;
    private int mAudioResourceID;


    public Word(String mDefaultTranslation, String mMiwokTranslation, int mAudioResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceID = mAudioResourceID;
    }

    /**
     * @param mDefaultTranslation Storing English translation of word.
     *                            
     * @param mMiwokTranslation   Storing Miwok translation of word.
     * @param imageResourceID     For storing image resource id.
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation, int imageResourceID, int mAudioResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceID = imageResourceID;
        this.mAudioResourceID = mAudioResourceID;
    }

    /**
     * For English translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * For Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * For getting image resource id.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * For checking whether image is present or not for particular category of word.
     */
    public boolean has_image_provided() {
        return mImage_not_provided == mImageResourceID;
    }

    public int getmAudioResourceID() {
        return mAudioResourceID;
    }
}
