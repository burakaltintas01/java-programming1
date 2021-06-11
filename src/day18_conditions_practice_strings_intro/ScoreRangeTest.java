package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 600;
        if (score > 1 && score < 55) {
            System.out.println("D");
        }
        if (score > 56 && score < 65) {
            System.out.println("C");
        }else if(score > 66 && score < 75) {
            System.out.println("B");
        }
        if (score > 76 && score < 100) {
            System.out.println("A");
        }else {
            System.out.println("invalid");
        }

    }
}


