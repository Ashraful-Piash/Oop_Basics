package com.piash;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInformation();
        Person person2 = new Person("Piash","Jamalpur",26);
        person2.displayInformation();
        Person person3 = new Person("Jerin","Tangail",24);
        person3.displayInformation();

    }
}
