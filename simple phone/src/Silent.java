public class Silent implements State{


    public void click(Phone phone) {
        phone.setState(new Sound());
    }

    public void alert(Phone phone) {
        System.out.println("silence....");
        phone.setState(this);
    }

    @Override
    public void volumeUp(Phone phone) {

    }

    @Override
    public void volumeDown(Phone phone) {

    }
}
