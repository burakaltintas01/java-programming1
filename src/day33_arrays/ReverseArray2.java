package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
       /* int [] nums = {3,5,30,100};
        int temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;
        System.out.println(temp);*/



        int[] nums2 = {5, 10, 4, 100};

        System.out.println("Before: " + Arrays.toString(nums2));
        //2
        for(int i = 0; i < nums2.length/2; i++) {
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2;
        }
        System.out.println("After: " + Arrays.toString(nums2));

        System.out.println("--------String Array-----");
        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
        // i -> 2, j -> 2                     2
        for(int i = 0, j = words.length-1; i < words.length/2; i++, j--) {
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }

        System.out.println("words after reverse = " + Arrays.toString(words));
    }
}
