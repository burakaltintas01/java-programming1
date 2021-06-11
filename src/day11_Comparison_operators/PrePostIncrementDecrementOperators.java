package day11_Comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 1;
        num1 ++;
        System.out.println(num1);
        //Pre Increment
        int num7 = 5;
        int num8 = ++num7;

        System.out.println("num7 = "+ num7);
        System.out.println("num8 = "+num8);

        // Post - Increment
        int num3 =4;
        int num4 = num3++;
        System.out.println("num3 =" + num3);
        System.out.println("num4 ="+num4);
        
        int myNumber = 44;
        myNumber++;
        System.out.println("myNumber = " + myNumber);
        ++myNumber;
        System.out.println(myNumber);

        int newNumber= 20;
        System.out.println(++newNumber); //adding first then printing

        int newNumber1 = 25;
        System.out.println(newNumber1++);
        
        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("c = " + c);
        
        
    }
}
