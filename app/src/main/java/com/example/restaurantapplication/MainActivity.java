package com.example.restaurantapplication;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button buttonAddRestaurant;
    private RecyclerView recyclerView;
    private RestaurantAdapter adapter;
    private ArrayList<Restaurant> restaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddRestaurant = findViewById(R.id.buttonAddRestaurant);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        restaurantList = new ArrayList<>();

        restaurantList.add(new Restaurant("Bundu Khan", "Gulberg", "1234567890", "Description A", R.drawable.image1));
        restaurantList.add(new Restaurant("KFC", "DHA PHASE 5", "0987654321", "Description B", R.drawable.image2));
        restaurantList.add(new Restaurant("Mcdonalds", "DHA Phase 8", "5678901234", "Description C", R.drawable.image3));
        restaurantList.add(new Restaurant("Subway", "Askari 10", "1234567890", "Description A", R.drawable.image4));
        restaurantList.add(new Restaurant("Hardees", "DHA Phase 6", "0987654321", "Description B", R.drawable.image5));
        restaurantList.add(new Restaurant("Gloria Jeans", "Askari 11", "5678901234", "Description C", R.drawable.image6));
        restaurantList.add(new Restaurant("Wasabi", "DHA Y Block", "1234567890", "Description A", R.drawable.image2));
        restaurantList.add(new Restaurant("OD", "DHA Phase 3", "0987654321", "Description B", R.drawable.image3));
        restaurantList.add(new Restaurant("OPTP", "Girja Chowk", "5678901234", "Description C", R.drawable.image5));
        restaurantList.add(new Restaurant("Bundu Khan", "Gulberg", "1234567890", "Description A", R.drawable.image2));
        restaurantList.add(new Restaurant("KFC", "DHA PHASE 5", "0987654321", "Description B", R.drawable.image4));
        restaurantList.add(new Restaurant("Mcdonalds", "DHA Phase 8", "5678901234", "Description C", R.drawable.image5));
        restaurantList.add(new Restaurant("Subway", "Askari 10", "1234567890", "Description A", R.drawable.image1));
        restaurantList.add(new Restaurant("Hardees", "DHA Phase 6", "0987654321", "Description B", R.drawable.image2));

        adapter = new RestaurantAdapter(this, restaurantList);
        recyclerView.setAdapter(adapter);

        recyclerView.setVisibility(View.VISIBLE);

        buttonAddRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
