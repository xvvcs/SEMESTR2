package doctors;

import java.beans.PropertyChangeSupport;

public class WaitingRoom{
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
        System.out.println("Diing!");
        int oldNr = currentTicketNumber;
        currentTicketNumber++;
        support.firePropertyChange("ticketNr", oldNr, currentTicketNumber);
    }
    public void enterWaitingRoom(Patient patient){
        support.addPropertyChangeListener(patient);
    }
    public void leaveWaitingRoom(Patient patient){
        support.removePropertyChangeListener(patient);
    }


}