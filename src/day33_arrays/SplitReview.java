package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
         String word = "java";
         String [] array = word.split("a");
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        String word1 = "JAVA";
        String [] strArr = word1.split("");
        System.out.println(Arrays.toString(strArr));


        String newWord= "java1sql2html";
        String [] StrArr = newWord.split("\\d"); // "//d" splits the number from sentence.
        System.out.println(Arrays.toString(StrArr));

        System.out.println("=======Matches Method========");  // just some example
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
