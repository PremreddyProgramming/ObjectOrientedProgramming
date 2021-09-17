package com.kitchen;

public class SwitchControll {
    Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressSwitch(){
        command.execute();
    }
}
