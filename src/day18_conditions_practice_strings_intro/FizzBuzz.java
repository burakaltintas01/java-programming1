package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        int fizz = 3;
        int buzz = 5;
        int fizzbuzz = 15;
        if(fizz % 3 == 0) {
            System.out.println("its dividable to 3 ");
        }else if(buzz % 5 ==0) {
            System.out.println("its dividable to 5");
        }else {
            System.out.println("it can dividable to 3 and 5");
        }
        int num = 60;
        if(num%3==0 && num %5==0) {
            System.out.println("FizzBuzz");
        }else if (num % 3 ==0) {
            System.out.println("Fizz");
        }else if(num % 5==0){
            System.out.println("Buzz");
        }
    }
}
