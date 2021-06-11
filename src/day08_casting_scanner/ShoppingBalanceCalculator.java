package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[]args){
        //byte num1 =100;
        //short num2 =num1;
        //int num3 = num1;
        int num4 =1000;
        long num5 = num4;
        float num6 =124.4F;
        double num7 = num6;
        
        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);
        System.out.println("num9 = " + num9);
        byte num1=100;
        //short num2 = num1;
       // System.out.println("num2 = " + num2);
        short num2 =(byte)num1;
        System.out.println("num2 = " + num2);
        float var1 = 154.45F;
        double var2 = var1;
        int var3 = (int)var2;
        System.out.println("var2 = " + var2);
        
    }
}
