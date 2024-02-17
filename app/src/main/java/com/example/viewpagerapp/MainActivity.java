package com.example.viewpagerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    MyViewPagerAdapter myViewPagerAdapter;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        myViewPagerAdapter = new MyViewPagerAdapter(
                getSupportFragmentManager(),
                getLifecycle()
        );

        myViewPagerAdapter.addFragment(new FirstFragment());
        myViewPagerAdapter.addFragment(new SecondFragment());
        myViewPagerAdapter.addFragment(new ThirdFragment());

        viewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        viewPager.setAdapter(myViewPagerAdapter);

        new TabLayoutMediator(
                tabLayout,
                viewPager,
                (tab,position)-> {
                    tab.setText("Fragment"+(position+1));
                }
        ).attach();
    }
}