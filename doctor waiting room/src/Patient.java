import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Patient implements PropertyChangeListener {

    private int ticketNumber;

    public Patient(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }



    public void propertyChange(PropertyChangeEvent evt) {

        WaitingRoom ticket = (WaitingRoom) evt.getSource();

        System.out.println("Patient "+ticketNumber+" looks up.");

        if (ticket.getCurrentTicketNumber() == ticketNumber){
            System.out.println("Patient "+ticketNumber+" goes to the doctors room.");
            ticket.leaveWaitingRoom(this);
        }
        else
            System.out.println("Patient "+ticketNumber+" plays with phone.");
    }


}
