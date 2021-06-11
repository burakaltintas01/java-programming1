package day16_Switch_Ternary;
import java.util.Scanner;
public class AdaireApartments {
    public static void main(String[] args) {
        int numberOfBedrooms = 1;
        Scanner scan = new Scanner(System.in);
        double startingprice = 0;
        numberOfBedrooms = scan.nextInt();
        switch (numberOfBedrooms){
            case (0):
                System.out.println("Studio Apartment Selected");
            startingprice = 1454;
            break;
            case (1):
                System.out.println("1 bedroom selected");
                startingprice = 1725;
                break;
            case (2):
                System.out.println("2 bedroom selected");
                startingprice =2899;
                break;
            default:
                System.out.println("Unavailable");
        }
        System.out.println("Welcome on board");
    }
}
