package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class food_details extends AppCompatActivity {
ImageView back ,food_image,plus,minus ;
TextView price ,name ,quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
        back =findViewById(R.id.back_id);
        food_image =findViewById(R.id.food_image_id);
        price =findViewById(R.id.pricefood_id);
        name =findViewById(R.id.foodname_id);
        plus =findViewById(R.id.plus_id);
        minus =findViewById(R.id.minus_id);
        quantity =findViewById(R.id.quantity_id);
        Intent intent =getIntent();
        food_image.setImageResource(intent.getIntExtra("image",R.drawable.asiafood2));
        price.setText(intent.getStringExtra("price"));
        name.setText(intent.getStringExtra("name"));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(food_details.this,MainActivity.class);
                startActivity(i);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qunt =Integer.parseInt(quantity.getText().toString());
                int temp =qunt+1;
                quantity.setText(String.valueOf(temp));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qunt =Integer.parseInt(quantity.getText().toString());
                if(qunt!=1){
                    int temp =qunt-1;
                    quantity.setText(String.valueOf(temp));
                }

            }
        });

    }
}
