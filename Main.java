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
            boolean thereIsExistingPassenger = true;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getPhoneNumber().equals(PhoneNumber)) {
                    System.out.println("welcome back"+  list.get(i).getPassengerName());
                    thereIsExistingPassenger = false;
                }
            }
            if (thereIsExistingPassenger) {
                System.out.println("Enter your Name");
                String Name = scanner.next();
                Passenger passenger = new Passenger(PhoneNumber, Name);
                list.add(passenger);
            }
        }
    }
}
