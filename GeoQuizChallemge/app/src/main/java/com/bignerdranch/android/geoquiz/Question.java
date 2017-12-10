package com.bignerdranch.android.geoquiz;

/**
 * Created by becha on 2/20/17.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mIsCheated = false;

    public Question(int textResId, boolean AnswerTrue){
        mTextResId = textResId;
        mAnswerTrue = AnswerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isCheated() {
        return mIsCheated;
    }

    public boolean getIsCheated(){return mIsCheated;}

    public void setIsCheated(boolean isCheated) {
        mIsCheated = isCheated;
    }
}
