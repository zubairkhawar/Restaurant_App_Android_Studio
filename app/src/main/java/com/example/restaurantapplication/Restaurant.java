package com.example.restaurantapplication;

public class Restaurant {
    private String name;
    private String location;
    private String phone;
    private String description;

    public Restaurant(String name, String location, String phone, String description) {
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.description = description;
    }

    // Getter methods for each field
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }
}
