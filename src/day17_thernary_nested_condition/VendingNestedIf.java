package day17_thernary_nested_condition;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "coke";
        String snack = "chips";
        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if(drink.equals("tea")) {
                System.out.println("tea is selected ");
            }else {
                System.out.println("coke is selected");
            }
        }else if (selection.equals(snack)) {
            System.out.println("snack is selected");
            if (snack.equals("chips")) ;
            System.out.println("chips is selected. ");
        }else {
            System.out.println("candy is selected");
        }
    }
}