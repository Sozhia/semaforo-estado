package ull.dap;

import javax.swing.*;

import static ull.dap.Color.WHITE;

public class WhiteLightState extends State{

    WhiteLightState(TrafficLight trafficLight) {
        super(trafficLight);
        icon = new ImageIcon("");
    }

    @Override
    public State onNext() { return StateChanger.changeState(WHITE, trafficLight); }

    @Override
    public Color getState() { return WHITE; }
}
