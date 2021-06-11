package day32_arrays_split;
import java.lang.reflect.Array;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "Java:python:selenium:html";
        String [] wordsArray =(words.split(":"));
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);

        String sentence = "today I am coding java arrays";
        for(String each : wordsArray){
            System.out.println(each);
        }
        String [] newSentence = (sentence.split(" "));
        System.out.println(Arrays.toString(newSentence));
        System.out.println("lenght of newSentence = " +newSentence.length);
        System.out.println(newSentence[0]);

        for(String each : wordsArray){
            System.out.println(each);
        }

    }
}
