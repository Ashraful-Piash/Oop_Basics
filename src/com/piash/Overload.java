package com.piash;

public class Overload {
    void add(){
        System.out.println("Nothing to add");
    }
    void add(int a, int b){
        System.out.println("a + b is:"+(a+b));
    }
    void add(double a, double b){
        System.out.println("double a + b is:"+(a+b));
    }
    void add(int a , int b, int c){
        System.out.println("a+ b + c :"+(a+b+c));
    }
}
