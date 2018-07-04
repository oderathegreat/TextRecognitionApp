package com.chat.app.barikibinti.model;

/**
 * Created by Hp on 6/11/2018.
 */

public class Restaurant {

     private String name;
     private String address;
     private int distance;
     private String rating;
     private String cost;
     private String imageUrl;
     private String currency;
     private double longitude;
     private double latitude;


    public Restaurant() {
    }


    public Restaurant(String name, int distance, String address, String rating, String cost, String imageUrl, String currency, double longitude, double latitude) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.cost = cost;
        this.imageUrl = imageUrl;
        this.currency = currency;
        this.longitude = longitude;
        this.latitude = latitude;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }



    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
