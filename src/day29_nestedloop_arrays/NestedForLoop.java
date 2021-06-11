package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
       /* for(int minute = 1; minute<=5 ; minute++ ){
            System.out.println("minute= " + minute);
            for(int seconds =0 ; seconds<=59 ; seconds++){
                System.out.println("seconds =" + seconds);
                Thread.sleep(200);*/
        for(int minutes =0 ; minutes<=4 ; minutes++){
            System.out.println("minutes = " + minutes +"");
            for( int seconds = 0 ; seconds<= 59 ; seconds++){
                System.out.println(minutes +":"+ seconds);
            }
        }
    }
}
