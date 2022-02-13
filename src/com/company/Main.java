package com.company;

import com.company.tech.Appliances.Appliances;
import com.company.tech.Appliances.fridge.Fridge;
import com.company.tech.Appliances.washingMachine.WashingMachine;
import com.company.tech.Tech;
import com.company.tech.Vehicles.Vehicles;
import com.company.tech.Vehicles.car.Car;
import com.company.tech.Vehicles.truck.Truck;
import com.company.tech.military.equipment.MilitaryEquipment;
import com.company.tech.military.equipment.gun.Gun;
import com.company.tech.military.equipment.tank.Tank;

public class Main {

    public static void main(String[] args) {

        Tech tech = new Tech("Technology", "Other", 999000);
        System.out.println(tech.toString());
        Appliances appliances = new Appliances(
                "HouseHold", "Other", 75,
                "До 90 градусов", 3000);
        System.out.println(appliances.toString());

        Fridge fridge = new Fridge("Beko", "White", 150,
                "Максимальная +20, максимальная -20",
                75000, "3 фазная", 3);
        System.out.println(fridge.toString());

        WashingMachine washingMachine = new WashingMachine(
                "Samsung", "black", 55, "Максимум 90 градусов",
                35000, 7.5, "1.20 - 60/50");
        System.out.println(washingMachine.toString());
        System.out.println();

        Vehicles vehicles = new Vehicles("Bus", "Black",
                5000, 240, 45);
        System.out.println(vehicles.toString());

        Car car = new Car("AUDI Q8", "grown", 3, 380,
                5, "Sport car", "Audi");
        System.out.println(car.toString());

        Truck truck = new Truck("Btr- 15", "Green", 2,
                240, 3, 45.50, 16.15);
        System.out.println(truck.toString());
        System.out.println();

        MilitaryEquipment militaryEquipment = new MilitaryEquipment("From KG",
                "war", 20000, "In Amerika", 76.13);
        System.out.println(militaryEquipment.toString());

        Tank tank = new Tank("T-34", "Millitary color",
                40, "T34 - B", 13.16, 4.7, (byte) 3);
        System.out.println(tank.toString());

        Gun gun = new Gun("Makarov", "Black", 700, "Makarov TOZ-24",
                17.9, " По нарезам 9,27 ±0,075", 30);
        System.out.println(gun.toString());

    }
}
