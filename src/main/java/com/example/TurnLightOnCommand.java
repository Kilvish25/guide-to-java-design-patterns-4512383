package com.example;

public class TurnLightOnCommand implements Command {

    private final Light light;
    public TurnLightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        this.light.turnOnLight();
    }
}
