class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    void assignCargo(String cargo) {
        try {
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo for Rectangular bogie");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo + " to " + type);
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed");
        }
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        System.out.println("Program continues...");
    }
}