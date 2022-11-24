package ull.dap;

import javax.swing.*;

import static ull.dap.Color.FASTINGGREEN;

public class FastingGreenLightState extends State{

    FastingGreenLightState(TrafficLight trafficLight) {
        super(trafficLight);
        icon = new ImageIcon("");
    }

    @Override
    public State onNext() { return StateChanger.changeState(FASTINGGREEN, trafficLight); }

    @Override
    public Color getState() { return FASTINGGREEN; }
}
