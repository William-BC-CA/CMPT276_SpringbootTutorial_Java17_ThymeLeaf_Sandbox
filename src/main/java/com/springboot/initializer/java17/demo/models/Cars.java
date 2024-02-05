package com.springboot.initializer.java17.demo.models;

public class Cars {
    private String manufacturer;
    private String model;
    private int year;
    private String engine;
    private String engineName;
    private String color;
    private int price;
    private int mileage;
    private String condition;
    
    public Cars() {
    }

    public Cars(String manufacturer, String model, int year, String engine, String engineName, String color, int price,
            int mileage, String condition) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.engineName = engineName;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.condition = condition;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    
}
