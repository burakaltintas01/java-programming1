package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
       int num1 = 300;
       byte b1 = (byte)num1;
       short shNum = (short)num1;
       long lNum1 = (long)num1;
       System.out.println(shNum);
        //System.out.println(b1);
        /* The above line will show error , because int is larger data type than byte. Even though the value is only 4.
        In order to make it work, we need to case it . */
    }
}
