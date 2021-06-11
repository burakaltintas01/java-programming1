package day42_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        App app1 = new App();
        System.out.println(app1.appName);

        app1.version = 15.00;

        app1.open("facebook");
    }
}
