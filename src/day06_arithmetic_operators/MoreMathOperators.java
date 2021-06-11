package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[]args){
        int toyotas = 431;
        int honda = 233;
        int wv = 2;
        int tesla = 20;
        int nissan = 142;
        int bmw = 155;
        int totalCarsInParking = 983;
        System.out.println(toyotas+nissan+tesla+wv+bmw+honda);
        System.out.println("There are " + totalCarsInParking + " cars in parking lot");

        String pizza = "hawaiian pizza";
        int slices = 8;
        int people = 4;
        int sliceForEach = 2;
        int totalSlice = 12;
        System.out.println("slice per person is "+totalSlice/people);
        System.out.println("We ordered "+pizza +" with "+slices + " slices, "+people +" people "+"ate "+ sliceForEach +" for each. ");


    }
}
