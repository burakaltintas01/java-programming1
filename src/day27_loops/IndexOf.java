package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'a';
        int index = -1;

        for (int n = 0; n < word.length(); n++) {
            if (word.charAt(n) == letter) {
                index = n;
                System.out.println(letter + " is found at index " + index);
            }else {
                System.out.println("not found");
            }

        }
        if(index == 1){
            System.out.println(letter + "is not present");
        }
    }
}
