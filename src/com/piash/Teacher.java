package com.piash;

public class Teacher {
    String name;
    String gender;
    int phoneNumber;

    void setInformation(String n, String m, int ph){
        name= n;
        gender = m;
        phoneNumber = ph;
    }

    void displayInformation(){
        System.out.println("name: " +name);
        System.out.println("gender: "+gender);
        System.out.println("phone: "+phoneNumber);
    }
}
