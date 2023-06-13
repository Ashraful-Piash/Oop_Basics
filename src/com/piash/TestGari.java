package com.piash;

public class TestGari {
    public static void main(String[] args) {
        PrivateGari ob1 = new PrivateGari();
        ob1.setName("Audi");
        ob1.setColor("Blue");
        ob1.setPrice(10000000);

        System.out.println(ob1.getName());
        System.out.println(ob1.getColor());
        System.out.println("Price is: "+ob1.getPrice() +"$");

    }
}
