package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "java";
        for(int i =0 ; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
        for(int a =3;a>=0 ;a--){
            System.out.println(a+ " - " + word.charAt(a));
        }
    }
}
