package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("int"));
        System.out.println(word.startsWith("sad"));
        System.out.println(word.endsWith("dea"));
        System.out.println(word.endsWith("fekae"));
        System.out.println(word.endsWith("ntellij idea"));

        String name = "Burak";
        if (name.endsWith("rak")) {
            System.out.println("its my name");
        } else {
            System.out.println("i guess its not");
        }
        String firstName = "Dr.Sude";
        if (firstName.startsWith("Dr")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mr")) {
            System.out.println("man");
        } else if (firstName.startsWith("Mrs")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms")) {
            System.out.println("single woman");
        } else {
            System.out.println("Senior");
        }
        String url = "stackoverflow.com.gov";
        if(url.startsWith("tack")) {
            System.out.println("good");
        }else if (url.endsWith("ru")) {
            System.out.println("davay davay");
        }else if (url.endsWith("gov")) {
            System.out.println("devlet isi yegenim");
        }else if (url.endsWith("edu")) {
            System.out.println("okuyom ben");
        }else{
            System.out.println("organizasyon baskan");
        }
    }
}
