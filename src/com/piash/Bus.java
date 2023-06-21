package com.piash;

public class Bus extends Vehicle {
    int gear;

    Bus(String name, String color, Double weight, int gear) {
        super(name, color, weight);
        this.gear = gear;
    }

    @Override
    void displayAttribute() {
        super.displayAttribute();
        System.out.println("Gear: " + gear);
        System.out.println("ok");
        System.out.println("Need to be consistent");
        System.out.println("Allah , please forgive me and guide me to the right path");
    }

}
