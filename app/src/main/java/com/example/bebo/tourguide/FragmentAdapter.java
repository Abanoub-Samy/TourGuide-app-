package com.example.bebo.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private Context context;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new PublicPlaces();
        } else if (position == 2) {
            return new Museums();
        } else if (position == 3) {
            return new Hotels();
        } else if (position == 0){
            return new First_Fragment();
        }
        else
            return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 1) {
            return context.getString(R.string.public_places);
        } else if (position == 2) {
            return context.getString(R.string.museums);
        } else if (position == 3) {
            return context.getString(R.string.hotels);
        } else if (position == 0) {
            return context.getString(R.string.first);
        }
        else {
            return null;
        }
    }
}