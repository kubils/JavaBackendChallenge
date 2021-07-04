package com.company;

public class Notebook extends Brand{

    private double price;
    private double discount;
    private int count;
    private String model;
    private int memory;
    private int diskCapacity;
    private double screenSize;

    public Notebook(int id, String name, double price, double discount, int count, String model, int memory, int diskCapacity, double screenSize) {
        super(id, name);
        this.price = price;
        this.discount = discount;
        this.count = count;
        this.model = model;
        this.memory = memory;
        this.diskCapacity = diskCapacity;
        this.screenSize = screenSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(int diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
