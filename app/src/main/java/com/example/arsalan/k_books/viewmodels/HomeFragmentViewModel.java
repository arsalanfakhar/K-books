package com.example.arsalan.k_books.viewmodels;

import com.example.arsalan.k_books.repositories.SearchTagsRepository;
import com.google.android.material.chip.ChipGroup;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeFragmentViewModel extends ViewModel {

    private MutableLiveData<List<String>> cloud_tags;

    ChipGroup chipGroup;


    private SearchTagsRepository searchRepo;

    public void init(){

        if(cloud_tags!=null)
            return;

        searchRepo=SearchTagsRepository.getInstance();
        cloud_tags=searchRepo.getCloudTags();

    }

    public LiveData<List<String>> getCloudTags(){
        return cloud_tags;
    }

}
