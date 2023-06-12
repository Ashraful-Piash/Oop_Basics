package com.piash;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human("Ashraful",26);
        human.displayInformation();
        Human human1 = new Human("Piash", 27);
        human1.displayInformation();
        Human human2 = new Human("Haque", 28);
        human2.displayInformation();

        Human.displayInformation2();

    }
}
