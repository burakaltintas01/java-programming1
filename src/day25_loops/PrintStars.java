package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int number = 15; number >= 0; number--) {
            System.out.print('*');
        }
        System.out.println();

        String myStars = "";
        for (int i = 1; i <= 5; i++) {
            myStars += "*";
            System.out.print("my stars = " + myStars.trim());


        }
    }
}
