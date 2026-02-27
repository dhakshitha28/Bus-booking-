public class Ticket {
    private Passenger passenger;
    private String bookingDate;
    private String source;
    private String destination;
    private String journeyStatus;

    public  Ticket(Passenger passenger,String date,String source,String destination,String journeyStatus){
        this.passenger=passenger;
        this.bookingDate=date;
        this.source=source;
        this.destination=destination;
        this.journeyStatus=journeyStatus;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getJourneyStatus() {
        return journeyStatus;
    }

    public void setJourneyStatus(String journeyStatus) {
        this.journeyStatus = journeyStatus;
    }
}
