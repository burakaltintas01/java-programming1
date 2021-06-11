package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        
        List<Integer>nums = Arrays.asList(10,4,5,3);
        int [] array = {23,54,23,454,23};
        
        //Arrays.asList(array) => this converts array to Array list

        /*List<Integer> num  = Arrays.asList(10,4,5,3);
        System.out.println("num = " + num);
        num.add(100);
        System.out.println("num = " + num);*/

        List<String>drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea","monster","redbull","pepsi",
                "mdew","kambucha","celcius"));

        int caffeineAmmount =0;
        System.out.println(drinksWithCaffeine);
            for(int i = 0 ; i<drinksWithCaffeine.size();i++) {
                if (drinksWithCaffeine.get(i).equals("monster") ||
                        drinksWithCaffeine.get(i).equals("redbull") || drinksWithCaffeine.get(i).equals("celcius")) {
                caffeineAmmount = 150;
                System.out.println(drinksWithCaffeine.get(i) + "= " + caffeineAmmount);
            }else if(drinksWithCaffeine.get(i).equals("tea")|| drinksWithCaffeine.get(i).equals("mdew")||drinksWithCaffeine.get(i).equals("kambulca")) {
                    caffeineAmmount = 250;
                    System.out.println(drinksWithCaffeine.get(i) + "== " + caffeineAmmount);
                }else if(drinksWithCaffeine.get(i).equals("coffee") || drinksWithCaffeine.get(i).equals("pepsi")){
                    caffeineAmmount=350;
                    System.out.println(drinksWithCaffeine.get(i) +"== " + caffeineAmmount);
                    System.out.println("========");
                }
            }
        System.out.println("----------------");
            for(String drink : drinksWithCaffeine){
                switch (drink){
                    case "monster" :
                    case "redbull" :
                    case "celcius" :
                        caffeineAmmount =150;
                        break;
                    case "tea" :
                    case "mdew" :
                    case "kambucha" :
                        caffeineAmmount =250;
                        break;
                    case"coffee":
                    case "pepsi":
                        caffeineAmmount =350;
                    break;
                }
                System.out.println(drink + "=" + caffeineAmmount);
            }

    }

    }
