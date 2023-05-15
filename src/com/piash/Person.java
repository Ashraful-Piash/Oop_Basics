package com.piash;

public class Person {
    String name;
    String address;
    int age;

    Person(){
        System.out.println("No information");
    }
    Person(String n, int a){
        name = n;
        age = a;
    }
    Person(String n, String ad, int a){
        name = n;
        address = ad;
        age = a;
    }
    void displayInformation(){
        System.out.println("Name is "+name);
        System.out.println("Address is "+address);
        System.out.println("age is : "+age);
        System.out.println("\n\n");
    }
}
