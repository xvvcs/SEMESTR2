public class YELLOWRED implements State{
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GREEN());
    }

    @Override
    public void turnON(TrafficLight trafficLight) {
        System.out.println("YELLOW AND RED ON ");
        trafficLight.setState(this);
    }

    @Override
    public void turnOFF(TrafficLight trafficLight) {
        System.out.println("YELLOW AND RED OFF");
        trafficLight.setState(this);
    }
}
