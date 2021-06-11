package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.equals(" "));
        if("".equals(jobTitle)) {
            System.out.println(jobTitle.equals(" "));
        }else {
            System.out.println("job title is not empty");
        }
        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        if(!veggie.isEmpty()){
            System.out.println("We have carrot");
        }
        String word5= "java";
        System.out.println(word5.contains("v"));
        System.out.println(word5.contains("ja"));
        System.out.println(word5.contains("ke"));
    }
}
