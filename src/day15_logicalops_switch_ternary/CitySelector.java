package day15_logicalops_switch_ternary;

import javax.lang.model.SourceVersion;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("willing to move to " + city);
        } else {
            System.out.println("don't want to move" + city);
        }
        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("it is a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with Nadir");
        }
        String instructor = "Murodil";
        if (teacher.equals("Murodil") && teacher.equals("saim")) {
            System.out.println("java class with " + instructor);
        } else if (instructor.equals("nadir")) {
            System.out.println("soft skill class with " + instructor);
        }else if (instructor.equals("gurkan")) {
            System.out.println("some other teacher");


            String company = "quikfix";
            double salary = 120000;
            if (company.equals("Google") && salary >= 120000) {
                System.out.println("except that job");
            } else if (salary <= 100000) {
                System.out.println("its a good one bro take it");
            } else if (company.equals("quikfix")) {
                System.out.println("don't accept it");
            }
        }
    }
}
