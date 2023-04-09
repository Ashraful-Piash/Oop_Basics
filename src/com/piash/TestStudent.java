package com.piash;

public class TestStudent {
    String name;
    int rollNo;
    String batch;
    String section;
    int dueSalary;

    TestStudent(String name,int rollNo,String batch,String section){
        this.name = name;
        this.rollNo = rollNo;
        this.batch = batch;
        this.section=section;
    }
    TestStudent(String name, int rollNo, String batch, String section, int dueSalary){
        this(name,rollNo,batch,section);
        this.dueSalary= dueSalary;
    }
    void display(){
//        System.out.println("Student name is : " +name + " and his roll no is: "+rollNo + " . He is form batch: "+batch + "  Section is: "+section);
        System.out.println("Student name is : " +name + " and his roll no is: "+rollNo + " . He is form batch: "+batch + "  Section is: "+section+ "due salary :"+dueSalary);

    }

}
