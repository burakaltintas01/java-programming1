package day25_loops;

public class SumofNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count ;
        for(int i =1; i<=100 ; i++ ){
            System.out.println(i);
            sum+= i;
        }
        System.out.println("sum " + sum);
    }

}
