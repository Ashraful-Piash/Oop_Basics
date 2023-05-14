package com.piash;

public class IfElseHeadFirst {
    public static void main(String[] args) {
        int x = 23;
        int y = 5;
        String name = "Piash";
            if(x==20){
                System.out.println("x = 20");
            } else{
                System.out.println("X is not equal to 20. X is equal to "+x);
            }
            if((y<3 ) & (name.equals("Piash"))){
                System.out.println("All is ok till now");
        }else {
                System.out.println("Nothing is Ok");
            }
    }
}
