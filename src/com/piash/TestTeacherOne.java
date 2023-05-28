package com.piash;

public class TestTeacherOne {
    public static void main(String[] args) {

        TeacherOne t1 = new TeacherOne();
        t1.getInformation();

        TeacherOne t2 = new TeacherOne("Ashraful","Male","Islampur");
        t2.getInformation();

        TeacherOne t3 = new TeacherOne("Piash","Male","Jamalpur",26, 1888000);
        t3.getInformation();

        }
    }

