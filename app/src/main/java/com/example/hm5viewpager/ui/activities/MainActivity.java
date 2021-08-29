package com.example.hm5viewpager.ui.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.hm5viewpager.R;
import com.example.hm5viewpager.ui.fragments.datetimefragment.DateTimeFragment;
import com.example.hm5viewpager.ui.fragments.exchangefragment.ExchangeFragment;
import com.example.hm5viewpager.ui.fragments.morefragment.MoreFragment;
import com.example.hm5viewpager.ui.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] tabLayoutTitles = {"Exchange", "DateTime", "More"};
    private ArrayList<Fragment> exchangeFragmentsList;
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        createFragmentList();
        initViewPager();
    }
    private void initViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        adapter.setList(exchangeFragmentsList);
        viewPager2.setAdapter(adapter);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(tabLayoutTitles[position]);
            }
        }).attach();

    }

    private void createFragmentList() {
        exchangeFragmentsList = new ArrayList<>();
        exchangeFragmentsList.add(new ExchangeFragment());
        exchangeFragmentsList.add(new DateTimeFragment());
        exchangeFragmentsList.add(new MoreFragment());
    }

    private void initViews() {
        viewPager2 = findViewById(R.id.view_pager2);
        tabLayout = findViewById(R.id.tab_layout);
    }
}