package day18_conditions_practice_strings_intro;

public class MultiBranchif {
    public static void main(String[] args) {
        int number = 5;
        if(number>0) {
            System.out.println("positive");
        }else if(number<0) {
            System.out.println("negative");
        }else if(number==0){
            System.out.println("number is zero");

        }
    }
}
