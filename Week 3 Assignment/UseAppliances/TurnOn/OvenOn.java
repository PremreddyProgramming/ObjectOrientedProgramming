package com.kitchen.useAppliances.TurnOn;

import com.kitchen.Command;
import com.kitchen.appliances.Oven;

public class OvenOn implements Command {
    Oven oven;
    public OvenOn(Oven oven){
        this.oven = oven;
    }
    @Override
    public void execute() {
        oven.on(5000,"Banana Cake");
    }
}
