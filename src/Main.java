import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> consist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + consist.size());

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair: " + passengerBogies);

        System.out.println("Is Sleeper present? " + passengerBogies.contains("Sleeper"));

        System.out.println("Final passenger bogies: " + passengerBogies);
    }
}