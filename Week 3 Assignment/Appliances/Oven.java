package com.kitchen.appliances;

public class Oven {
    public void on(int cooktime,String foodtype){
        System.out.println("The Oven is on!!" + " " + foodtype + " " + "Ready in" + " "
                + cooktime +" " + "seconds!!");
    }
    public void off(){
        System.out.println("Oven off!!");
    }
}
