package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(155,44,658);
        addNumbers(65,85,15,15,65,32,45565,123123);
    }
    public static void addNumbers(int ... nums){
        int sum = 0;
        for(int n : nums){
            System.out.println("sum = " + n);
        }
    }
}
