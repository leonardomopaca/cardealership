package com.car_dealership.model;

public class Vehicle {
    private String type;
    private String brand;
    private String model;
    private int year;
    private double value;

    public Vehicle(String type, String brand, String model, int year, double value) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
