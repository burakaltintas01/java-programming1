package day13_conditional_statements;

public class NiceDayorNot {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 5000;
        if (salesAmount <= 2000) {
            System.out.println("Good job you qualified for bonus");
            bonus = 50.0;
        } else {
            System.out.println("Great job,you are qualified for full bonus");
            bonus = 100;
        }
        System.out.println("Your total bonus is " + "$" + bonus); // ctrl+alt+l to make it look better

    }
}

