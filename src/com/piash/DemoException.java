package com.piash;

import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter number 1: ");
                int num1 = sc.nextInt();
                System.out.println("enter num2:");
                int num2 = sc.nextInt();
                int result = num1 / num2;
                System.out.println("result "+result);

            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("You must enter an integer");
            }
        }
    }
}
