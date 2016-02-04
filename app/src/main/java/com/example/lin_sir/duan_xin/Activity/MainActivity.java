package com.example.lin_sir.duan_xin.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.widget.TableLayout;

import com.example.lin_sir.duan_xin.R;
import com.example.lin_sir.duan_xin.fragment.FestivalCategoryFragment;
import com.example.lin_sir.duan_xin.fragment.SmsHistoryFragment;

import static com.example.lin_sir.duan_xin.R.id.tabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout mtablayout;
    private ViewPager mviewPager;
    private String[] mTitle = new String[]{"节日短信", "发送记录"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mtablayout = (TabLayout) findViewById(tabLayout);
        mviewPager = (ViewPager) findViewById(R.id.view_pager);
        mviewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {

                if (position == 1) return new SmsHistoryFragment();

                return new FestivalCategoryFragment();
            }

            @Override
            public int getCount() {
                return mTitle.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle[position];
            }
        });
        mtablayout.setupWithViewPager(mviewPager);
    }
}







