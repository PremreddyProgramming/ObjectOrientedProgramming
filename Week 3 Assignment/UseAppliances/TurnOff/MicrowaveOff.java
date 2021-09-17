package com.kitchen.useAppliances.TurnOff;

import com.kitchen.Command;
import com.kitchen.appliances.Microwave;

public class MicrowaveOff implements Command {
    Microwave microwave;
    public MicrowaveOff(Microwave microwave){
        this.microwave = microwave;
    }

    @Override
    public void execute() {
        microwave.off();
    }
}
