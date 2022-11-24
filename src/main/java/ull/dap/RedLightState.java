package ull.dap;

import javax.swing.*;

import static ull.dap.Color.RED;

public class RedLightState extends State{

    RedLightState(TrafficLight trafficLight) {
        super(trafficLight);
        icon = new ImageIcon("A:\\Workspace\\DAP\\semaforo-estado\\src\\main\\resources\\red-light.png");
    }

    @Override
    public State onNext() { return StateChanger.changeState(RED, trafficLight); }

    @Override
    public Color getState() { return RED; }
}
