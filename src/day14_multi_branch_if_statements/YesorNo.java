package day14_multi_branch_if_statements;

public class YesorNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file ?");
        char selection = 'y';
        boolean answer;
        String result;
        if('y' == selection) {
            System.out.println("Your file will be deleted.");
            answer = true;
            result = "deleted";
        } else {
            System.out.println("Your file will remain");
            answer = false;
            result = "not deleted";
        }

        System.out.println("did file get deleted ? "+ answer);
    }
}
