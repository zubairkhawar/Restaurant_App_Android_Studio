package com.example.restaurantapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextName, editTextLocation, editTextPhone, editTextDescription;
    private Button buttonSubmit;
    private ArrayList<Restaurant> restaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextName = findViewById(R.id.editTextName);
        editTextLocation = findViewById(R.id.editTextLocation);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextDescription = findViewById(R.id.editTextDescription);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        restaurantList = new ArrayList<>();

        Intent intent = getIntent();
        final int imageResourceId = intent.getIntExtra("imageResourceId", 0);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                String location = editTextLocation.getText().toString().trim();
                String phone = editTextPhone.getText().toString().trim();
                String description = editTextDescription.getText().toString().trim();

                Restaurant restaurant = new Restaurant(name, location, phone, description, imageResourceId);
                restaurantList.add(restaurant);

                finish();
            }
        });
    }
}
