package com.company.tech.Appliances;

import com.company.tech.Tech;

public class Appliances extends Tech {

    private String temperature;
    private int price;

    public Appliances() {

    }

    public Appliances(String name, String color, int weight, String temperature, int price) {
        super(name, color, weight);
        this.temperature = temperature;
        this.price = price;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Appliances{" + "temperature='" + temperature + '\'' +
                ", price=" + price + "} " + super.toString();
    }
}