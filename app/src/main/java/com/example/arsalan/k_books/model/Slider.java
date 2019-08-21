package com.example.arsalan.k_books.model;

public class Slider {
    private String mSliderText;

    private int mSliderImageid;

    public Slider(String mSliderText, int mSliderImageid) {
        this.mSliderText = mSliderText;
        this.mSliderImageid = mSliderImageid;
    }

    public String getmSliderText() {
        return mSliderText;
    }

    public void setmSliderText(String mSliderText) {
        this.mSliderText = mSliderText;
    }

    public int getmSliderImageid() {
        return mSliderImageid;
    }

    public void setmSliderImageid(int mSliderImageid) {
        this.mSliderImageid = mSliderImageid;
    }
}
