package day17_thernary_nested_condition;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "plaid";
        //String trim1 = "plaid";
        //String trim2 = "plaid+";
        if (model == 'S') {
            System.out.println("Model S is selected");
            if (trim.equals("long range")) ;
            System.out.println("0-60mph is  3.1 sec.");
            if (trim.equals("plaid")) {
                System.out.println("plaid is selected ");
            } else {
                System.out.println("plaid + is selected");
            }
        }
    }
}