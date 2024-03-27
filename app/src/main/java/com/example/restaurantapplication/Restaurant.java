package com.example.restaurantapplication;

public class Restaurant {
    private String name;
    private String location;
    private String phone;
    private String description;
    private int imageResourceId;

    public Restaurant(String name, String location, String phone, String description, int imageResourceId) {
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
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
    public int getImageResourceId() {
        return imageResourceId;
    }

}
