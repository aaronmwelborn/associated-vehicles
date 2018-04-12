package com.example.associatedvehicles.entity;

public class Vehicle {
    private String vin;
    private String year;
    private String make;
    private String model;
    private String imageUrl;

    public Vehicle() {
    }

    public Vehicle(String vin, String year, String make, String model, String imageUrl) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.imageUrl = imageUrl;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
