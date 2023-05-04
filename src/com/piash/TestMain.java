package com.piash;

public class TestMain {
    public static void main(String[] args) {
        TestStudent s1 =  new TestStudent("Piash", 3,"superbatch","a");
        s1.display();

        TestStudent s2 = new TestStudent("Bipu",1,"Super Batch","a",5000);
        s2.display();
        TestStudent s3 = new TestStudent("haque","jamalpur", "superbatch","a",3000);
        s3.display();

    }
}
