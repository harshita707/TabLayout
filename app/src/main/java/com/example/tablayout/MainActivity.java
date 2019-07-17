package com.example.tablayout;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private AppBarLayout appbarlayout;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout=(TabLayout)findViewById(R.id.tabs);
        appbarlayout=(AppBarLayout)findViewById(R.id.appbar);
        viewpager=(ViewPager)findViewById(R.id.viewpager);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new first_frag(),"first frag");
        adapter.AddFragment(new sec_frag(),"second frag");
        adapter.AddFragment(new third_frag(),"third frag");
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);
    }
}