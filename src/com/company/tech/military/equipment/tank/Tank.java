package com.company.tech.military.equipment.tank;

import com.company.tech.military.equipment.MilitaryEquipment;

public class Tank extends MilitaryEquipment {

    private double lenthg;
    private byte accommodation;

    public Tank() {

    }

    public Tank(String name, String color, int weight, String brand,
                double caliber, double lenthg, byte accommodation) {
        super(name, color, weight, brand, caliber);
        this.lenthg = lenthg;
        this.accommodation = accommodation;
    }

    public double getLenthg() {
        return lenthg;
    }

    public void setLenthg(double lenthg) {
        this.lenthg = lenthg;
    }

    public byte getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(byte accommodation) {
        this.accommodation = accommodation;
    }

    @Override
    public String toString() {
        return "Tank{" + "lenthg=" + lenthg + ", accommodation="
                + accommodation + "} " + super.toString();
    }
}
