package day29_nestedloop_arrays;

public class ARRAYSINTRO {
    public static void main(String [] args){
        int num = 10; // single variable
        int [] nums =new int[3];// array variable
        nums [0] = 5;
        nums [1] = 7;
        nums [2] = 10;
        System.out.println(nums[0]);
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " +nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);
        System.out.println("number of elements = " + nums.length);

        int len = nums.length;
        //-----------------------------------

        int [] num1 = {234 , 12 , 654 , 343 , 545 , 98 , 879};
        System.out.println(num1.length);




    }
}
