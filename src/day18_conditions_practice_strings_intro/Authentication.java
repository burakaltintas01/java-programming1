package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class Authentication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Last4SSN = 4565;
        int PinCode = 3898;
        int ExpLast4SSN = scan.nextInt();
        int ExpPinCode = scan.nextInt();
        if (ExpLast4SSN == Last4SSN) {
            System.out.println("Succesful");
        } else if (ExpLast4SSN != Last4SSN) {
            System.out.println("Unsuccesful");
        }
        if (ExpPinCode == PinCode) {
            System.out.println("pin code matches");
        } else if (ExpLast4SSN != PinCode) {
            System.out.println("Pin code dosen't match");
        }
    }

}
