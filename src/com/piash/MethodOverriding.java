package com.piash;

public class MethodOverriding {
    int  getProfit(){
        return 5;
    }
}
class Piash extends  MethodOverriding {
    @Override
    int getProfit(){
        return 6;
    }
}
class Saif extends MethodOverriding {
    @Override
    int getProfit() {
        return 9;
    }
}
class Tushar extends MethodOverriding{
    @Override
    int getProfit(){
        return 10;
    }
}
