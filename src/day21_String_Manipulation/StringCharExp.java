package day21_String_Manipulation;

public class StringCharExp {
    public static void main(String[] args) {


        String word = "aziza";
        char firstletter = word.charAt(0);
        char lastletter = word.charAt(word.length() - 1);
        System.out.println(firstletter);
        System.out.println(lastletter);

        if(firstletter==lastletter) {
            System.out.println("they match");
        }else {
            System.out.println("they dont match");
        }
    }
}
