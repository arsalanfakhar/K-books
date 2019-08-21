package com.example.arsalan.k_books.model;

public class Books {
    private String mBookTitle;

    private String mBookDescription;
    private int mBookRating;

    private boolean mBookFavourite;
    private String mBookImgUrl;

    public Books(String mBookTitle, String mBookDescription, int mBookRating, boolean mBookFavourite,String mBookImgUrl) {
        this.mBookTitle = mBookTitle;
        this.mBookDescription = mBookDescription;
        this.mBookRating = mBookRating;
        this.mBookFavourite = mBookFavourite;
        this.mBookImgUrl=mBookImgUrl;
    }

    public String getmBookTitle() {
        return mBookTitle;
    }


    public String getmBookDescription() {
        return mBookDescription;
    }


    public int getmBookRating() {
        return mBookRating;
    }


    public boolean ismBookFavourite() {
        return mBookFavourite;
    }

    public String getmBookImgUrl() {
        return mBookImgUrl;
    }

}
