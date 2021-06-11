package day21_String_Manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub", "lab"));
       word= word.replace("hub","lab");
        System.out.println(word);
        System.out.println(word.replace('i' , 'o').replace('b', 'q'));

        String sentence = "java is fun";
        //String withnoSpace = sentence.replace(""," ");
        //System.out.println(withnoSpace);
        sentence=sentence.replace("java","selenium").replace("fun","a lot of fun");
        System.out.println(sentence);
        String result = "1-48 of over 4.000 results for \"java book\"";
        result=result.replace("1-48 of over","").replace("results for \"java book\"","");
        System.out.println("result= "+result);
    }
}
