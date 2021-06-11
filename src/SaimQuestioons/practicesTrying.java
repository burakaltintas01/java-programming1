package SaimQuestioons;

import day35_methods_with_param.count;

import java.util.Arrays;

public class practicesTrying {
    public static void main(String[] args) {
        int count = 0;
        String str = "Javascript is a fun language";
        char word = 'a';
        for (int i = 0; i < str.length(); i++){
            if(word==str.charAt(i)){
                count++;
            }
        }
        System.out.println("there are " + count + " \"a\"" + " in the " + str);

    }
}