package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int rent = 500;
        rent = 500 + 65;
        System.out.println("rent is " + "$"+rent);

        int pizzaSlicez = 8;
        pizzaSlicez = 8/2;
        System.out.println("pizzaSlicez left : " + pizzaSlicez);
        pizzaSlicez =pizzaSlicez+5;
        System.out.println("pizzaSlicez = " + pizzaSlicez);

    }
}