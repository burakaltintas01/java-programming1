package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] num = {33,55,123,400};
        System.out.println(Arrays.binarySearch(num , 55));
        System.out.println(Arrays.binarySearch(num , 123));

        System.out.println("********");
        int[] nums = {-5 ,23, 123, 654, 2344, 12345, 14421}; // to use binary search , it has to be sorted first
        System.out.println(Arrays.binarySearch(nums, 23)); //1
        System.out.println(Arrays.binarySearch(nums, 2344));//4
        System.out.println(Arrays.binarySearch(nums, 25)); //-3
        System.out.println(Arrays.binarySearch(nums, 700)); //-5
        System.out.println(Arrays.binarySearch(nums, -5)); //0

        //check if number 12345 is among numbers in array
        if(Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present");
        }
    }
}