package com.piash;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Dog","hybrid","Asia",1000);
        animal1.getInfromation();

        Animal animal2 = new Animal("Cat","Desi", "Bangaldesh", 300 );
        animal2.getInfromation();

        Animal animal3 = new Animal();
        animal3.getInfromation();;

    }
}
