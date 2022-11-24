package ull.dap;

import static ull.dap.Color.*;

public class TrafficLight {

    State state;

    TrafficLight() { state = StateFactory.createState(WHITE, this); }

    public void changeState() { state =  state.onNext(); }

    public void onStart(){ state = StateFactory.createState(RED, this); }

}
