package com.e.cleangoa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private Toolbar toolbar;
private ViewPager viewPager;
//private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
private MenuItem item;
public Button _btnevent,_btnsegre,_btnkyw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btnevent=(Button)findViewById(R.id.event);
        _btnkyw=(Button)findViewById(R.id.kyw);


        _btnevent.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                startActivity(new Intent(MainActivity.this, events.class));
            }

        });

        _btnkyw.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                startActivity(new Intent(MainActivity.this, awareness.class));
            }

        });

        toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


    }

public boolean onOptionsItemSelected(MenuItem item)
{
    switch(item.getItemId())
    {
    case R.id.item0:
    {startActivity(new Intent(this, login.class));
        return true;}
    case R.id.item1:
    {  startActivity(new Intent(this, login.class));
        return true;}
    case R.id.item2:
    {  startActivity(new Intent(this, termsandconditions.class));
        return true;}
    case R.id.item3:
    {startActivity(new Intent(this, registration.class));
        return true;}
    default:
    {  return super.onOptionsItemSelected(item);}
}
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflator=getMenuInflater();
        inflator.inflate(R.menu.optionusers,menu);
        return true;
    }

}
