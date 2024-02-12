package doctors;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        WaitingRoom room = new WaitingRoom();
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(4);

        room.enterWaitingRoom(patient1);
        room.enterWaitingRoom(patient2);
        room.enterWaitingRoom(patient3);

        room.ding();
        Thread.sleep(1000);
        patient1.CheckNr(room.getCurrentTicketNumber());
        patient2.CheckNr(room.getCurrentTicketNumber());
        patient3.CheckNr(room.getCurrentTicketNumber());
        room.ding();
        Thread.sleep(1000);
        patient1.CheckNr(room.getCurrentTicketNumber());
        patient2.CheckNr(room.getCurrentTicketNumber());
        patient3.CheckNr(room.getCurrentTicketNumber());
        room.ding();
        Thread.sleep(1000);
        patient1.CheckNr(room.getCurrentTicketNumber());
        patient2.CheckNr(room.getCurrentTicketNumber());
        patient3.CheckNr(room.getCurrentTicketNumber());
    }
}
