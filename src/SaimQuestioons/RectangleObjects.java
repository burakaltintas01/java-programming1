package SaimQuestioons;

public class RectangleObjects {
    public static void main(String[] args) {
        rectangle rectangle = new rectangle();
        System.out.println(rectangle.getArea());
        rectangle.setDimensions(5, 3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);

        rectangle rectangle2 = new rectangle();
        System.out.println(rectangle2.getArea());
    }
}