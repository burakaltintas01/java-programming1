package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[]args){
        String model = "Mercedes";
        String name = "Burak";
        long licenseNum = 984657852;
        byte speed = 112;
        boolean isAutomatic = true;
        char LicenceClass = 'B';

        System.out.println("Model:            "+model);
        System.out.println("name:             "+name);
        System.out.println("License number:   "+licenseNum);
        System.out.println("Speed:            "+speed);
        System.out.println("Is it Automatic:  "+isAutomatic);
        System.out.println("License type:     "+LicenceClass);
        System.out.println(name + " is driving " +model);
        System.out.println("Current speed is " + speed+ " mph ");
        System.out.println("is car automatic "+ isAutomatic);
        System.out.println(LicenceClass+" "+isAutomatic);


    }

}
