package com.example.arsalan.k_books;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView createacc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        //Hide action bar
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        createacc=findViewById(R.id.btn_create_acc);
        createacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CreateAccountActivity.class);
                startActivity(intent);
            }
        });
    }

}
