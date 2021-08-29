package com.example.hm5viewpager.ui.fragments.datetimefragment;

import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hm5viewpager.R;

import java.util.Calendar;

public class DateTimeFragment extends Fragment {

    private TextView dateTime_tv, city_tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_date_time, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
        setContent(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.N) // TODO: 8/29/2021 спросить у препода!! 
    private void setContent(View view) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm, dd-MMMM-yyyy");
        String date = sdf.format(Calendar.getInstance().getTime());
        dateTime_tv.setText(date);

        city_tv.setText("Bishkek");
    }

    private void initViews(View view) {
        dateTime_tv = view.findViewById(R.id.date_time_tv);
        city_tv = view.findViewById(R.id.city_tv);
    }
}