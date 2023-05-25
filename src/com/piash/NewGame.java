package com.piash;

public class NewGame {
    public static void main(String[] args) {
        Game game1 = new Game("kanamachi", "outdoor","bangladesh");
        game1.getInformation();

        Game game2 = new Game("Cricket", "outdoor", "england");
        game2.getInformation();

        Game game3 = new Game();
        game3.getInformation();

        Game game4 = new Game("Football","outdoor","Britain");
        game4.getInformation();


    }
}
