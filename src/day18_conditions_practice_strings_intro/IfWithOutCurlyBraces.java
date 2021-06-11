package day18_conditions_practice_strings_intro;

public class IfWithOutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "java";
        if (todayClass.equals("java")) { // added here curly bracelets to make the else statement work.
            System.out.println("java is fun");
        System.out.println("java is good");
    }else { // added curly bracelets to here for it to work, or else only 1 statement would ve work.
            System.out.println("java is cool");
        }
        int a = 1;
        if(a == 1)
            System.out.println("a = 1");
            System.out.println("1 is a");

    }
}
