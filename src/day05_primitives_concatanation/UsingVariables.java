package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int a =20;
        int b = a;
        System.out.println(b);

        int n1 = 20;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n2);

        n1 = 15;
                System.out.println(n1);
                System.out.println(n3);
        n3 = 85;
        System.out.println(n3);
    }
}
