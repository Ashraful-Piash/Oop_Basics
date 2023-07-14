package com.piash;

 abstract class TestCarOne {
    public abstract void drive();

    public void playGame(){
        System.out.println("Play game");
    }
}
class WagonR extends TestCarOne{
     public void drive(){
         System.out.println("Driving");
     }

}


public  class DemoTest {
    public static void main(String[] args) {
        TestCarOne testCarOne = new WagonR();
        testCarOne.drive();
        testCarOne.playGame();
        System.out.println("All ok");

    }
}
