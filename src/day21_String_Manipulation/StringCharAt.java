package day21_String_Manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        String name = "Burak";
        System.out.println("first letter= " +name.charAt(0));
        char first = name.charAt(0);
        char second= name.charAt(1);
        char third = name.charAt(2);
        char fourth = name.charAt(3);
        char fifth = name.charAt(4);
        System.out.println(first+" "+second+" "+third+" "+fourth+" "+fifth);
        String withSpace = first+" "+second+" "+third+" "+fourth+" "+fifth;
        System.out.println("withSpace = " + withSpace);

        String w1 = "mom";
        System.out.println(w1.charAt(0));
        char one = w1.charAt(1);
        char two = w1.charAt(2);
        char three = w1.charAt(3);
        if(first==three) {
            System.out.println("first and third matches");
        }else {
            System.out.println("First and third dosen't match");
        }


    }
}
