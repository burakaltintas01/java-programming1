package day36_methods_with_returns;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("sum = " + add(90,15));
        System.out.println("sum1 =" + minus(90,15));
      System.out.println("result =" + divide(100, 25));
        System.out.println("result = " + multiply(15,5));
    }
    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
    public static double minus(double num1 , double num2){
        double result = num1-num2;
        return  result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}

