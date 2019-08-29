package com.example.arsalan.k_books;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.arsalan.k_books.fragment.PostAdFragment;
import com.example.arsalan.k_books.fragment.HomeFragment;

public class DashboardActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener navListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem menuItem) {
            Fragment selectedfragment=null;

            switch (menuItem.getItemId()){
                case R.id.nav_home:
                    selectedfragment=new HomeFragment();
                    break;
                case R.id.nav_post_add:
                    selectedfragment=new PostAdFragment();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    selectedfragment).commit();

            return true;
        }
    };


    @BindView(R.id.bottom_nav) BottomNavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

//        //Hide action bar
//        if(getSupportActionBar()!=null){
//            getSupportActionBar().hide();
//        }


        ButterKnife.bind(this);



        navigationView.setOnNavigationItemSelectedListener(navListener);

        //opening home fragment by default
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();



    }
}
