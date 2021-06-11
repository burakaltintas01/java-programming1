package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("Go to park");
        } else if (weather.equals("windy")) {
            System.out.println("Stay at home");
        }else if (weather.equals("rainy")) {
            System.out.println("Take umbrella");
    }
        System.out.println("Be careful");
}
}
