package com.example.hm5viewpager.ui.fragments.exchangefragment;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.hm5viewpager.R;
import java.util.ArrayList;

public class ExchangeFragmentRecyclerViewAdapter extends RecyclerView.Adapter<ExchangeFragmentRecyclerViewAdapter.ViewHolder> {

    ArrayList<ExchangeModel> list = new ArrayList<>();

    public void setList(ArrayList<ExchangeModel> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ExchangeFragmentRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.exchange_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ExchangeFragmentRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position).getImage(), list.get(position).getCoin(), list.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView coinTextView, priceTextview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.coin_iv);
            coinTextView = itemView.findViewById(R.id.coin_tv);
            priceTextview = itemView.findViewById(R.id.price_tv);
        }

        @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n"}) // TODO: 8/29/2021 Спросить у препода!! 
        public void onBind(int image, String coin, double price) {

            imageView.setImageDrawable(itemView.getResources().getDrawable(image));
            priceTextview.setText("USD " + String.valueOf(price));
            coinTextView.setText(coin);
        }
    }
}
