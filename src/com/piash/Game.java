package com.piash;

public class Game {
    String name;
    String type;
    String region;
    static String topPlayer="The Best One";

    Game(String n, String t, String r){
        name = n;
        type = t;
        region = r;
    }

    Game (String p, String q){
        name = p;
        type = q;


    }

    Game(){
        System.out.println("Nothing in this game");
    }

    void getInformation(){
        System.out.println("Game name is :"+name);
        System.out.println("Game type is: "+type);
        System.out.println("Game region is: "+region);
        System.out.println("top player is:" +topPlayer);
        System.out.println("\n");
    }

}
