package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Trabzon";
        double salary = 120_000.0;
        boolean remote= false;
        boolean benefits = true;

       if (location.equals("Trabzon") && salary <=120_000.0 && remote && benefits) {
           System.out.println("Accept the job if all requiremens apply");
       } else {
           System.out.println("Say \"uza\"");

        }
    }
}
