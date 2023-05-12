package com.piash;

public class TestFruit {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        fruit1.setInformation("Mango", "Summer", 190);

        fruit1.getInformation();


        Fruit fruit2 = new Fruit();
        fruit2.setInformation("Jam", "Winter", 220);
        fruit2.getInformation();


    }
}
