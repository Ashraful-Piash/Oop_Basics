package com.piash;

public class TestAbstract {
    public static void main(String[] args) {
        MobileUser mu ;
        mu = new UserOne();
        mu.sendMessage();
        mu = new UserTwo();
        mu.sendMessage();

    }
}
