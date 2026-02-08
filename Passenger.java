public class Passenger {
    private String phoneNumber;
    private String passengerName;

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
}