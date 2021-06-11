package day22_String_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
       String word = "hello";
        //word=word.substring(0,2);
        //System.out.println(word);
        word = word.substring(1, 4);
        System.out.println(word);

        String input = "java is fun";
        //input = input.substring(0, 4);
       // System.out.println("input - " + input);
        System.out.println(input.substring(5,7));
        System.out.println((input.substring(8,11)));
        System.out.println(input.substring(3));
        System.out.println(input.substring(5));
    }
}
