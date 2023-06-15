package com.piash;

public class Bus extends Vehicle{
    int gear;

    Bus(String name, String color, Double weight, int gear){
            super(name,color,weight);
            this.gear = gear;
    }

    @Override
    void displayAttribute(){
        super.displayAttribute();
        System.out.println("Gear: "+gear);
        System.out.println("ok");
    }

}
