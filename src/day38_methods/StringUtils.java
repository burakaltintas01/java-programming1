package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtils {
    public static void main(String[] args) {
        String word = null;
       System.out.println(isNullorEmpty(word));
        word = "";
        System.out.println("isNullorEmpty(word) = " + isNullorEmpty(word));
        String str = "";
        System.out.println("isPalindrom() = " + isPalindrom(str));



    }
    public static boolean isNullorEmpty(String str){
        if(str==null || str.isEmpty()) {
            return true;
        }return false;
    }
    public static boolean isPalindrom(String str){
        str = str.toLowerCase();
        for(int i =0 ; i<str.length()/2 ; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void ArrayUtills(int [] nums){
        for(int i = 0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
        public static void printArray(int[] nums) {
            for(int num : nums) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    public static boolean contains(int[] nums, int num) {
        boolean found = false;
        for(int each : nums) {
            if(each == num) {
                found = true;
                break;
            }
        }
        return found;
    }
}

