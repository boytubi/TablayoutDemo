package com.example.hoangtruc.tablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter{
    private static final String FIRST = "First";
    private static final String SECOND = "Second";
    private static final String THIRD = "Third";
    PagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment mFrag = null;
        switch (position){
            case 0:
                mFrag = new FragmentFirst();
                break;
            case 1:
                mFrag = new FragmentSecond();
                break;
            case 2:
                mFrag = new FragmentThird();
                break;
        }
        return mFrag;
    }
    @Override
    public int getCount() {
        return 3;
    }
    public  CharSequence getPageTitle(int position){
        String mTittle = "";
        switch (position){
            case 0:
                mTittle = FIRST;
                break;
            case 1:
                mTittle = SECOND;
                break;
            case 2:
                mTittle = THIRD;
                break;
        }
        return mTittle;
    }
}
