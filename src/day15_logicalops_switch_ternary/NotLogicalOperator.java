package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " +!true); // false
        System.out.println("!false = " + !false);  //false

        int age = 2;
        if(!(age < 7)) {
            System.out.println("Need to sit in child seat");
        }else {
            System.out.println("its ok");
        }
        boolean isSmokingAllowed = false;
        if(!(isSmokingAllowed)) {
            System.out.println("is allowed here");
        }else {
            System.out.println("It is still not allowed here");
        }
        String env = "qa";
        if(!(env.equals("qa"))){
            System.out.println("In wrong environment for QA testing ");
        }
        String carModel = "Tesla";
        if (!(carModel.equals("Tesla"))) {
            System.out.println("not interested");
        }else {
            System.out.println("Interested");
        }
        String secretPassword = "ABC123";
        String inputPassword  = "abc123";
        if((inputPassword.equals("abc123"))) {
            System.out.println("incorrect password");
        }
    }
}
