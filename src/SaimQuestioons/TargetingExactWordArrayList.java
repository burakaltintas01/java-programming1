package SaimQuestioons;

import day35_methods_with_param.count;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetingExactWordArrayList {
    //THIS SHOWS HOW MANY TIMES 'J' WAS IN THE LIST

        public static void main(String[] args) {

            ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
            char targetLetter = 'j';

            int count = 0;

            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == targetLetter) {
                        count++;
                    }
                }
            }


            System.out.println(targetLetter + " was found " + count + " times");

        }
    }

