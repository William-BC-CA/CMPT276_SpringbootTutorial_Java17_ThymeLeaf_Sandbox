package com.springboot.initializer.java17.demo.models;

public class Bus {
    private String manufacturer;
    private String model;
    private int year;
    private String engine;
    private String transmission;
    private int price;
    private String line;
    private boolean isArticulated;
    private int capacity;
    private boolean isElectric;
    private boolean isHybrid;

    public Bus() {
    }

    public Bus(String manufacturer, String model, int year, String engine, String transmission, int price, String line,
            boolean isArticulated, int capacity, boolean isElectric, boolean isHybrid) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
        this.price = price;
        this.line = line;
        this.isArticulated = isArticulated;
        this.capacity = capacity;
        this.isElectric = isElectric;
        this.isHybrid = isHybrid;
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

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public boolean isArticulated() {
        return isArticulated;
    }

    public void setArticulated(boolean isArticulated) {
        this.isArticulated = isArticulated;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public void setHybrid(boolean isHybrid) {
        this.isHybrid = isHybrid;
    }

    
}
