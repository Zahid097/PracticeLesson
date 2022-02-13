package com.company.tech.Appliances.washingMachine;

import com.company.tech.Appliances.Appliances;

public class WashingMachine extends Appliances {
    private double washVolume;
    private String size;

    public WashingMachine() {

    }

    public WashingMachine(String name, String color, int weight,
                          String temperature, int price, double washVolume, String size) {
        super(name, color, weight, temperature, price);
        this.washVolume = washVolume;
        this.size = size;
    }

    public double getWashVolume() {
        return washVolume;
    }

    public void setWashVolume(double washVolume) {
        this.washVolume = washVolume;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "WashingMachine{" + "washVolume=" + washVolume +
                ", size='" + size + '\'' + "} " + super.toString();
    }
}
