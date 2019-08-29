package com.example.arsalan.k_books;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

//    @BindView(R.id.btn_create_acc)TextView createacc;

    @OnClick(R.id.login_btn) public void loginclick(View view){
        Intent intent=new Intent(getApplicationContext(),DashboardActivity.class);
        startActivity(intent);
    }


    @OnClick(R.id.btn_create_acc) public void onclick(View view){
        Intent intent=new Intent(getApplicationContext(),CreateAccountActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        ButterKnife.bind(this);


//        createacc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getApplicationContext(),CreateAccountActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        loginbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getApplicationContext(),DashboardActivity.class);
//                startActivity(intent);
//            }
//        });


    }

}
