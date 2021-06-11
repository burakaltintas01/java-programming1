package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Rent");
        double rent = scan.nextDouble();
        String month = scan.nextLine();
        System.out.println("$ " + rent + month+ "is my rent");

        System.out.println("How is the weather today?");
        String weather = "rainy";
        //String weather = scan.next();
        //String weather = scan.nextLine();
        System.out.println(weather + " - is a nice day today!");



    }
}
