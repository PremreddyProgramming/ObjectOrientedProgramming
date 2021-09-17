package com.kitchen.useAppliances.TurnOff;

import com.kitchen.Command;
import com.kitchen.appliances.Cooker;

public class CookerOff implements Command {
    Cooker cooker;
    public CookerOff(Cooker cooker){
        this.cooker = cooker;
    }
    @Override
    public void execute() {
        cooker.off();
    }
}
