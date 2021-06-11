package day30_arrays;

public class LoopWithArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        for (int EachData : data) {
            System.out.println(EachData);
            System.out.println();
        }
        int[] data1 = {61, 644, 15, 5454, 22, 123, 543, 999, 321, 3};
        for (int i = 0; i < data1.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("********");

        System.out.println(data1[data1.length - 1]);
        for (int idx = data1.length - 1; idx <= 0; idx--) {
            System.out.print(data[idx] + " ");
        }
    }
}
