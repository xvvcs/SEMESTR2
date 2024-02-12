public interface State {
    public void next(TrafficLight trafficLight);
    public void turnON(TrafficLight trafficLight);
    public void turnOFF(TrafficLight trafficLight);
}
