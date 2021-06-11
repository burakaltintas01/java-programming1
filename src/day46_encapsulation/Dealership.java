package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
       // car1.model = "Nissan Altima";
        //car1.year = "2015";
        car1.setModel("nissan altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(5);
        System.out.println("car1 Year = " + car1.getYear());

        car1.setMileage(15.652);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa romeo Gulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("model = " +alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("mileage = " + alfaRomeo.getMileage());


    }
}
