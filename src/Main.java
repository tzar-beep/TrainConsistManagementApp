import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        List<Bogie> filteredBogies = bogies
                .stream()
                .filter(b -> b.capacity > 60)
                .toList();

        System.out.println("Filtered Bogies (capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }
    }
}