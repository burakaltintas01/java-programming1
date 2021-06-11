package day24_loops;
import java.util.Scanner;
public class CountUntil {
    public static void main(String[] args) {
        int numberToStop = 22;
        int start = 80;
        while (start >= numberToStop) {
            System.out.print(0 + start + " ");
            start -= 2;

        }
    }
}
