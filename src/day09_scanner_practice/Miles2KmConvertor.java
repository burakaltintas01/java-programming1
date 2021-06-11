package day09_scanner_practice;
import java.util.Scanner;
public class Miles2KmConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Convertor");
        System.out.println("Enter miles");
        double miles = scan.nextDouble();
        double kilometers = miles*1.619;

        System.out.print(miles + " miles in  kilometers " + kilometers);



    }
}
