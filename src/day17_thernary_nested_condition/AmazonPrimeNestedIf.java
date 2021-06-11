package day17_thernary_nested_condition;

public class AmazonPrimeNestedIf {
    public static void main(String[] args) {
        double price = 45;
        boolean isPrimeMember = true;
        if (isPrimeMember) {
            System.out.println("Eligible for 2 day shipping ");
        } else {
            if (price >= 25) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. Fee = $10. ");
            }
        }
    }
}
