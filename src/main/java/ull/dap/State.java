package ull.dap;

import javax.swing.*;

public abstract class State {
    TrafficLight trafficLight;
    Icon icon;

    State(TrafficLight trafficLight) { this.trafficLight = trafficLight; }

    public abstract State onNext();
    public abstract Color getState();

}
