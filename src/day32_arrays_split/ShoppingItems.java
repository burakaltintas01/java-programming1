package day32_arrays_split;

import java.util.Arrays;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("------FIND THE INDEX OF Gloves in items array------");
        for(int i =0 ; i<items.length ; i++){
            if(items[i].equals("Gloves")){
                System.out.println("Glove found at index " + i);
            }
        }
        System.out.println("----- set boolean to true if first 'Ipad' is found");
        boolean IpadExists = false;
        for(int i = 0 ; i<items.length ; i++){
            if(items[i].equals("iPad"));
            IpadExists = true;
            break;
        }
        System.out.println("ipad exist = " + IpadExists);


        System.out.println("-----LOOK FOR JACKET IN ITEMS AND PRINT ALL DETAILS----");
        for(int i=0 ; i <items.length ; i++){
            if(items[i].equals("Jacket")){
                System.out.println(items[i]+" "+ "$"+ prices[i]+" "+itemIDs[i]);
                break;
            }
        }
    }
}
