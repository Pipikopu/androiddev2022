package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeatherAndForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeatherAndForecastFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
        return view;
    }
}