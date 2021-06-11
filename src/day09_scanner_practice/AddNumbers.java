package day09_scanner_practice;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Variables");
        int num1 = 5;
        int num2=  4;
        int result = num1+num2;
        String finalResult = scan.next();
        System.out.println("result is ; " + result);

    }
}
