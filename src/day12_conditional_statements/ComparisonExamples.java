package day12_conditional_statements;
import java.util.Scanner;

public class ComparisonExamples {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        int currentSpeed = 45;
        System.out.println("What is your speed ?");
        int currentspeed = scan.nextInt()
        System.out.println("What is speed limit ?");
        int speedlimit = scan.nextInt();
        int speedLimit = 55;
        String speeimit = scan.nextLine();
        System.out.println("Are you speeding ?");
        System.out.println(currentSpeed> speedLimit);
        boolean isSpeeding = false;*/

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println(accountBalance >= itemPrice);
        boolean canAfford = accountBalance>= itemPrice;
        System.out.println("canAfford = " + canAfford);
        accountBalance-= itemPrice;
        System.out.println(accountBalance);

        boolean isBroke = accountBalance <=0;
        System.out.println("am I broke " + isBroke);
    }
    }