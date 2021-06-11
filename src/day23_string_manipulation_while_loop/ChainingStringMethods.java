package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ","").toUpperCase());
        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));
        String city1= "ISTANBUL";
        System.out.println(city1.substring(0,1).toUpperCase()+city1.substring(1).toLowerCase());

        System.out.println(city.equals(city1));

    }
}
