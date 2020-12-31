package com.example.fooddelivery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.R;
import com.example.fooddelivery.model.west_food;

import java.util.ArrayList;
    public class west_adapter extends RecyclerView.Adapter<west_adapter.west_food_viewHolder> {
        ArrayList<west_food> list ;
        Context context;

        public west_adapter(ArrayList<west_food> list, Context context) {
            this.list = list;
            this.context = context;
        }

        @NonNull
        @Override
        public west_food_viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(context).inflate(R.layout.west_food_layout,parent,false);
            return new west_food_viewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull west_food_viewHolder holder, int position) {
            holder.image.setImageResource(list.get(position).getImage());
            holder.name.setText(list.get(position).getName());
            holder.price.setText(list.get(position).getPrice());
            holder.res_name.setText(list.get(position).getRes_name());
            holder.rate.setText(list.get(position).getRate());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public static class west_food_viewHolder extends RecyclerView.ViewHolder {
            ImageView image;
            TextView name,price,rate,res_name;
            public west_food_viewHolder(@NonNull View itemView) {
                super(itemView);
                image = itemView.findViewById(R.id.food_image);
                name =itemView.findViewById(R.id.name);
                price =itemView.findViewById(R.id.price);
                res_name =itemView.findViewById(R.id.restorant_name);
                rate =itemView.findViewById(R.id.rating);

            }
        }
    }


