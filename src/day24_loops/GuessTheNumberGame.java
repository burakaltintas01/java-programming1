package day24_loops;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(11);
        int guessingNumber = 0;
        do {
            System.out.println("Guess the number");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("wrong, your number is too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, your number is too small");
            }
        }while (secretNumber != guessingNumber) ;

            System.out.println("Congratulations, you won! secret number: " + secretNumber);

    }
}
