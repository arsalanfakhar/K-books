package com.example.arsalan.k_books.util;

import android.util.TypedValue;
import android.view.View;

import com.example.arsalan.k_books.fragment.HomeFragment;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.List;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.LiveData;

public class BindingAdapters {



@BindingAdapter("iconifiedByDefault")
    public static void settags(ChipGroup chipGroup, LiveData<List<String>> data){
        List<String> tagList=data.getValue();

    for (int index = 0; index < tagList.size(); index++) {
        final String tagName = tagList.get(index);
        final Chip chip = new Chip(chipGroup.getContext());

        chip.setPadding(10, 10, 10, 10);
        chip.setText(tagName);

        chipGroup.addView(chip);
    }

    }


}
