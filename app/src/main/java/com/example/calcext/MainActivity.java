package com.example.calcext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView simple,search,age;
    ViewPager viewPager;
    PageViewAdepter pageViewAdepter;

    DatabaseHelper myDb;
    //myDb=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simple=(TextView)findViewById(R.id.simple);
        age=(TextView)findViewById(R.id.age);
        search=(TextView)findViewById(R.id.search);
        viewPager=(ViewPager)findViewById(R.id.fragment_container);
        myDb = new DatabaseHelper(this);
        pageViewAdepter=new PageViewAdepter(getSupportFragmentManager());
        viewPager.setAdapter(pageViewAdepter);

        simple.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                viewPager.setCurrentItem(0);
            }
        });

        age.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                viewPager.setCurrentItem(1);
            }
        });


        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                viewPager.setCurrentItem(2);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                
            }

            @Override
            public void onPageSelected(int position) {
                onChangeTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void onChangeTab(int position) {
        if(position == 0)
        {
           simple.setTextSize(25);
           //simple.setTextColor(getColor(R.color.bright));

           age.setTextSize(20);
           //age.setTextColor(getColor(R.color.light));

           search.setTextSize(20);
           //search.setTextColor(getColor(R.color.light));
        }

        if(position == 1)
        {
            simple.setTextSize(20);
            //simple.setTextColor(getColor(R.color.bright));

            age.setTextSize(25);
            //age.setTextColor(getColor(R.color.light));

            search.setTextSize(20);
            //search.setTextColor(getColor(R.color.light));
        }

        if(position == 2)
        {
            simple.setTextSize(20);
            //simple.setTextColor(getColor(R.color.bright));

            age.setTextSize(20);
            //age.setTextColor(getColor(R.color.light));

            search.setTextSize(25);
            //search.setTextColor(getColor(R.color.light));
        }
    }
}
