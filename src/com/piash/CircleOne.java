package com.piash;

public class CircleOne extends ShapeOne{
    CircleOne(double r){
        super(r,r);
    }

    @Override
    void area() {
        double result = Math.PI * dim1 * dim2 ;
        String newResult = String.format("%.2f",result);
        System.out.println("Circle area: "+newResult);
    }
}
