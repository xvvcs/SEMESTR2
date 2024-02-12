package dk.via.traffic;

import dk.via.traffic.trafficlight.Lights;
import dk.via.traffic.trafficlight.TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Pedestrian implements PropertyChangeListener {
    private final Car car;

    public Pedestrian(Car car) {
        this.car = car;
    }

    public void onLightChange(TrafficLight trafficLight) {
        if (trafficLight.isTurnedOn(Lights.GREEN)) {
            if (!car.isRunning()) car.start();
            car.stop();
        } else if (trafficLight.isTurnedOn(Lights.RED) && trafficLight.isTurnedOn(Lights.YELLOW)) {
            car.start();
        } else if (trafficLight.isTurnedOn(Lights.YELLOW)) {
            car.start();
            car.accelerate();
        } else {
            trafficLight.removePropertyChangeListener(this);
            System.out.println("Crossed");
        }
    }

    public Car getCar() {
        return car;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        TrafficLight light = (TrafficLight) evt.getSource();
        onLightChange(light);
    }
}
