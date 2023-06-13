package com.piash;

public class TestOverload {
    public static void main(String[] args) {
        Overload ob1 = new Overload();
        ob1.add();
        ob1.add(5,10);
        ob1.add(5,6,7);
        ob1.add(5.4,8.9);

    }
}
