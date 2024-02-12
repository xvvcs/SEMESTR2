public class Turnstile {
    private State state;

    public Turnstile(){
        state = new Closed();
    }
    void setState(State state){
        this.state=state;
        this.state.onEntry(this);
    }
    public void coin(){
        state.coin(this);
    }
    public void pass(){
        state.pass(this);
    }
}
