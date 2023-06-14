package com.piash;

public class Doctor extends Manob {
    String qualification ;

    @Override
    void displayInformation(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("qualification: "+qualification);
    }
}
