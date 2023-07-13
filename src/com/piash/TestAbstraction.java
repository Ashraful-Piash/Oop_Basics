package com.piash;

public class TestAbstraction {
    public static void main(String[] args) {
        ShapeOne shapeOne;
        shapeOne = new RectangleOne(2,4);
        shapeOne.area();
        shapeOne = new TriangleOne(5,10);
        shapeOne.area();
        shapeOne = new CircleOne(10);
        shapeOne.area();
    }
}
