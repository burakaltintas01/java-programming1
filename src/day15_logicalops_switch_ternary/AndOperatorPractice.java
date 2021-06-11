package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean freeShipping = true;
        boolean onSale = true;
        String itemName = "laptop";
        if(freeShipping&&onSale&&itemName.equals("laptop")) {
            System.out.println("add to cart : " + itemName);
        }else {
            System.out.println("Look for sale on " + itemName);
        }
        String location = "Trabzon";
        int salary = 4000;

    }
}
