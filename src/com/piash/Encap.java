package com.piash;

public class Encap {
     private String name;
     private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        this.age = age;
    }

    void displayInformation(){
         System.out.println("Name:" +name);
         System.out.println("age: "+age);

    }
}
