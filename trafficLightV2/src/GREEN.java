public class GREEN implements State{
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YELLOW());
    }

    @Override
    public void turnON(TrafficLight trafficLight) {
        System.out.println("GREEN ON ");
        trafficLight.setState(this);
    }

    @Override
    public void turnOFF(TrafficLight trafficLight) {
        System.out.println("GREEN OFF");
        trafficLight.setState(this);
    }
}
