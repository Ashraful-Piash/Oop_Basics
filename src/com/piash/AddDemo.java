package com.piash;

public class AddDemo {
    void add(int ... num){
        int sum = 0;
        for(int i : num){
            sum = i + sum;
        }
        System.out.println(sum);

    }
}
