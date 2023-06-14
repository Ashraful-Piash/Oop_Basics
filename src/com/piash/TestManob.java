package com.piash;

public class TestManob {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name="Piash";
        doctor.age = 25;
        doctor.qualification = "MBBS";
        doctor.displayInformation();

        Manob manob = new Manob();
        manob.name = "Ashraful";
        manob.age = 26;
        manob.displayInformation();



    }
}
