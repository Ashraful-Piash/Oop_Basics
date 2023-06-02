package com.piash;

public class Flower {
    String name;
    String color;
    String smell;
    static String kingOfFlower = "Rose";

    Flower(String name, String color, String smell){
        this.name = name;
        this.color= color;
        this.smell = smell;

        }
    void displayInformation(){
        System.out.println("My favourite flower is "+name + " It's color is " +color + "It smells"+smell);

    }
}
