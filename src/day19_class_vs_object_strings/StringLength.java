package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String name = "Burak";
        System.out.println("count "+ name.length());
        System.out.println("Burak".length());

        String password = "abc123";
        if(password.length()>=6) {
            System.out.println("Valid Amazon password");
        }else {
            System.out.println("Invalid password");
        }
    }
}
