public class Main {
    public static void main(String[] args) throws InterruptedException {
        Patient patient1 = new Patient(2);
        Patient patient2 = new Patient(3);
        WaitingRoom waitingRoom = new WaitingRoom();

        waitingRoom.enterWaitingRoom(patient1);
        waitingRoom.enterWaitingRoom(patient2);
        Thread.sleep(2000);
        waitingRoom.ding();
        Thread.sleep(2000);
        waitingRoom.ding();
        Thread.sleep(2000);
        waitingRoom.ding();

    }
}