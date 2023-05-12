package com.piash;

public class Fruit {
    String name;
    String season;
    int price;

   /* void setInformation(String n, String s, int p){
        name =n;
        season = s;
        price = p;

    } */
    //constructor
    Fruit(String n, String s, int p){
        name = n;
        season = s;
        price =p;

    }

    void getInformation(){
        System.out.println("Name : " +name);
        System.out.println("Season: " +season);
        System.out.println("Price per Kg: " +price);

    }
}
