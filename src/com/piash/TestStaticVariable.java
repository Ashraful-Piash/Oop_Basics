package com.piash;

public class TestStaticVariable {
    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable("Piash",1504035);
        StaticVariable obj2 = new StaticVariable("Pantho",1504033);
        obj1.displayInformation();
        obj2.displayInformation();
        System.out.println("University place: "+StaticVariable.place);

    }


}
