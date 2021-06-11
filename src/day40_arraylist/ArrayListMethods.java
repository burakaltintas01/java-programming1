package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("shoppingList.size() = " + shoppingList.size());
        System.out.println("shoppingList.isEmpty() = "+ shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("list is empty, keep ccoding java");
            shoppingList.add("shoes");
            shoppingList.add("cheap monitor");
            shoppingList.add("mask");
            shoppingList.add("wooden spoon");
            shoppingList.add("scooter");
            shoppingList.add("java book");
            shoppingList.add("tesla");

            if(shoppingList.isEmpty()) {
                System.out.println("list is empty, keep ccoding java");
            }else{
                System.out.println("list is not empty");
            }
            int count = shoppingList.size();
            System.out.println(count);

            System.out.println("is shoes in my list ? - " + shoppingList.contains("shoes"));
            shoppingList.clear();
            System.out.println("shoppingList = " + shoppingList);
        }
    }
}
