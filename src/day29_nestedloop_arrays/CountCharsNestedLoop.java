package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for(int inner = 0 ; inner <word.length() ; inner++){
            for(int outter = 0 ; outter<word.length() ; outter++ ){
                char innerChar = word.charAt(inner);
                char outerChar = word.charAt(outter);
                if(inner==outter){
                    System.out.println(innerChar + "=" +inner);
                }

            }
        }
    }
}
