package com.piash;

public class Game {
    String name;
    String type;
    String region;

    Game(String n, String t, String r){
        name = n;
        type = t;
        region = r;
    }

    void getInformation(){
        System.out.println("Game name is :"+name);
        System.out.println("Game type is: "+type);
        System.out.println("Game region is: "+region);
    }

}
