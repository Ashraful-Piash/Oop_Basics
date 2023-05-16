package com.piash;

public class StaticVariable {
    String name;
    int rollNo;
    static String university = "Cuet";
    static String place = "Chittagong";

    StaticVariable(String n, int r){
        name = n;
        rollNo= r;
    }
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("rollNo: "+rollNo);
        System.out.println("UniversitY:"+university);
    }
}
