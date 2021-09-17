package com.kitchen.useAppliances.TurnOn;

import com.kitchen.Command;
import com.kitchen.appliances.CoffeeMaker;
import com.kitchen.appliances.Cooker;

public class CoffeeMakerOn implements  Command{
    CoffeeMaker coffeeMaker;
    public CoffeeMakerOn(CoffeeMaker coffeeMaker){
        this.coffeeMaker = coffeeMaker;
    }
    @Override
    public void execute() {
        coffeeMaker.on(100);
    }

}
