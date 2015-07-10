package com.khalidtawil.geoquiz;

/**
 * Created by khalidtawil on 7/6/15.
 * An instance of this class represents a True/False question
 */
public class TrueFalse {

    // instance variables
    private int mQuestion;
    private boolean mTrueQuestion;

    // constructor
    public TrueFalse (int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    // accessor method
    public int getQuestion() {
        return mQuestion;
    }

    // setter method
    public void setQuestion(int question) {
        mQuestion = question;
    }

    // accessor method
    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    // setter method
    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

}
