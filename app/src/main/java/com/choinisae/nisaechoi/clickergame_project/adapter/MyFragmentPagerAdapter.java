package com.choinisae.nisaechoi.clickergame_project.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.choinisae.nisaechoi.clickergame_project.fragment.ShopFragment;

/**
 * Created by donghaechoi on 2016. 4. 14..
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public static final int PAGE_COUNT = 3;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                // 고용란
                return ShopFragment.newInstance();
            }
            case 1: {
                // 능력치란
                return ShopFragment.newInstance();
            }
            case 2: {
                return ShopFragment.newInstance();
            }
            default: {
                return ShopFragment.newInstance();
            }
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
