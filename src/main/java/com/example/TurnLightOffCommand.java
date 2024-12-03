package com.example;

public class TurnLightOffCommand implements Command {
    
    private final Light light;
    public TurnLightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        this.light.turnOffLight();
    }
}
