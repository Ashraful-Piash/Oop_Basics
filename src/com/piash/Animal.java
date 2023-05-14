package com.piash;

public class Animal {
    String name;
    String species;
    String region;
    int price;

    Animal(String n, String s, String r, int p){
        name = n;
        species = s;
        region = r;
        price = p;

    }

    void getInfromation(){
        System.out.println("name: "+name);
        System.out.println("Species: "+species);
        System.out.println("Region: "+region);
        System.out.println("Price:"+price);
    }
}


