package com.company.tech.military.equipment.gun;

import com.company.tech.military.equipment.MilitaryEquipment;

public class Gun extends MilitaryEquipment {
    private String accommodation;
    private int gunShot;

    public Gun() {
    }

    public Gun(String name, String color, int weight, String brand,
               double caliber, String accommodation, int gunShot) {
        super(name, color, weight, brand, caliber);
        this.accommodation = accommodation;
        this.gunShot = gunShot;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public int getGunShot() {
        return gunShot;
    }

    public void setGunShot(int gunShot) {
        this.gunShot = gunShot;
    }

    @Override
    public String toString() {
        return "Gun{" + "accommodation='" + accommodation + '\'' +
                ", gunShot=" + gunShot + "} " + super.toString();
    }
}
