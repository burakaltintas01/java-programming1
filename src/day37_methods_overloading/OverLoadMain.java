package day37_methods_overloading;

public class OverLoadMain {
    public static void main(String[] args) {
        System.out.println("hello");
        main(5);
    }
    public static void main(int nums){
        System.out.println("num = " + nums);
    }
}
