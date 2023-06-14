package com.piash;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Apple");
        myList.add("Mango");
        myList.add("Banana");

        String fruit = myList.get(2);
        System.out.println("Element at index 2: "+fruit);

        myList.set(2, "Orange");
        System.out.println("after modifying "+ myList);
        myList.remove(0);
        System.out.println("after removing index 0"+myList);

        int size = myList.size();
        System.out.println(size);
    }
}
