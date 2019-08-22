package com.example.arsalan.k_books;


import android.content.Context;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arsalan.k_books.model.Slider;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<Slider> sliderList;
    private LayoutInflater layoutInflater;

    public ViewPagerAdapter(Context mContext, List<Slider> sliderList) {
        this.mContext = mContext;
        this.sliderList = sliderList;
    }

    @Override
    public int getCount() {
        return sliderList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view.equals(obj);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=LayoutInflater.from(mContext);
        View view=layoutInflater.inflate(R.layout.slider_card,container,false);

        ImageView slider_img;
        TextView slider_title;

        slider_img=view.findViewById(R.id.slider_img);
        slider_title=view.findViewById(R.id.slider_txt);

        slider_img.setImageResource(sliderList.get(position).getmSliderImageid());
        slider_title.setText(sliderList.get(position).getmSliderText());
        //now set image

        container.addView(view,0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
