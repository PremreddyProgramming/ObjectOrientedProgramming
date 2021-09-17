package com.kitchen;

import com.kitchen.appliances.CoffeeMaker;
import com.kitchen.appliances.Cooker;
import com.kitchen.appliances.Microwave;
import com.kitchen.appliances.Oven;
import com.kitchen.useAppliances.TurnOff.CoffeeMakerOff;
import com.kitchen.useAppliances.TurnOff.CookerOff;
import com.kitchen.useAppliances.TurnOff.MicrowaveOff;
import com.kitchen.useAppliances.TurnOff.OvenOff;
import com.kitchen.useAppliances.TurnOn.CoffeeMakerOn;
import com.kitchen.useAppliances.TurnOn.CookerOn;
import com.kitchen.useAppliances.TurnOn.MicrowaveOn;
import com.kitchen.useAppliances.TurnOn.OvenOn;

public class Main {

    public static void main(String[] args) {
	    SwitchControll switchControll = new SwitchControll();
        Microwave microwave = new Microwave();
        Oven oven = new Oven();
        Cooker cooker = new Cooker();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        switchControll.setCommand(new MicrowaveOn(microwave)); // Use Microwave...
        switchControll.pressSwitch();

        switchControll.setCommand(new MicrowaveOff(microwave));
        switchControll.pressSwitch();

        switchControll.setCommand(new OvenOn(oven)); // Use Oven...
        switchControll.pressSwitch();

        switchControll.setCommand(new OvenOff(oven));
        switchControll.pressSwitch();

        switchControll.setCommand(new CookerOn(cooker)); // Use Cooker...
        switchControll.pressSwitch();

        switchControll.setCommand(new CookerOff(cooker));
        switchControll.pressSwitch();

        switchControll.setCommand(new CoffeeMakerOn(coffeeMaker)); // Use Coffee Maker...
        switchControll.pressSwitch();

        switchControll.setCommand(new CoffeeMakerOff(coffeeMaker));
        switchControll.pressSwitch();
    }
}
