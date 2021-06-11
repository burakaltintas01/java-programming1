package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {

    String word ="CyBerTek";
        System.out.println("school");
        System.out.println(word.toLowerCase());
        System.out.println("java".toLowerCase());
        System.out.println("school".toUpperCase());
        String wordinLcase = word.toLowerCase();
        System.out.println("wordInLCase =" + wordinLcase);

        word = word.toLowerCase();
        System.out.println("word =" + word);
        word = word.toUpperCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        company = company.toUpperCase();
        System.out.println("company = "+ company);
        System.out.println("amazon".toUpperCase());
    }
}
