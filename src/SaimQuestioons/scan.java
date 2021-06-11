package SaimQuestioons;
import java.util.Scanner;
public class scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int second = scan.nextInt();
        String amOrPm = scan.next();
        System.out.println(hour + ":" + minute+":" + second + "PM");
    }
}