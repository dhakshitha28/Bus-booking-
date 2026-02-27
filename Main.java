import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Passenger> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\t\tWelcome to bus booking Application");
            System.out.println("\t\tLogin Or created the Account");
            System.out.println("Enter your Phone number");
            String PhoneNumber = scanner.next();
            Passenger passenger = null;
            boolean thereIsExistingPassenger = true;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getPhoneNumber().equals(PhoneNumber)) {
                    System.out.println("welcome back" + list.get(i).getPassengerName());
                    passenger = list.get(i);
                    thereIsExistingPassenger = false;
                }
            }
            if (thereIsExistingPassenger) {
                System.out.println("Enter your Name");
                String Name = scanner.next();
                passenger = new Passenger(PhoneNumber, Name);
                list.add(passenger);
            }
            Integer choice = 0;
            while (choice != 5) {
                System.out.println("You can able to do");
                System.out.println("1.Book Tickets");
                System.out.println("2.Show How many ticket I Booked");
                System.out.println("3.Update your task status");
                System.out.println("4.Cancelled the ticket");
                System.out.println("5.Exit");

                System.out.println("Enter your Choice");
                choice = new Integer(scanner.next());
                if (choice == 1) {
                    System.out.println("The place where the bus is going");
                    Bus bus = new Bus();
                    for (int i = 0; i < bus.getPlace().size(); i++) {
                        String place = bus.getPlace().get(i+1);
                        System.out.println(i + 1 + "." + place);
                    }
                    System.out.println("Bus Starting Time:"+bus.getStartingTime());
                    System.out.println("Bus Ending Time:"+bus.getEndingTime());
                    System.out.println("Enter your Source Number");
                    String source = scanner.next();
                    System.out.println("Enter your Destination Number");
                    String destination = scanner.next();
                    System.out.println("Enter your Booking date");
                    String bookingDate=scanner.next();
                  //if(source<=bus.getPlace().size() && destination<=bus.getPlace().size()) {
                        Ticket ticket = new Ticket(passenger, bookingDate, source, destination, "Yet to travel");
                   // }
                    passenger.getTicket().add(ticket);
                    System.out.println("\nBus Booking is successfully Completed");
                    System.out.println("========================================");
                    System.out.println("\t\t\tYOUR TICKET");
                    System.out.println("Name :" + passenger.getPassengerName());
                    System.out.println("Phone No :" + passenger.getPhoneNumber());
                    System.out.println("Source :" + ticket.getSource());
                    System.out.println("Destination :" + ticket.getDestination());
                    System.out.println("Journey Statues :" + ticket.getJourneyStatus());
                    System.out.println("Booking Date :"+ticket.getBookingDate());
                    System.out.println("======================================== \n");

                }
                if(choice==2) {
                    System.out.println("1.Show My All Ticket");
                    System.out.println("2.Show Yet To travel Ticket");
                    System.out.println("3.Show Currently Active Ticket");
                    System.out.println("4.Show journey Completed Ticket");
                    System.out.println("Enter Your Option For View Your Ticket");
                    String opt = scanner.next();
                    if (opt.equals("1")) {
                        if (passenger.getTicket().isEmpty()) {
                            System.out.println("You have not booked any ticket yet");
                        }
                        else {
                            for(int i=0;i<passenger.getTicket().size();i++){
                                System.out.println("========================================");
                                System.out.println("\t\t\t"+(i+1)+".YOUR TICKET");
                                System.out.println("Name :" + passenger.getTicket().get(i).getPassenger().getPassengerName());
                                System.out.println("Phone No :" + passenger.getTicket().get(i).getPassenger().getPhoneNumber());
                                System.out.println("Source :" + passenger.getTicket().get(i).getSource());
                                System.out.println("Destination :" + passenger.getTicket().get(i).getDestination());
                                System.out.println("Journey Statues :" + passenger.getTicket().get(i).getJourneyStatus());
                                System.out.println("Booking Date :"+passenger.getTicket().get(i).getBookingDate());
                                System.out.println("======================================== \n");
                            }
                        }
                    }


                    if(opt.equals("2")){
                        boolean thereIsNoTicket=true;
                        for(int i=0;i<passenger.getTicket().size();i++){
                            if(passenger.getTicket().get(i).getJourneyStatus().equals("Yet to travel")){
                                System.out.println("========================================");
                                System.out.println("\t\t\t"+(i+1)+".YOUR TICKET");
                                System.out.println("Name :" + passenger.getTicket().get(i).getPassenger().getPassengerName());
                                System.out.println("Phone No :" + passenger.getTicket().get(i).getPassenger().getPhoneNumber());
                                System.out.println("Source :" + passenger.getTicket().get(i).getSource());
                                System.out.println("Destination :" + passenger.getTicket().get(i).getDestination());
                                System.out.println("Journey Statues :" + passenger.getTicket().get(i).getJourneyStatus());
                                System.out.println("Booking Date :"+passenger.getTicket().get(i).getBookingDate());
                                System.out.println("======================================== \n");
                                thereIsNoTicket=false;
                            }
                        }
                        if(thereIsNoTicket){
                            System.out.println("There is no upcoming ticket");
                        }
                    }

                    if(opt.equals("3")){
                        boolean thereIsNoTicket=true;
                        for(int i=0;i<passenger.getTicket().size();i++){
                            if(passenger.getTicket().get(i).getJourneyStatus().equals("Currently active")){
                                System.out.println("========================================");
                                System.out.println("\t\t\t"+(i+1)+".YOUR TICKET");
                                System.out.println("Name :" + passenger.getTicket().get(i).getPassenger().getPassengerName());
                                System.out.println("Phone No :" + passenger.getTicket().get(i).getPassenger().getPhoneNumber());
                                System.out.println("Source :" + passenger.getTicket().get(i).getSource());
                                System.out.println("Destination :" + passenger.getTicket().get(i).getDestination());
                                System.out.println("Journey Statues :" + passenger.getTicket().get(i).getJourneyStatus());
                                System.out.println("Booking Date :"+passenger.getTicket().get(i).getBookingDate());
                                System.out.println("======================================== \n");
                                thereIsNoTicket=false;
                            }
                        }
                        if(thereIsNoTicket){
                            System.out.println("There is no active ticket.");
                        }
                    }

                    if(opt.equals("4")){
                        boolean thereIsNoTicket=true;
                        for(int i=0;i<passenger.getTicket().size();i++){
                            if(passenger.getTicket().get(i).getJourneyStatus().equals("Completed")){
                                System.out.println("========================================");
                                System.out.println("\t\t\t"+(i+1)+".YOUR TICKET");
                                System.out.println("Name :" + passenger.getTicket().get(i).getPassenger().getPassengerName());
                                System.out.println("Phone No :" + passenger.getTicket().get(i).getPassenger().getPhoneNumber());
                                System.out.println("Source :" + passenger.getTicket().get(i).getSource());
                                System.out.println("Destination :" + passenger.getTicket().get(i).getDestination());
                                System.out.println("Journey Statues :" + passenger.getTicket().get(i).getJourneyStatus());
                                System.out.println("Booking Date :"+passenger.getTicket().get(i).getBookingDate());
                                System.out.println("======================================== \n");
                                thereIsNoTicket=false;
                            }
                        }
                        if(thereIsNoTicket){
                            System.out.println("There is no completed ticket");
                        }
                    }

                }
                if(choice==3){
                    if (passenger.getTicket().isEmpty()) {
                        System.out.println("You have not booked any ticket yet");
                    }
                    else {
                        for (int i = 0; i < passenger.getTicket().size(); i++) {
                            System.out.println("========================================");
                            System.out.println("\t\t\t" + (i + 1) + ".YOUR TICKET");
                            System.out.println("Name :" + passenger.getTicket().get(i).getPassenger().getPassengerName());
                            System.out.println("Phone No :" + passenger.getTicket().get(i).getPassenger().getPhoneNumber());
                            System.out.println("Source :" + passenger.getTicket().get(i).getSource());
                            System.out.println("Destination :" + passenger.getTicket().get(i).getDestination());
                            System.out.println("Journey Statues :" + passenger.getTicket().get(i).getJourneyStatus());
                            System.out.println("Booking Date :" + passenger.getTicket().get(i).getBookingDate());
                            System.out.println("======================================== \n");
                        }
                        System.out.println("Enter your choice for updating your journey status");
                        int choiceForUpdate= scanner.nextInt()-1;
                        if(passenger.getTicket().get(choiceForUpdate)!=null){
                                System.out.println("1.Yet to travel\n2.Currently active\n3.Journey Completed");
                                System.out.println("Enter Your journey status");
                                String journeyStatus=scanner.next();
                                if(journeyStatus.equals("1")){
                                    passenger.getTicket().get(choiceForUpdate).setJourneyStatus("Yet to travel");
                                }
                                else if(journeyStatus.equals("2")){
                                    passenger.getTicket().get(choiceForUpdate).setJourneyStatus("Currently active");
                                }
                                else if (journeyStatus.equals("3")) {
                                    passenger.getTicket().get(choiceForUpdate).setJourneyStatus("Journey completed");
                                }
                                else {
                                    System.out.println("Your opt for Updating the Journey Status is wrong");
                                }
                        }
                        else{
                            System.out.println("For your Option there is no Ticket for updating the journey status");
                        }
                    }
                }
                if(choice==4){
                    if (passenger.getTicket().isEmpty()) {
                        System.out.println("You have not booked any ticket yet");
                    }
                    else {
                        for (int i = 0; i < passenger.getTicket().size(); i++) {
                            System.out.println("========================================");
                            System.out.println("\t\t\t" + (i + 1) + ".YOUR TICKET");
                            System.out.println("Name :" + passenger.getTicket().get(i).getPassenger().getPassengerName());
                            System.out.println("Phone No :" + passenger.getTicket().get(i).getPassenger().getPhoneNumber());
                            System.out.println("Source :" + passenger.getTicket().get(i).getSource());
                            System.out.println("Destination :" + passenger.getTicket().get(i).getDestination());
                            System.out.println("Journey Statues :" + passenger.getTicket().get(i).getJourneyStatus());
                            System.out.println("Booking Date :" + passenger.getTicket().get(i).getBookingDate());
                            System.out.println("======================================== \n");
                        }
                            System.out.println("Enter your choice for Canceled the ticket");
                            int choiceForCanceled = scanner.nextInt()-1;
                            if(passenger.getTicket().get(choiceForCanceled)!=null) {
                                if(passenger.getTicket().get(choiceForCanceled).getJourneyStatus().equals("Yet to travel")){
                                    passenger.getTicket().remove(choiceForCanceled);
                            }
                                else {
                                    System.out.println("You can't able to Canceled ticket");
                                }
                            }
                            else {
                                System.out.println("There is no ticket for your choice");
                            }


                    }

                }
                if(choice==5){
                    System.out.println("Thanks For using it");
                }

            }
        }
    }
}