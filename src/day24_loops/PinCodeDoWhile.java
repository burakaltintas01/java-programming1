package day24_loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your account");
        int secretPincode = 1234;
        int pincode ;

        do {
            System.out.println("enter pincode");
            pincode= scan.nextInt();
        }    while (secretPincode != pincode) ;

    }
}
