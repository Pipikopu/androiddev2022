package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.PagerAdapter;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        PagerAdapter adapter = new WeatherFragmentPagerAdapter(
                getSupportFragmentManager());

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "onDestroy");
    }
}