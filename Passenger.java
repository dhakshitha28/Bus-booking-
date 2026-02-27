import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String phoneNumber;
    private String passengerName;
    private List<Ticket> ticket =new ArrayList<>();

    Passenger( String phoneNumber,String passengerName){
        this.phoneNumber=phoneNumber;
        this.passengerName=passengerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }
}