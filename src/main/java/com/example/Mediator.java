package com.example;

public class Mediator {
    private PedestrianCrossingLight pedestrianCrossingLight;
    private TrafficLight trafficLight;

    public Mediator(PedestrianCrossingLight pedestrianCrossingLight, TrafficLight trafficLight){
        this.pedestrianCrossingLight = pedestrianCrossingLight;
        this.trafficLight = trafficLight;
    }

    public void changeTrafficLightToRed(){
        trafficLight.changeToRed();
        pedestrianCrossingLight.changeToGreen();
    }

    public void changeTrafficLightToGreen(){
        pedestrianCrossingLight.changeToRed();
        trafficLight.changeToGreen();
    }

    public void changeTrafficLightToAmber(){
        trafficLight.changeToAmber();
    }
}
