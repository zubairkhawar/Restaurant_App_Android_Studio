package com.example.restaurantapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RestaurantAdapter adapter;
    private ArrayList<Restaurant> restaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize your restaurant list
        restaurantList = new ArrayList<>();
        // Populate your restaurant list here, possibly from a database
        restaurantList.add(new Restaurant("Bundu Khan", "Gulberg", "1234567890", "Description A"));
        restaurantList.add(new Restaurant("KFC", "DHA PHASE 5", "0987654321", "Description B"));
        restaurantList.add(new Restaurant("Mcdonalds", "DHA Phase 8", "5678901234", "Description C"));
        restaurantList.add(new Restaurant("Subway", "Askari 10", "1234567890", "Description A"));
        restaurantList.add(new Restaurant("Hardees", "DHA Phase 6", "0987654321", "Description B"));
        restaurantList.add(new Restaurant("Gloria Jeans", "Askari 11", "5678901234", "Description C"));
        restaurantList.add(new Restaurant("Wasabi", "DHA Y Block", "1234567890", "Description A"));
        restaurantList.add(new Restaurant("OD", "DHA Phase 3", "0987654321", "Description B"));
        restaurantList.add(new Restaurant("OPTP", "Girja Chowk", "5678901234", "Description C"));
        restaurantList.add(new Restaurant("Bundu Khan", "Gulberg", "1234567890", "Description A"));
        restaurantList.add(new Restaurant("KFC", "DHA PHASE 5", "0987654321", "Description B"));
        restaurantList.add(new Restaurant("Mcdonalds", "DHA Phase 8", "5678901234", "Description C"));
        restaurantList.add(new Restaurant("Subway", "Askari 10", "1234567890", "Description A"));
        restaurantList.add(new Restaurant("Hardees", "DHA Phase 6", "0987654321", "Description B"));
        restaurantList.add(new Restaurant("Gloria Jeans", "Askari 11", "5678901234", "Description C"));
        restaurantList.add(new Restaurant("Wasabi", "DHA Y Block", "1234567890", "Description A"));
        restaurantList.add(new Restaurant("OD", "DHA Phase 3", "0987654321", "Description B"));
        restaurantList.add(new Restaurant("OPTP", "Girja Chowk", "5678901234", "Description C"));

        adapter = new RestaurantAdapter(this, restaurantList);
        recyclerView.setAdapter(adapter);

        recyclerView.setVisibility(View.VISIBLE);
    }
}
