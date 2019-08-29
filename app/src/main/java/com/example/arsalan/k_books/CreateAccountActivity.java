package com.example.arsalan.k_books;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateAccountActivity extends AppCompatActivity {

    @BindView(R.id.login_txt) TextView logintxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        ButterKnife.bind(this);

//        TextView textView = (TextView) findViewById(R.id.txt_view);
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "Roboto_Black.ttf");
//        textView.setTypeface(typeface);


        logintxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
