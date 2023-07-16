package com.piash;
import java.util.Scanner;

public class TestStudentDemo {
    Scanner scanner = new Scanner(System.in);
    String name = "";
    int marks = 0;

    public void setDetails(){
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your mark");
        marks = scanner.nextInt();
    }
    public void showDetails(){
        System.out.println("Name is "+name);
        System.out.println("Mark is : "+marks);
        System.out.println("Move to next");
    }

}
