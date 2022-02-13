package com.company.tech.military.equipment;

import com.company.tech.Tech;

public class MilitaryEquipment extends Tech {
    private String brand;
    private double caliber;

    public MilitaryEquipment() {

    }

    public MilitaryEquipment(String name, String color, int weight, String brand, double caliber) {
        super(name, color, weight);
        this.brand = brand;
        this.caliber = caliber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    @Override
    public String toString() {
        return "MilitaryEquipment{" + "brand='" + brand + '\'' +
                ", caliber=" + caliber + "} " + super.toString();
    }
}
