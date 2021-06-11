package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int i = 8;
        i +=5;
        System.out.println("i = " + i);
        
        int cars = 10;
        System.out.println("cars = " + cars);
        
        cars = cars + 2;
        System.out.println("cars = " + cars);
        
        cars += 5+5*5;
        System.out.println("cars = " + cars);
        
        int electriccars = 13;
        electriccars += cars;
        System.out.println("electriccars = " + electriccars);
        
        String word = "java";
        System.out.println("word = " + word);
        
        word = word + " programming";
        word +=" is fun";
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);


        double parkingFee = 7.50;
        System.out.println("parkingFee = " + parkingFee);
        // earlybird fee is %50 off

        parkingFee /= 2;
        System.out.println("parkingFee = " + parkingFee);
        
        parkingFee -= 3.75;
        System.out.println("parkingFee = " + parkingFee);
        
        int count =2;
        count ++;
        System.out.println("count = " + count);
        
        int I =45;
        I --;
        System.out.println("I = " + I);


    }
}
