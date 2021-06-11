package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String word = "JaVa iS FuN";
       for(int i =0 ; i<word.length(); i++){
           if(Character.isUpperCase(word.charAt(i))){
               System.out.print(word.charAt(i));
           }
       }               System.out.println();

        System.out.println(Boolean.TRUE);
        String total = "345";              /// converting String into int

    }
}
