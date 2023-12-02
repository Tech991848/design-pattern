package com.dilip_tech.design_pattern.command;

public class RemoteControl {
    public Command getCommand() {
        return command;
    }

    public void pressButton(){
        command.excecute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    private Command command;

}
