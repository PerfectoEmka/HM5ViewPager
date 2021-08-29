package com.example.hm5viewpager.ui.fragments.exchangefragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hm5viewpager.R;

import java.util.ArrayList;

public class ExchangeFragment extends Fragment {

    private ArrayList<ExchangeModel> list;
    private RecyclerView recyclerView;
    private ExchangeFragmentRecyclerViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_exchange, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        createItemList();
        initRecyclerView(view);
    }

    private void createItemList() {
        list = new ArrayList<>();
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.x_coin, 40.00, "X - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.x_coin, 40.00, "X - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.x_coin, 40.00, "X - coin"));
        list.add(new ExchangeModel(R.drawable.x_coin, 40.00, "X - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.v_coin, 1.00, "V - coin"));
        list.add(new ExchangeModel(R.drawable.x_coin, 40.00, "X - coin"));
        list.add(new ExchangeModel(R.drawable.x_coin, 40.00, "X - coin"));


    }

    private void initRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.exchange_rv);
        adapter = new ExchangeFragmentRecyclerViewAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }

}