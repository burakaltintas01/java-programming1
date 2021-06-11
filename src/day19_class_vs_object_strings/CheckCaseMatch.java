package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String country = "usa";
        if (country.equals(country.toUpperCase())) {
            System.out.println(country.toUpperCase());
        }else {
            System.out.println(country);
        }
    }
}
