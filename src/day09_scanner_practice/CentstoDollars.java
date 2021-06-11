package day09_scanner_practice;
import java.util.Scanner;

public class CentstoDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cents = scan.nextInt();
        int dollars = (cents / 100);
        int remaining = cents % 100;
        int num = scan.nextInt();
        System.out.println("in "+ cents + " cents : " + " there is "+ dollars + " dollars, and " + remaining + " and cents remains");
        // soutv enter is System.out.println()




    }
}
