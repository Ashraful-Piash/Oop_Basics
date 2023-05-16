package com.piash;

    class DemoTwo{

    public void playMusic(){
        System.out.println("Music should not be played");
    }

    public String giveMyPen(int price){
        if(price>=10)
        return "Pen";
        else return "Noting";
    }
}
    public class DemoOne{
    public static void main(String[]args){
        DemoTwo demoTwo= new DemoTwo();
        demoTwo.playMusic();
        String result = demoTwo.giveMyPen(4);
        System.out.println(result);

    }
}


