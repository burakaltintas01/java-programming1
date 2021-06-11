package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        int budget = 5000;
        String model = "Tesla";
        int carPrice = 4500;
        if (budget >= carPrice && model.equals("Honda") || model.equals("Toyota") || model.equals("Tesla")) {
            System.out.println("Ready to purchase model " +model + " price, " + "$" + carPrice);
        } else if (budget <= carPrice) {
            System.out.println("I can't buy it");
        }
    }
}