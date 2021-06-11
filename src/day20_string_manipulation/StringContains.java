package day20_string_manipulation;

import java.lang.annotation.IncompleteAnnotationException;
import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String word5 = "java";
        System.out.println(word5.contains("v"));
        System.out.println(word5.contains("ja"));
        System.out.println(word5.contains("ke"));
        String company = "Capital one";
        System.out.println(company.contains("i"));

        if(company.contains(" ")) {
            System.out.println("cikart birseyler");
        }else {
            System.out.println("cikartma");
        }
        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains(" | ")) {
            System.out.println("Pass- title check passed");
        }else {
            System.out.println("fail");
        }
        String firstName = "Burak";
        if(firstName.contains("a") & firstName.contains("u")) {
            System.out.println("samet bos yapma");
        }else {
            System.out.println("nargileni cek");
        }
        String secondName = "Samet";
        if(secondName.equalsIgnoreCase("Samet") && secondName.contains("s")) {
            System.out.println("nice");
        }else {
            System.out.println("not nice");
        }
        if(secondName.toLowerCase().contains("s")) {
            System.out.println("great");
        } else {
            System.out.println("not great");
        }
    }
}
