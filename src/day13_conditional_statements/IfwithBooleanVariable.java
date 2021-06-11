package day13_conditional_statements;

public class IfwithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry) {
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Then code java");
        } else {
            System.out.println("I am not hungry , I will keep coding java");
        }
        double price = 230.44;
        boolean isAffordable = price<= 200.0;
        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable == true) {
            System.out.println("I can afford it, lets buy!");
        } else {
            System.out.println("Too expensive, lets keep coding java");
        }
        boolean isRemoteJob = false;
        if(isAffordable == false) {
            System.out.println("Sorry not interested");
        } else {
            System.out.println("Sure I am interested, what is the interview process ? ");
        }
    }
}


