package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithLists {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>(Arrays.asList("java","apple","coffee","tea"));
        printStrList(word);
        List<Integer>  nums = Arrays.asList(23,54,23,54554,234,11,5,2);
        int sum = sumIntegerList(nums);
        System.out.println(sum + " ");

    }

    public static void printStrList(List<String> words) {

        List<String> word = new ArrayList<>(Arrays.asList("java","apple","coffee","tea"));

        for (String each : word) {
            System.out.print(each +" ");

        }
        System.out.println();
    }
    public static int sumIntegerList(List<Integer> ListOfIntegers) {
        int sum = 0;
        for(int each : ListOfIntegers){
            sum+=each;
        }
        return sum;
    }
}
