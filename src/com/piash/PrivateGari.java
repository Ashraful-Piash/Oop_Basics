package com.piash;

public class PrivateGari extends Gari{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void  displayInformation(){
        System.out.println(getName());
        System.out.println(getColor());
        System.out.println("Price is: "+getPrice() +" $");
        System.out.println("\n");
    }
}
