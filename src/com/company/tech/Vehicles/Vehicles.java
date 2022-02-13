package com.company.tech.Vehicles;

import com.company.tech.Tech;

public class Vehicles extends Tech {
    private int speed;
    private int accommodation;

    public Vehicles() {

    }

    public Vehicles(String name, String color, int weight, int speed, int accommodation) {
        super(name, color, weight);
        this.speed = speed;
        this.accommodation = accommodation;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(int accommodation) {
        this.accommodation = accommodation;
    }

    @Override
    public String toString() {
        return "Vehicles{" + "speed=" + speed + ", accommodation="
                + accommodation + "} " + super.toString();
    }
}
