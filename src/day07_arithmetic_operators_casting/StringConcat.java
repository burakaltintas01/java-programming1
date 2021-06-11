package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args){
        System.out.println("java" + 5 + 3);
        System.out.println("java" + (5+3));
        System.out.println(5+3+"java");

        int num1 = 7;
        int num2 = 8;

        System.out.println(num1+" "+num2); // to leave a blank; put quotes and press space.
        System.out.println(num1+""+num2); // To type 78 without blank, we put quotes with no space.

        char char1 = 'j';
        char char2 = 'f';
        System.out.println(char1 + char2); // when we add plus chars, it will add from ASCII table.

        System.out.println(char1+""+char2); // to just print jf without numbers, put double quotes.
        System.out.println(""+char1+char2);
    }
}
