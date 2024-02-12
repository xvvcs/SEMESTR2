public class RED implements State{

    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YELLOWRED());
    }

    public void turnON(TrafficLight trafficLight) {

    }

    @Override
    public void turnOFF(TrafficLight trafficLight) {

    }
}
