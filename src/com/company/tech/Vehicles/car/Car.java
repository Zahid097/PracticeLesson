package com.company.tech.Vehicles.car;

import com.company.tech.Vehicles.Vehicles;

public class Car extends Vehicles {
    private String body;
    private String company;

    public Car() {

    }

    public Car(String name, String color, int weight, int speed,
               int accommodation, String body, String company) {
        super(name, color, weight, speed, accommodation);
        this.body = body;
        this.company = company;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car{" + "body='" + body + '\'' + ", company='"
                + company + '\'' + "} " + super.toString();
    }
}
