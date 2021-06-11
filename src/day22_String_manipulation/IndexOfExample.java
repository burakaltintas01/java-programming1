package day22_String_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        int idxOfCss = technologies.indexOf("html");
        System.out.println("ccs is at index " + idxOfCss);

        int indexOfCucumber= technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql");
        System.out.println("sql is at index " + indexOfSql);

        if(technologies.indexOf("maven")>-1) {
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");
        }
    }
}
