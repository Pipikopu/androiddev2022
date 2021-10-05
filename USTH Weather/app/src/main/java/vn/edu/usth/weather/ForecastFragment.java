package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // view = inflater.inflate(R.layout.fragment_forecast, container, false);
        // view.setBackgroundColor(Color.parseColor("#20FF0000"));
        //
        // return view;
        LinearLayout ll = new LinearLayout(getActivity());
        ll.setBackgroundColor(Color.parseColor("#20FF0000"));
        ll.setOrientation(LinearLayout.VERTICAL);

        TextView thursday = new TextView(getActivity());
        thursday.setText("Thursday is Sunny");
        ImageView sunny = new ImageView(getActivity());
        sunny.setImageResource(R.drawable.sunny);

        ll.addView(thursday);
        ll.addView(sunny);

        TextView friday = new TextView(getActivity());
        friday.setText("Friday is Rainy");
        ImageView rainy = new ImageView(getActivity());
        rainy.setImageResource(R.drawable.rain);

        ll.addView(friday);
        ll.addView(rainy);

        return ll;
    }
}