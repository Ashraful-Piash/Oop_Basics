package com.piash;

public class TeacherOne {

    String name, gender, village;
    int age, phoneNumber;
    static String universityName = "CUET";


    TeacherOne(){
        System.out.println("No value");
    }

    TeacherOne(String n, String g, String v){
        name = n;
        gender= g;
        village=v;
    }

    TeacherOne(String n, String g, String v, int a, int ph){
        name = n;
        gender = g;
        village = v;
        age = a;
        phoneNumber = ph;
    }

    void displayInformation(){
        System.out.println("This is a non static method");
    }

    static void displayInformation2(){
        System.out.println("This is a static method");

    }




    void getInformation(){
        System.out.println("Name is"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Village:"+village);
        System.out.println("Age:"+age);
        System.out.println("PhoneNumber:"+phoneNumber);
        System.out.println("University:"+universityName);
        System.out.println("\n");

    }
}
