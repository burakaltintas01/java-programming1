package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'z';
        /*System.out.println(letter);
        letter++;
        System.out.println(letter);*/
        while ((letter >= 'a')){
            System.out.print(letter + " ");
            letter--;
        }
    }
}
