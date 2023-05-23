package com.piash;

public class Game {
    String name;
    String type;
    String region;
    static String topPlayer;

    Game(String n, String t, String r){
        name = n;
        type = t;
        region = r;
    }

    Game(){
        System.out.println("Nothing in this game");
    }

    void getInformation(){
        System.out.println("Game name is :"+name);
        System.out.println("Game type is: "+type);
        System.out.println("Game region is: "+region);
    }

}
