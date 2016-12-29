package com.example.babarmustafa.sixkalmaapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class Kalma_MainActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private TabAdapter adapter;
    private ArrayList<Fragment> mFragmentArrayList;
    private Tab1 mTab1;
    private Tab2 mTab2;
    private Tab3 mTab3;
    private Tab4 mTab4;
    private Tab5 mTab5;
    private Tab6 mTab6;
    private Tab7 mTab7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this, R.raw.abc);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma__main);

        mTab1 = new Tab1();
        mTab2 = new Tab2();
        mTab3 = new Tab3();
        mTab4 = new Tab4();
        mTab5 = new Tab5();
        mTab6 = new Tab6();
        mTab7 = new Tab7();

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mFragmentArrayList = new ArrayList<>();
           /*
        * add Fragment to ArrayList
        */
        mFragmentArrayList.add(mTab1);
        mFragmentArrayList.add(mTab2);
        mFragmentArrayList.add(mTab3);
        mFragmentArrayList.add(mTab4);
        mFragmentArrayList.add(mTab5);
        mFragmentArrayList.add(mTab6);
        mFragmentArrayList.add(mTab7);

        mTabLayout.addTab(mTabLayout.newTab().setText(""));
        mTabLayout.addTab(mTabLayout.newTab().setText("ist"));
        mTabLayout.addTab(mTabLayout.newTab().setText("second"));
        mTabLayout.addTab(mTabLayout.newTab().setText("third"));
        mTabLayout.addTab(mTabLayout.newTab().setText("fourth"));
        mTabLayout.addTab(mTabLayout.newTab().setText("five"));
        mTabLayout.addTab(mTabLayout.newTab().setText("six"));


        adapter = new TabAdapter(getSupportFragmentManager(), mFragmentArrayList);

        mViewPager.setAdapter(adapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        mViewPager.setOffscreenPageLimit(2);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                mMediaPlayer.stop();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
