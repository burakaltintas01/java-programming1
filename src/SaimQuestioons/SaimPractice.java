package SaimQuestioons;

import java.util.ArrayList;
import java.util.Arrays;

public class SaimPractice {
    public static void main(String[] args) {
        //PRINTING THE WORDS WITH ONLY 4 OR LESS LETTERS
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple","java","loop","cat","animal","shortcut"));
        ArrayList<String>list2 = new ArrayList<>();

        for(String each : list){
            if(each.length()<= 4){
            list2.add(each);
            }

        }
        System.out.println(list2);
    }
}
