package com.piash;

public class CountStudent {
   static int count = 0;

    CountStudent(){
        count ++;
    }

    void displayInformation(){
        System.out.println("Student count:"+count);
        System.out.println("All ok");
    }


}
