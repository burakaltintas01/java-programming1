package day14_multi_branch_if_statements;

public class CalculatorVersion1 {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 6;
        char operator = '/';
     if(operator=='+') {
         System.out.println(num1 + num2);
     }else if (operator=='-') {
         System.out.println(num1 - num2);
     }else if (operator=='*') {
         System.out.println(num1 * num2);
     }else if(operator=='/') {
         System.out.println(num1/num2);
     }
     System.out.println("Result ");
        }
    }
