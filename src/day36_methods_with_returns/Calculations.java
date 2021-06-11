package day36_methods_with_returns;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10+45 = " + Calculator.add(10,45) );
        System.out.println(("minus 90-10 = " + Calculator.minus(90,10)));
        System.out.println("multiply 15*10 = " + Calculator.multiply(15,10));
        System.out.println(("divide 75/15 = " + Calculator.divide(75,15) ));

        double d1 = 234.5;
        double d2 = 200.5;
        System.out.println(Calculator.minus(d1,d2));

        }
    }

