package com.example.calcext;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PageViewAdepter extends FragmentPagerAdapter {
    public PageViewAdepter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment=new Fragment_Simple();
                break;
            case 1:
                fragment=new Fragment_Age();
                break;
            case 2:
                fragment=new Fragment_Search();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
