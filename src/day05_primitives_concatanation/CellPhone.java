package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String model = "Iphone";
        String color = "black";
        float price = 999.99F;
        String storage = "64 ";
        Boolean isUsed = true;
        System.out.println("model,\n color,\n price,\n storage,\n isUsed");
        // CONCETATION OPERATOR + *******************
        String city = "Trabzon";
        System.out.println("city is "+city);

        String brand = "Iphone";
        System.out.println("brand is " +brand);
        System.out.println("Storage is "+ storage + "GB");
        System.out.println("float price is " +price + "dollar ");
    }
}
