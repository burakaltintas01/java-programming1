package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "audi";
        String model = "rs";
        double leasePrice = 0.0;
        if (make.equals("Mercedes") && model.equals("EClass")) {
            leasePrice = 500.0;
        }else if (make.equals("Mercedes") && model.equals("CClass")) {
            leasePrice = 400.0;
            System.out.println("make is" + make +" model is " + model + " and price is " + leasePrice);

        }else if (make.equals("audi") && model.equals("rs"))
            System.out.println("invalid amk");

    }

}
