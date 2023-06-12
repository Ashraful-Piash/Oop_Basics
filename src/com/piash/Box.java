package com.piash;

public class Box {
    double height, width, depth;

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

        void displayVolume() {
        double vol = height * width * depth;
            System.out.println("Volume of box is: " +vol);

        }
    }

