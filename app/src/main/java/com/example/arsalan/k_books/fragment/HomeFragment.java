package com.example.arsalan.k_books.fragment;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.SearchView;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.example.arsalan.k_books.BooksAdapter;
import com.example.arsalan.k_books.R;
import com.example.arsalan.k_books.ViewPagerAdapter;
import com.example.arsalan.k_books.databinding.FragmentHomeBinding;
import com.example.arsalan.k_books.model.Books;
import com.example.arsalan.k_books.model.Slider;
import com.example.arsalan.k_books.viewmodels.HomeFragmentViewModel;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private List<Books> mBooksList;



    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private List<Slider> mSliderList;
    private DotsIndicator dotsIndicator;

    private ChipGroup chipGroup;

    private HomeFragmentViewModel homeFragmentViewModel;
    private FragmentHomeBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


//        View view= inflater.inflate(R.layout.fragment_home,container,false);

        homeFragmentViewModel= ViewModelProviders.of(this).get(HomeFragmentViewModel.class);
        homeFragmentViewModel.init();

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false);
        View view=binding.getRoot();


        binding.setCloudtags(homeFragmentViewModel);
        binding.setLifecycleOwner(this);



        binding.searchTxt.setIconified(true);

        binding.searchTxt.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    List<String> tags=homeFragmentViewModel.getCloudTags().getValue();
                    showChips(tags);

            }
        });

        binding.searchTxt.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                hideChips();
                return false;
            }
        });


        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

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

        binding.recyclerView.setAdapter(booksAdapter);
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

        //add chips

        chipGroup = view.findViewById(R.id.chip_group);





        return view;
    }
    private void showChips(List<String> tagList){

        for (int index = 0; index < tagList.size(); index++) {
            final String tagName = tagList.get(index);
            final Chip chip = new Chip(binding.chipGroup.getContext());

            chip.setPadding(10, 10, 10, 10);
            chip.setText(tagName);

            binding.chipGroup.addView(chip);
        }
        binding.chipGroup.setVisibility(View.VISIBLE);
    }
    private void hideChips(){
        binding.chipGroup.setVisibility(View.GONE);
        binding.chipGroup.removeAllViews();
    }

//    private void setchips(final List<String> tagList) {
//
//        for (int index = 0; index < tagList.size(); index++) {
//            final String tagName = tagList.get(index);
//            final Chip chip = new Chip(getContext());
//            int paddingDp = (int) TypedValue.applyDimension(
//                    TypedValue.COMPLEX_UNIT_DIP, 10,
//                    getResources().getDisplayMetrics()
//            );
//            chip.setPadding(paddingDp, paddingDp, paddingDp, paddingDp);
//            chip.setText(tagName);
//
//            chipGroup.addView(chip);
//        }
//    }
//

}
