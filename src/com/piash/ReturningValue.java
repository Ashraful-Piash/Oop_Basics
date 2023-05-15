package com.piash;

public class ReturningValue {
    int number;

    ReturningValue(int n){
        number = n * n;
    }
    void getResult(){
        System.out.println("Square of given is " +number);
    }

}
