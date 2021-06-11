package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String word = "java is fun";
        String [] NewWord = word.split(" ");
        for(int i= NewWord.length -1 ;i>=0 ; i--){
            System.out.print(NewWord[i] + " ");
        }
}
    }
