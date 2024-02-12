import java.beans.PropertyChangeSupport;

public class WaitingRoom {

    private int currentTicketNumber;
    private PropertyChangeSupport support;

    public WaitingRoom(){
        currentTicketNumber = 0;
        support = new PropertyChangeSupport(this);
    }
    public int getCurrentTicketNumber(){
        return currentTicketNumber;
    }
    public void ding(){
        System.out.println("Ding!");
        int oldTicket = currentTicketNumber;
        currentTicketNumber++;
        support.firePropertyChange("ticket", oldTicket, currentTicketNumber);
    }

    public void enterWaitingRoom(Patient patient){
        System.out.println("Patient enters waiting room");
        support.addPropertyChangeListener(patient);
    }
    public void leaveWaitingRoom(Patient patient){
        support.removePropertyChangeListener(patient);
    }
}
