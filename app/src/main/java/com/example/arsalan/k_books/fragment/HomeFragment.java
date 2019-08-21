package com.example.arsalan.k_books.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.arsalan.k_books.BooksAdapter;
import com.example.arsalan.k_books.R;
import com.example.arsalan.k_books.ViewPagerAdapter;
import com.example.arsalan.k_books.model.Books;
import com.example.arsalan.k_books.model.Slider;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private List<Books> mBooksList;



    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private List<Slider> mSliderList;
    private DotsIndicator dotsIndicator;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view= inflater.inflate(R.layout.fragment_home,container,false);

        SearchView searchView=view.findViewById(R.id.search_txt);

        searchView.setIconified(true);


        RecyclerView recyclerView=view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mBooksList=new ArrayList<>();

        mBooksList.add(
                new Books("LOREM IPSUM","New book",5,true,""));

        mBooksList.add(
                new Books("hello","New book",3,false,""));
        mBooksList.add(
                new Books("hello","New book",2,true,""));
        mBooksList.add(
                new Books("hello","New book",1,false,""));

        BooksAdapter booksAdapter=new BooksAdapter(getContext(),mBooksList);

        recyclerView.setAdapter(booksAdapter);
//        ImageView icon= searchView.findViewById(android.support.v7.appcompat.R.id.search_button);
//
//        icon.setColorFilter(Color.WHITE);
//        EditText searchtxt=view.findViewById(R.id.search_txt);
//
//        searchtxt.setHint("Enter text to search");


        //View pager working
        dotsIndicator=view.findViewById(R.id.dotsIndicator);
        mViewPager=view.findViewById(R.id.viewPager);

        mSliderList=new ArrayList<>();
        mSliderList.add(new Slider("Trending Books",R.drawable.slider_img1));
        mSliderList.add(new Slider("Trending Topics",R.drawable.slider_img1));

        mViewPagerAdapter=new ViewPagerAdapter(getContext(),mSliderList);

        mViewPager.setAdapter(mViewPagerAdapter);

        dotsIndicator.setViewPager(mViewPager);












        return view;
    }
}
