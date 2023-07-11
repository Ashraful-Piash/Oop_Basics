package com.piash;

public class TestOrerriding {
    public static void main(String[] args) {

        Shape [] s = new Shape[3];
        s[0]= new Shape();
        s[1]= new Rectangle(10,5);
        s[2]= new Triang(5,10);

        for(int i = 0; i < 3; i++){
            System.out.println(s[i].area());
        }

    }
}
