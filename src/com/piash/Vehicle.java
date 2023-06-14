package com.piash;

public class Vehicle {
    String name;
    String color;
    double weight;

    Vehicle(String name, String color, double weight){
        this.name = name;
        this.color= color;
        this.weight = weight;
    }

    void displayAttribute(){
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    }

}
