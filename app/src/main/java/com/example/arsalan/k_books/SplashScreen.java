package com.example.arsalan.k_books;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class SplashScreen extends AppCompatActivity {

    @BindView(R.id.bk_image) ImageView bkimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ButterKnife.bind(this);


        Glide.with(this). load(R.drawable.imagebk).into(bkimage);

        //Picasso.get().load(R.drawable.imagebk).into(bkimage);
        Thread myThread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
