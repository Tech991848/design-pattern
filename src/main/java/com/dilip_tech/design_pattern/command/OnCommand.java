package com.dilip_tech.design_pattern.command;

public class OnCommand implements Command{

    Television television;

    public OnCommand(Television television){
        this.television=television;
    }
    @Override
    public void excecute() {
    television.on();
    }
}
