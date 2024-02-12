package doctors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Patient implements PropertyChangeListener{

    private int ticketNumber;

    public Patient(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }

    public void CheckNr(int ticket){
        System.out.println("Looks up");
        if (ticketNumber == ticket) {
            System.out.println("Go to doctors office");
            
        }
        else{
          System.out.println("Play with phone");  
        }
        
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        
    }
    
}
