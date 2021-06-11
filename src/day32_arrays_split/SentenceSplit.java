package day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String Sentence = "java is fun";
        String [] words = Sentence.split(" ");
        System.out.println("1s word = " + words[0]);
        System.out.println("2nd word = "+ words[1]);
        System.out.println("3rd word = " +words[2]);

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] Result = googleResult.split(" ");
        System.out.println("count = " + Result[1]);
        System.out.println("Seconds = " + Result[3].replace("(",""));
        System.out.println("Seconds = " + Result[3].substring(1));


        }
    }
