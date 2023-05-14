package com.piash;

public class CokeNumberHeadFirst {
    public static void main(String[] args) {
        int cokeNum = 99;
        String word = "bottles";
        while (cokeNum > 0) {
            if (cokeNum == 1) {
                word = "bottle";
            }
            System.out.println(cokeNum + " " + word + " of coke on the wall.");
            System.out.println(cokeNum + " " + word + " of coke.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            cokeNum = cokeNum - 1;
            if (cokeNum > 0) {
                if (cokeNum == 1) {
                    word = "bottle";
                }
                System.out.println(cokeNum + " " + word + " of coke on the wall.");
            } else {
                System.out.println("No more bottles of coke on the wall.");
            }
        }
    }
}




