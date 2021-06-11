package day30_arrays;

public class LoopingBackWithArrays {
    public static void main(String[] args) {
        int[] data1 = {61, 644, 15, 5454, 22, 123, 543, 999, 321, 3};
        for (int idx = data1.length -1; idx >= 0; idx--) {
            System.out.print(data1[idx] + " ");
        }
    }
}
