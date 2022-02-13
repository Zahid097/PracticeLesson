package com.company.tech.Appliances.fridge;

import com.company.tech.Appliances.Appliances;

public class Fridge extends Appliances {
    private String motorVolume;
    private int camera;

    public Fridge() {

    }

    public Fridge(String name, String color, int weight,
                  String temperature, int price, String motorVolume, int camera) {
        super(name, color, weight, temperature, price);
        this.motorVolume = motorVolume;
        this.camera = camera;
    }

    public String getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(String motorVolume) {
        this.motorVolume = motorVolume;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Fridge{" + "motorVolume='" + motorVolume + '\'' +
                ", camera=" + camera + "} " + super.toString();
    }
}
