package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if(grade=='A' || grade=='a' || grade=='B' ||grade=='a' ||grade=='C') {
            System.out.println("passed with grade");
        }else if (grade=='D'|| grade=='d') {
            System.out.println("qualify for retake");
        }else if (grade=='E') {
            System.out.println("fail");
        }else if (grade=='Z'){
            System.out.println("invalid grade");
        }
        }
    }
