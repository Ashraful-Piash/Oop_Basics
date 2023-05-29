package com.piash;

public class CallByReferenceTest {
    public static void main(String[] args) {
        CallByReference r1 = new CallByReference();
        r1.name = "Ashraful";
        System.out.println("Before changing: "+r1.name);

        r1.change(r1);
        System.out.println("After Changing: "+r1.name);


    }
}
