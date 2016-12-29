package com.example.babarmustafa.sixkalmaapp;

/**
 * Created by Babar Mustafa on 10/7/2016.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;


public class TabAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> mFragmentArrayList;
    private Context mContext;

    public TabAdapter(FragmentManager fm, ArrayList<Fragment> mFragmentArrayList) {
        super(fm);
        this.mFragmentArrayList = mFragmentArrayList;

    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentArrayList.size();
    }
}
