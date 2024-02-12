public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Sound sound = new Sound();
        phone.setState(sound);
        phone.onMessage("Ello");
        phone.onClick();
        phone.onMessage("Ello");
        phone.onClick();
        phone.onMessage("Ello");

        phone.setVolume(3);
        sound.volumeDown(phone);
        sound.volumeDown(phone);
        sound.volumeDown(phone);
        phone.onMessage("Ello");
        sound.volumeUp(phone);
        phone.onMessage("Ello");


    }
}