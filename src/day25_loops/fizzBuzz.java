package day25_loops;

public class fizzBuzz {
    public static void main(String[] args) {
        for (int i =0; i<=100 ; i++){
            if(i%5==0 && i%3==0 ){
                System.out.println(i+" FizzBuzz");
            }
            else if(i%5==0) {
                System.out.println(i+" buzz");
            }
            else if(i%3==0)
                System.out.println(i+" fizz");
            }
        }
    }
