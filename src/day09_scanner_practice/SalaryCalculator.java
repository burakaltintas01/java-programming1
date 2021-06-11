package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Salary Calculation");
        double hourlyRate =40;
        double weeklyPay = hourlyRate*40;
        double monthlyRate = weeklyPay*52/12;
        double annualPay = monthlyRate*12;
        System.out.println(hourlyRate);
        System.out.println(weeklyPay);
        System.out.println("$"+monthlyRate);
        System.out.println("$"+annualPay);


       //double hourlyRate = scan.nextInt();
        //double monthlyRate =scan.nextInt();
        //double monthlyPay = scan.nextInt();
        //System.out.println("Your payment is "+"$" + annualPay);
    }
}
