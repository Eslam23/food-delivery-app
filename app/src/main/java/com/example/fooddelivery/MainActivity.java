package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fooddelivery.adapter.popular_adapter;
import com.example.fooddelivery.adapter.west_adapter;
import com.example.fooddelivery.model.popular;
import com.example.fooddelivery.model.west_food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView poprec ,westrec;
    popular_adapter adapter;
    west_adapter adapter2;
    ArrayList<popular>allfood;
    ArrayList<west_food>allwest_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        poprec = findViewById(R.id.foodrec_id);
        allfood =new ArrayList<>();
        allfood.add(new popular("Float Cake Vietnam","$6.05",R.drawable.popularfood1));
        allfood.add(new popular("Chiken Drumstick", "$17.05", R.drawable.popularfood2));
        allfood.add(new popular("Fish Tikka Stick", "$25.05", R.drawable.popularfood3));
        allfood.add(new popular("Float Cake Vietnam", "$7.05", R.drawable.popularfood1));
        allfood.add(new popular("Chiken Drumstick", "$17.05", R.drawable.popularfood2));
        allfood.add(new popular("Fish Tikka Stick", "$25.05", R.drawable.popularfood3));
        setpopAdapter(allfood);
        westrec =findViewById(R.id.west_food_id);
        allwest_food =new ArrayList<>();

        allwest_food.add(new west_food("Chicago Pizza", "$20",  "4.5", "Briand Restaurant",R.drawable.asiafood1));
        allwest_food.add(new west_food("Straberry Cake", "$25",  "4.2", "Friends Restaurant",R.drawable.asiafood2));
        allwest_food.add(new west_food("Chicago Pizza", "$20",  "4.5", "Briand Restaurant",R.drawable.asiafood1));
        allwest_food.add(new west_food("Straberry Cake", "$25",  "4.2", "Friends Restaurant",R.drawable.asiafood2));
        allwest_food.add(new west_food("Chicago Pizza", "$20",  "4.5", "Briand Restaurant",R.drawable.asiafood1));
        allwest_food.add(new west_food("Straberry Cake", "$25",  "4.2", "Friends Restaurant",R.drawable.asiafood2));
        setwestfoodAdapter(allwest_food);

    }
    public void setpopAdapter(ArrayList<popular>foods)
    {
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        poprec.setLayoutManager(lm);
        adapter =new popular_adapter(foods,this );
        poprec.setAdapter(adapter);
    }
    public void setwestfoodAdapter(ArrayList<west_food>foods)
    {
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        westrec.setLayoutManager(lm);
        adapter2 =new west_adapter(foods,this );
        westrec.setAdapter(adapter2);
    }
}
