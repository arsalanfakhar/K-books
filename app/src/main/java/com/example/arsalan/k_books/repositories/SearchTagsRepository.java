package com.example.arsalan.k_books.repositories;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.MutableLiveData;

public class SearchTagsRepository {

    private static SearchTagsRepository instance;

    private SearchTagsRepository(){

    }

    public static SearchTagsRepository getInstance() {

        if(instance==null)
            instance=new SearchTagsRepository();
        return instance;
    }

    //Change this type according to server response of cloud tags
    public MutableLiveData<List<String>> getCloudTags(){

        MutableLiveData<List<String>> tags_list=new MutableLiveData<>();

        List<String> chipList=new ArrayList<>();
        chipList.add("Health and fitness");
        chipList.add("Medical Books");
        chipList.add("Women Health");
        chipList.add("Afsaney");
        chipList.add("Islamic");
        chipList.add("home");
        chipList.add("Medical Books");
        chipList.add("Women Health");
        chipList.add("Afsaney");
        chipList.add("Islamic");

        tags_list.setValue(chipList);

        return tags_list;
    }

}
