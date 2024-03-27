package com.example.restaurantapplication;

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

        // Initialize your restaurant list
        restaurantList = new ArrayList<>();

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get data from EditText fields
                String name = editTextName.getText().toString().trim();
                String location = editTextLocation.getText().toString().trim();
                String phone = editTextPhone.getText().toString().trim();
                String description = editTextDescription.getText().toString().trim();

                // Create a new restaurant object and add it to the list
                Restaurant restaurant = new Restaurant(name, location, phone, description);
                restaurantList.add(restaurant);

                // Optionally, you can save the restaurant data to a database here

                // Finish this activity to go back to the main activity
                finish();
            }
        });
    }
}
