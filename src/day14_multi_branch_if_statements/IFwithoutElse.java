package day14_multi_branch_if_statements;

public class IFwithoutElse {
    public static void main(String[] args) {
        int year = 2020;
        if (year == 2020) {
            System.out.println("Covid 19 Pandemic year");
            year++;
            System.out.println("Wear mask and keep distance" + "because we want to be safe in " + year++);
        }
        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Washington DC is capitol");
            System.out.println("White house is on Pennsylvania ave");
        }
        System.out.println("Welcome to " + country);

    }
}
