package com.e.cleangoa;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {

        super(fm);
    }
    ViewPager vg;
    @Override
    public Fragment getItem(int position) {

        DemoFragment demoFragment = new DemoFragment(position);
        position = position + 1;
        Bundle bundel = new Bundle();
        demoFragment.setArguments(bundel);
        Log.v("fragment no:",demoFragment.getpos()+"");
        return demoFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position = position + 1;
        if (position ==1) {
            return "Events";
        } else {
            if (position == 2) {
                return "Segregation";
            } else {
                return "Know your Waste";
            }
        }

    }

}
