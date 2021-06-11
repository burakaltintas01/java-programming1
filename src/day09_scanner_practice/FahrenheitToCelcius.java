package day09_scanner_practice;
import java.util.Scanner;


public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Weather");

        double fahrenheit = scan.nextDouble();

        double celcius = (fahrenheit-32)*5/9;

        System.out.println(fahrenheit +" fahrenheit is "+ celcius + " celsius ");

        double celsius = scan.nextDouble();
        double fahremheit =(celsius * 9/5) + 32;

        System.out.println(celsius+ " celsius is " + fahremheit + " fahrenheit");



    }
}
