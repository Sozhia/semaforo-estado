package ull.dap;

import static ull.dap.Color.*;

public class StateChanger {
    public static State changeState(Color type, TrafficLight trafficLight){
        return switch (type) {
            case RED -> new YellowLightState(trafficLight);
            case YELLOW -> new GreenLightState(trafficLight);
            case GREEN -> new FastingGreenLightState(trafficLight);
            case FASTINGGREEN -> new RedLightState(trafficLight);
            default -> new WhiteLightState(trafficLight);
        };
    }
}
