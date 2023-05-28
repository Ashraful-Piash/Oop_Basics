package com.piash;

public class Box {
    double height, width, depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

        void displayVolume() {
        double vol = height * width * depth;
            System.out.println("Volume of box is" +vol);
        }
    }

