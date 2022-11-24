package ull.dap;

import javax.swing.*;

import static ull.dap.Color.YELLOW;

public class YellowLightState extends State{

    YellowLightState(TrafficLight trafficLight) {
        super(trafficLight);
        icon = new ImageIcon("");
    }

    @Override
    public State onNext() { return StateChanger.changeState(YELLOW, trafficLight); }

    @Override
    public Color getState() { return YELLOW; }
}
