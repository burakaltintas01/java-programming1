package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyurl();
        searchForWoodenSpoon();
        verifyResultsAredisplayed();
        System.out.println("--Etsy Search Smoke Test Completed - Pass--");
    }
    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyurl(){
        System.out.println("Navigating to https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("type \"WoodenSpoon\" and search");
    }
    public static void verifyResultsAredisplayed(){
        System.out.println("verify the results");
    }
}
