package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
            int num = 0;
        for(int i =0 ; i<=10 ; i++){
            if(num<1 || num>10) {
                System.out.println("Error");
                return;
            }else {
                System.out.println(num+"x"+i +"=" +i*num);
            }
        }
    }
}
