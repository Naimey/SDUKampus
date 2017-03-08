package com.example.zulkuf.sdukampus;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by YunusEmre on 7.3.2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    int mNumofTabs;

    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumofTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                MainMenuFragment tab1 = new MainMenuFragment();
                return tab1;

            case 1:
                BusFragment tab2 = new BusFragment();
                return tab2;

            case 2:
                RefectoryFragment tab3 = new RefectoryFragment();
                return tab3;

            case 3:
                PoolFragment tab4 = new PoolFragment();
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumofTabs;
    }
}


