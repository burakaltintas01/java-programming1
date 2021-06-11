package day16_Switch_Ternary;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size1 = "Venti";
        double price =3.69;
        int calories = 90;
        switch (size1){
            case "tall":
                System.out.println("Tall cappucino is " + "$"+price + " and its " + calories + " calories");
                price =3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande Cappucino please");
                price = 3.99;
                calories = 120;
                break;
            case "Venti":
                System.out.println("Venti Cappucino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don't serve that. ");
                break;

        }
        System.out.println("Total price is "+ price);
        System.out.println("Hope to see you again");

    }
}