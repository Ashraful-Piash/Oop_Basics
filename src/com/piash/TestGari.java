package com.piash;

public class TestGari {
    public static void main(String[] args) {
        PrivateGari ob1 = new PrivateGari();
        ob1.setName("Audi");
        ob1.setColor("Blue");
        ob1.setPrice(10000000);

        ob1.displayInformation();


        PrivateGari ob2 = new PrivateGari();
        ob2.setName("Rickshaw");
        ob2.setColor("Multicolor");
        ob2.setPrice(30000);

        ob2.displayInformation();




    }
}
