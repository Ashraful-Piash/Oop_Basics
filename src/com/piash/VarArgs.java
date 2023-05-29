package com.piash;

public class VarArgs {
    void add (int ... num){
        int sum = 0;
        for(int x : num){
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
