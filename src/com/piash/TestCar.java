package com.piash;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setInformation("ferrari","red",1000);
        car1.getInformation();

        Car car2 = new Car();
        car2.setInformation("ford","blue",2000);
        car2.getInformation();

    }


}
