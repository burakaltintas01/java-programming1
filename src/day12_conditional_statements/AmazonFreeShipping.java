package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25) {
            System.out.println("Free shipping eligible" + "Your order total ; " +"$" + totalPrice);
        } else {
            System.out.println("No free shipping" );
        }
    }
}




