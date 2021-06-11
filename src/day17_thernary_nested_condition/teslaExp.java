package day17_thernary_nested_condition;

public class teslaExp {
    public static void main(String[] args) {
        char model = '3';
        String trim = "Long Range";
        if (model == 'S') {
            System.out.println("Model S is selected");
            if (trim.equals("Long Range")) {
                System.out.println("Long Range");
                System.out.println("Range: 412");
                System.out.println("Top speed: 155mph");
                System.out.println("0-60- 3.1sec");
            } else if (trim.equals("Plaid")) {
                System.out.println("Plaid");
                System.out.println("Range: 412");
                System.out.println("Top speed: 155mph");
                System.out.println("0-60- 3.1sec");
            } else {
                System.out.println("Plaid+");
                System.out.println("Range: 412");
                System.out.println("Top speed:155mph");
                System.out.println("0-60- 3.1sec");
            }
        } else if (model == '3') {
            System.out.println("Model 3 is selected");
            if (trim.equals("Standard Range Plus")) {
                System.out.println("Standard Range Plus");
                System.out.println("Range:263");
                System.out.println("Top Speed: 140mph");
                System.out.println("0-60- 5.3sec");
            } else if (trim.equals("Long Range")) {
                System.out.println("Long Range");
                System.out.println("Range:263");
                System.out.println("Top Speed: 140mph");
                System.out.println("0-60- 5.3sec");
            } else {
                System.out.println("Performance");
                System.out.println("Range:263");
                System.out.println("Top Speed: 140mph");
                System.out.println("0-60- 5.3sec");
            }
        }
    }
}
