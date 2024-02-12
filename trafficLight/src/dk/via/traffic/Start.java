package dk.via.traffic;

import dk.via.traffic.trafficlight.TrafficLight;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");
        Car carTax = new Car("Taxi");
        Car sleepy = new Car("Sleepy");
        Car pedes = new Car("Pedestrian");
        Driver driverA = new Driver(carA);
        Driver driverB = new Driver(carB);
        Driver driverC = new Driver(carC);
        TaxiDriver taxi = new TaxiDriver(carTax);
        SleepyDriver sleepyDriver = new SleepyDriver(sleepy);
        Pedestrian pedestrian = new Pedestrian(pedes);
        carA.start();
        carB.start();
        carC.start();
        carTax.start();
        sleepy.start();
        pedes.start();
        Thread.sleep(1000);
        light.addPropertyChangeListener(driverA);
        light.addPropertyChangeListener(driverB);
        light.addPropertyChangeListener(pedestrian);
        light.next();
        Thread.sleep(1000);
        light.addPropertyChangeListener(taxi);
        light.next();
        Thread.sleep(1000);
        light.addPropertyChangeListener(driverC);
        light.addPropertyChangeListener(sleepyDriver);
        light.next();
        Thread.sleep(1000);
        light.next();
        Thread.sleep(1000);
        light.next();
        Thread.sleep(1000);
        light.next();
    }
}
