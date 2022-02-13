package com.company.tech.Vehicles.truck;

import com.company.tech.Vehicles.Vehicles;

public class Truck extends Vehicles {

    private double engineCapacity;
    private double armorStrength;

    public Truck() {
    }

    public Truck(String name, String color, int weight, int speed,
                 int accommodation, double engineCapacity, double armorStrength) {
        super(name, color, weight, speed, accommodation);
        this.engineCapacity = engineCapacity;
        this.armorStrength = armorStrength;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getArmorStrength() {
        return armorStrength;
    }

    public void setArmorStrength(double armorStrength) {
        this.armorStrength = armorStrength;
    }

    @Override
    public String toString() {
        return "Truck{" + "engineCapacity=" + engineCapacity +
                ", armorStrength=" + armorStrength + "} " + super.toString();
    }
}
