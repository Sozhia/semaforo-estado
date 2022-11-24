package ull.dap;

import javax.swing.*;

import static ull.dap.Color.GREEN;

public class GreenLightState extends State{

    GreenLightState(TrafficLight trafficLight) {
        super(trafficLight);
        icon = new ImageIcon("");
    }

    @Override
    public State onNext() { return StateChanger.changeState(GREEN, trafficLight); }

    @Override
    public Color getState() { return GREEN; }
}
