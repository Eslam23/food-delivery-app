package com.example.fooddelivery.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.R;
import com.example.fooddelivery.food_details;
import com.example.fooddelivery.model.popular;

import java.util.ArrayList;

public class popular_adapter extends RecyclerView.Adapter<popular_adapter.popular_viewHolder> {
 ArrayList <popular> list ;
 Context context;

    public popular_adapter(ArrayList<popular> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public popular_viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.food_layout,parent,false);
        return new popular_viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final popular_viewHolder holder, final int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.price.setText(list.get(position).getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, food_details.class);
                i.putExtra("name",list.get(position).getName());
                i.putExtra("price",list.get(position).getPrice());
                i.putExtra("image",list.get(position).getImage());
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class popular_viewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name,price;
        public popular_viewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.food_image);
            name =itemView.findViewById(R.id.name);
            price =itemView.findViewById(R.id.price);

        }
    }
}
