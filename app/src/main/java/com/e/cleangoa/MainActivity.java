package com.e.cleangoa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.Menu;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private Toolbar toolbar;
private ViewPager viewPager;
private ViewPagerAdapter adapter;
private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        viewPager=findViewById(R.id.pager);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflator=getMenuInflater();
        inflator.inflate(R.menu.optionusers,menu);
        return true;
    }

}
