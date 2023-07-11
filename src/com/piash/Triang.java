package com.piash;

public class Triang extends Shape{

    double height, base;

    Triang(double height, double base){
        this.height= height;
        this.base= base;
    }
    @Override
    double area() {
        return 0.5 * height * base;
    }
}
