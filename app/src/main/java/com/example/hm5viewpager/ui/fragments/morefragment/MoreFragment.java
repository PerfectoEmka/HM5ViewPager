package com.example.hm5viewpager.ui.fragments.morefragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import com.example.hm5viewpager.R;

public class MoreFragment extends Fragment {

    private Switch aSwitch;
    private FirstFragment firstFragment = new FirstFragment();
    private SecondFragment secondFragment = new SecondFragment();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_more, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
        initFragment();
        initListener();
    }

    private void initFragment() {
        getFragmentManager().beginTransaction().add(R.id.fragmentContainer_fl, firstFragment).commit();
    }

    private void initListener() {
        aSwitch.setOnClickListener(view -> {
            if (aSwitch.isChecked()){
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_fl, firstFragment).commit();
            } else {
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_fl, secondFragment).commit();
            }
        });
    }

    private void initViews(View view) {
        aSwitch = view.findViewById(R.id.switchFragment_s);
    }
}