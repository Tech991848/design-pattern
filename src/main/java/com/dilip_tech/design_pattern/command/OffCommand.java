package com.dilip_tech.design_pattern.command;

public class OffCommand implements Command{

    Television television;

    public OffCommand(Television television){
        this.television=television;
    }
    @Override
    public void excecute() {
    television.off();
    }
}
