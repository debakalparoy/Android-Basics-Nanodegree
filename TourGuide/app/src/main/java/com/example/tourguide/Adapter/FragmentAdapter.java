package com.example.tourguide.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tourguide.Fragment.FoodFragment;
import com.example.tourguide.Fragment.HotelsFragment;
import com.example.tourguide.Fragment.InfoFragment;
import com.example.tourguide.Fragment.PlacesFragment;
import com.example.tourguide.R;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new InfoFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.category_places);
            case 1:
                return context.getString(R.string.category_food);
            case 2:
                return context.getString(R.string.category_hotels);
            default:
                return context.getString(R.string.category_info);
        }
    }
}
