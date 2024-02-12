public class YELLOW implements State{
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RED());
    }

    @Override
    public void turnON(TrafficLight trafficLight) {
        System.out.println("YELLOW ON ");
        trafficLight.setState(this);
    }

    @Override
    public void turnOFF(TrafficLight trafficLight) {
        System.out.println("YELLOW OFF");
        trafficLight.setState(this);
    }
}
