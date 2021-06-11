package day29_nestedloop_arrays;

public class StarsNestedLoops {
    public static void main(String[] args) {

        for (int star = 0; star <= 5; star++) {
            for (int star1 = 0; star1 < 10; star1++) {
                System.out.print("*" + " ");
            }
                System.out.println();
        }
        for(int outter  =1 ; outter<=10 ; outter++){
            for (int inner = 1; inner <= outter ; inner++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
