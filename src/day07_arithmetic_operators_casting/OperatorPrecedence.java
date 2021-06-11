package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[]args){
System.out.println(10+5);
System.out.println(10+5-3);
System.out.println(10-5+3);


System.out.println(2*3);
System.out.println(2*3/3);
System.out.println(20/(2*2));
//System.out.println(10/0); // dosent work.
        System.out.println(2+5*3);
        System.out.println((2+5)*3);
        System.out.println(10/3); // answer is just 3, java dosent show the 3.333 when you divide WHOLE NUMBERS
        System.out.println(10.0 / 3.0);
        System.out.println(5.0 / 2.0); // When its not a whole number, it shows exact.
    }

}
