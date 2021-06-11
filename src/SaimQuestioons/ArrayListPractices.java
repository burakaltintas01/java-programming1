package SaimQuestioons;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractices {
    public static void main(String[] args) {
        //FINDING TARGET WORD AND COUNTING HOW MANY TIMES WE HAVE IT IN THE ARRAYLIST


        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
        String targetWord = "java";

        int count = 0;

        for (String word : words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }
        System.out.println(targetWord + " was found " + count+ " times");

    }
}