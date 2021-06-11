package SaimQuestioons;

import java.util.Scanner;

public class replit1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter subject name number 1 and score for this subject");
        String Math = scan.next();
        Double ave = scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String bio = scan.next();
        Double bio1 = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String Eng = scan.next();
        Double Eng1 = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String Che = scan.next();
        Double che1 = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String music = scan.next();
        Double music1 = scan.nextDouble();
        System.out.println();
        System.out.println("Summary: " + Math + "-" + ave + "," + bio + "-" + bio1 + "," + Eng + "-" + Eng1 + "," + Che + "-" + che1 + "," + music + "-" + music1);
        System.out.println("Your average score is :" + (ave + bio1 + Eng1 + che1 + music1) / 5);
        System.out.println("Thank you for using Grader");
        System.out.println("Goodbye!");


    }
}
