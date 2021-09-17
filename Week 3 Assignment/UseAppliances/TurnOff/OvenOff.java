package com.kitchen.useAppliances.TurnOff;

import com.kitchen.Command;
import com.kitchen.appliances.Oven;

public class OvenOff implements Command {
    Oven oven;
    public OvenOff(Oven oven){
        this.oven = oven;
    }
    @Override
    public void execute() {
        oven.off();
    }
}
