package com.piash;

public class TestMethodOverriding extends MethodOverriding{
    public static void main(String[] args) {
        Piash piash = new Piash();
        Tushar tushar = new Tushar();
        Saif saif = new Saif();

        System.out.println(piash.getProfit()+"%");
        System.out.println(tushar.getProfit()+"%");
        System.out.println(saif.getProfit()+"%");
    }
}
