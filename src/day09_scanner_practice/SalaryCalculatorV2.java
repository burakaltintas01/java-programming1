package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("SalaryCalculator");
        double hourlyRate = scan.nextDouble();
        double weeklyRate = scan.nextDouble();
        double monthlyRate = scan.nextDouble();
        double annualyRate = scan.nextDouble();
        System.out.println("Salary at the end is " + annualyRate);
    }
}
