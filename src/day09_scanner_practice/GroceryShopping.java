package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Recipt");

        double milk = scan.nextDouble();
        System.out.println("Enter price for the milk");

        double bread = scan.nextDouble();
        System.out.println("Enter price for the bread");

        double yataydoner = scan.nextDouble();
        System.out.println("Enter price for yataydoner");

        double total = yataydoner+bread+milk;
        double total1= scan.nextDouble();
        System.out.println("Enter price for total $"+ total);


    }
}
