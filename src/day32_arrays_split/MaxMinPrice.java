package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        double maxPrice = prices[0];
        double minPrice = prices[0];
        for(int i = 0 ; i<items.length ; i++){
            if(prices[i]>maxPrice){
                maxPrice=prices[i];
                if(prices[i]<minPrice){

                }


            }
        }
        System.out.println(Arrays.toString(items));
        System.out.println((Arrays.toString(prices)));
        System.out.println("max price = " + maxPrice);
        System.out.println("min price = " + minPrice);
    }
}
