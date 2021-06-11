import java.util.Scanner;


public class rent {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        int areaCode = scan.nextInt();
        int localNumber = scan.nextInt();
        //WRITE YOUT CODE HERE:
        String phoneNumber = scan.next();
        System.out.println("Calling number " + phoneNumber);
        scan.close();
    }
}