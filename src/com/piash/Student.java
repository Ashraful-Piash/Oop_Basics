package com.piash;

public class Student {
    String name;
    int rollNo;

    Student(String n, int r){
        name = n;
        rollNo= r;
    }
    void display(){
        System.out.println("Name: " +name);
        System.out.println("RollNo: " +rollNo);
    }


}
