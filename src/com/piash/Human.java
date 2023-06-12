package com.piash;

public class Human {
    String name;
    int age;
   static int count= 0;
    static String category = "Mammals";

    Human(String name, int age){
        this.name = name;
        this.age = age;
        count++;
    }

    void displayInformation(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Category is:"+category);
        System.out.println("Total Human object is:"+count);
        System.out.println("\n");
    }
    static void displayInformation2(){
        System.out.println("This is a static method. That is why there is no need to create an object to call this method");
    }
}
