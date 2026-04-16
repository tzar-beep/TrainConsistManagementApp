import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<GoodsBogie> goods = new ArrayList<>();
        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goods.add(new GoodsBogie("Rectangular", "Coal"));
        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = goods
                .stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        System.out.println("Train Safety Compliance: " + isSafe);
    }
}