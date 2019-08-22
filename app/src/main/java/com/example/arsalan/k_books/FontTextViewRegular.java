package com.example.arsalan.k_books;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class FontTextViewRegular extends androidx.appcompat.widget.AppCompatTextView {
    public FontTextViewRegular(Context context) {
        super(context);

    }
    public FontTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "Roboto_Regular.ttf");
        this.setTypeface(face);
    }

    public FontTextViewRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "Roboto_Regular.ttf");
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);


    }
}
