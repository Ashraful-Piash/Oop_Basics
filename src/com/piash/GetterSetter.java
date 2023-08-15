package com.piash;

public class GetterSetter {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void displayInformation(){
        System.out.println("name: "+name + "RollNo: "+rollNo);
    }

}
