package com.piash;

public class TestFruit {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        fruit1.name = "Mango";
        fruit1.season= "summer";
        fruit1.price = 190;

        System.out.println("Name : " +fruit1.name);
        System.out.println("Season: " +fruit1.season);
        System.out.println("Price per Kg: " +fruit1.price);
    }
}
