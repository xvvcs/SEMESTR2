public class Vibrate implements State{



    public void click(Phone phone) {
        phone.setState(new Silent());
    }

    public void alert(Phone phone) {
        System.out.println("BRRR!!");
        phone.setState(this);
    }

    @Override
    public void volumeUp(Phone phone) {

    }

    @Override
    public void volumeDown(Phone phone) {

    }
}
