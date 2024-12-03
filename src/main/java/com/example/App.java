package com.example;

public class App {

    public static void main(String[] args) {
        
        var light = new Light();

        CommandOperator commandOperator = new CommandOperator();
        
        light.isOn();
        commandOperator.execute(new TurnLightOnCommand(light));
        light.isOn();
        commandOperator.execute(new TurnLightOffCommand(light));
        light.isOn();
    }

}
