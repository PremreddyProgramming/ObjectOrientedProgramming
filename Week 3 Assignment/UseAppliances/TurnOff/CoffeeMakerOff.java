package com.kitchen.useAppliances.TurnOff;

import com.kitchen.Command;
import com.kitchen.appliances.CoffeeMaker;
import com.kitchen.appliances.Cooker;

public class CoffeeMakerOff implements Command {
    CoffeeMaker coffeeMaker;
    public CoffeeMakerOff(CoffeeMaker coffeeMaker){
        this.coffeeMaker = coffeeMaker;
    }
    @Override
    public void execute() {
        coffeeMaker.off();
    }
}
