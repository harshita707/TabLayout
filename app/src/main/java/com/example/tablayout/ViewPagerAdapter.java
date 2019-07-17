package com.example.tablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList=new ArrayList<>();
    private final List<String> FragmentListTitles=new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTitles.get(position);
    }

    @Override
    public int getCount() {
        return FragmentListTitles.size();
    }
    public void AddFragment(Fragment fragment,String Titles)
    {
        fragmentList.add(fragment);
        FragmentListTitles.add(Titles);
    }

}