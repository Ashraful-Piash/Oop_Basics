package com.piash;

public class Teacher {
    String name;
    String gender;
    int phoneNumber;

    //Method
     /* void setInformation(String n, String m, int ph){
        name= n;
        gender = m;
        phoneNumber = ph;
    } */
    //Constructor

    Teacher(String n, String g, int pn){
        name = n;
        gender = g;
        phoneNumber = pn;

    }


    void displayInformation(){
        System.out.println("name: " +name);
        System.out.println("gender: "+gender);
        System.out.println("phone: "+phoneNumber);
    }
}
