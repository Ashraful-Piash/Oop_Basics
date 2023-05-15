package com.piash;

public class Car {
    String name;
    String color;
    int price;

    Car(String n, String c, int p){
        name = n;
        color = c;
        price = p;
    }

    Car(){
        System.out.println("No value for this car constructor");
    }

   /* void setInformation(String n, String c, int p){
        name = n;
        color= c;
        price = p;

    } */

    void getInformation(){
        System.out.println("Car name is: "+name);
        System.out.println("Car color is: "+color);
        System.out.println("Car price in $ is: "+price +" $ ");
        System.out.println("\n\n");
    }

}
