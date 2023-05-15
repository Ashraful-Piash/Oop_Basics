package com.piash;

public class TestFruit {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Mango", "Summer", 190);
        fruit1.getInformation();


        Fruit fruit2 = new Fruit("Berry","Summer", 20);
        fruit2.getInformation();

        Fruit fruit3 = new Fruit();
            fruit3.getInformation();

    }
}
