package com.piash;

public class BoxVolume {
    public static void main(String[] args) {
        Box box1 = new Box(2.4,4.5, 5.6);
        Box box2 = new Box(3, 5, 7);
        box1.displayVolume();
        box2.displayVolume();
    }
}
