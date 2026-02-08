import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Passenger> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tWelcome to bus booking Application");
        System.out.println("\t\tLogin Or created the Account");
        System.out.println("Enter your Phone number");
        String PhoneNumber = scanner.next();
        if (list.isEmpty() == true) {
            System.out.println("Enter your Name");
            String Name = scanner.next();
            Passenger passenger = new Passenger(PhoneNumber, Name);
            list.add(passenger);
        }
    }
}
