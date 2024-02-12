public class Main {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight();
        RED red = new RED();
        light.setState(red);
       light.next();
        light.next();


    }
}