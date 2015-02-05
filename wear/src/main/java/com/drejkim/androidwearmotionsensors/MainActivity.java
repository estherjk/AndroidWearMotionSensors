package com.drejkim.androidwearmotionsensors;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.DotsPageIndicator;
import android.support.wearable.view.GridViewPager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final GridViewPager pager = (GridViewPager) findViewById(R.id.pager);
        pager.setAdapter(new SensorFragmentPagerAdapter(getFragmentManager()));

        DotsPageIndicator indicator = (DotsPageIndicator) findViewById(R.id.page_indicator);
        indicator.setPager(pager);
    }
}