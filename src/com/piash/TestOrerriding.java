package com.piash;

public class TestOrerriding {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r  = new Rectangle(5,10);
        Triang t = new Triang(10,5);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
    }
}
