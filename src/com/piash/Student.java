package com.piash;

public class Student {
    String name;
    int rollNo;
    String section;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo= rollNo;
    }
    Student(String name, int rollNo, String section){
        this(name, rollNo);
        this.section = section;
    }
    void display(){
        this.message();
        System.out.println("Name: " +name);
        System.out.println("RollNo: " +rollNo);
        System.out.println("Section: " +section);
    }
    void message(){
        System.out.println("I am message method");
    }



}
