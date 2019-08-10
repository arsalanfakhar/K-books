package com.example.arsalan.k_books;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateAccountActivity extends AppCompatActivity {
    private TextView logintxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        //Hide action bar
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }

//        TextView textView = (TextView) findViewById(R.id.txt_view);
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "Roboto_Black.ttf");
//        textView.setTypeface(typeface);


        logintxt=findViewById(R.id.login_txt);
        logintxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
//                startActivity(intent);
                finish();
            }
        });
    }
}
