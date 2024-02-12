import javax.swing.*;

public class Phone {
    private State state;
    private int volume = 5;

    public void onClick(){
        state.click(this);
    }

    public void onMessage(String message){
        System.out.println(message);
        state.alert(this);
    }

    public void onVolumeUp(){

        state.volumeUp(this);
    }
    public void onVolumeDown(){

        state.volumeDown(this);
    }

    void setState(State state){
        this.state = state;
    }
    int getVolume(){return volume;}
    void setVolume(int volume){this.volume=volume;}

}
