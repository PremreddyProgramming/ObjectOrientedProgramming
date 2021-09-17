package com.kitchen.useAppliances.TurnOn;

import com.kitchen.Command;
import com.kitchen.appliances.Cooker;

public class CookerOn implements Command {
    Cooker cooker;
    public CookerOn(Cooker cooker){
        this.cooker = cooker;
    }
    @Override
    public void execute() {
        cooker.on(60,"Rice");
    }
}
