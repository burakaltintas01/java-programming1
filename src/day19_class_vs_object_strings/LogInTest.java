package day19_class_vs_object_strings;

public class LogInTest {
    public static void main(String[] args) {
        String expUsername = "cybertek";
        String expPassword = "Abc123";
        String username = "CYBERTEK";
        String password = "Abc123";

        if (expUsername.equalsIgnoreCase("cybertek") && expPassword.equalsIgnoreCase("abc123")) {
            System.out.println("Pass - user succesfully logged id");

        }else if (expUsername!="cybertek") {
            System.out.println("incorrect username");
        }else {
            System.out.println("incorrect password");
        }
        }
    }
