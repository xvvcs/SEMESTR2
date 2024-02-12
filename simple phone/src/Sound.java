public class Sound implements State{


    public void click(Phone phone) {
        phone.setState(new Vibrate());
    }

    public void alert(Phone phone) {
        System.out.println("DRRING!!");
        phone.setState(this);
    }

    @Override
    public void volumeUp(Phone phone) {
        System.out.println("Volume up");
        phone.setVolume(phone.getVolume()+1);
        phone.setState(this);
    }

    @Override
    public void volumeDown(Phone phone) {
        System.out.println("Volume down");
        if(phone.getVolume() == 1){
            phone.setVolume(0);
            phone.setState(new Vibrate());
        }else {
            phone.setVolume(phone.getVolume()-1);
        }
    }
}
