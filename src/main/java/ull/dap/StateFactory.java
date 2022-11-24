package ull.dap;

import static ull.dap.Color.*;

public class StateFactory {

    public static State createState(Color type, TrafficLight trafficLight){
        return switch (type) {
          case RED -> new RedLightState(trafficLight);
          case YELLOW -> new YellowLightState(trafficLight);
          case GREEN -> new GreenLightState(trafficLight);
          case FASTINGGREEN -> new FastingGreenLightState(trafficLight);
          default -> new WhiteLightState(trafficLight);
        };
    }

}
