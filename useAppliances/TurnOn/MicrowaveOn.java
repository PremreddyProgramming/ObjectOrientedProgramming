package com.kitchen.useAppliances.TurnOn;

import com.kitchen.Command;
import com.kitchen.appliances.Microwave;

public class MicrowaveOn implements Command {
    Microwave microwave;
    public MicrowaveOn(Microwave microwave){
        this.microwave = microwave;
    }

    @Override
    public void execute() {
        microwave.on(200);
    }
}
