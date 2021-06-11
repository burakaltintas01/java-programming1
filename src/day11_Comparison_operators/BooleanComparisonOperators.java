package day11_Comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(5500 > 500);
        System.out.println(100<500);
        System.out.println(9<=10);
        System.out.println(50>= 45);
        System.out.println(-100!= 44);
        System.out.println();
        int a =100;
        int b =200;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a >=b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println( a != b);
        
        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);
        
        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result ="+ result);
        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);
        checkName = name!="Kuzzat";
        System.out.println("checkName = " + checkName);
        
        int age = 2;
        boolean noMoreToddler = age > 3;
        System.out.println("noMoreToddler = " + noMoreToddler);


        



    }
}
