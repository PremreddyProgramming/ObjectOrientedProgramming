package com.kitchen.appliances;

public class Cooker {
    public void on(int cooktime,String foodtype){
        System.out.println("The Cooker is on!!" + " " + foodtype + " " + "Ready in" + " "
                + cooktime +" " + "seconds!!");
    }
    public void off(){
        System.out.println("Cooker off!!");
    }
}
