package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String>Cities = new ArrayList<>();
        Cities.add("washington dc");
        Cities.add("Trabzon");
        Cities.add("Vienna");
        Cities.add("LA");

        Cities.add(0,"Istanbul");
        System.out.println(Cities);
        System.out.println("First city = "  + Cities.get(0));
        System.out.println("Last city = " + Cities.get(Cities.size()-1));

        for (int i = 0; i < Cities.size(); i++) {
            System.out.print(Cities.get(i) + ",");
            
        }
        System.out.println();

        for (String city:Cities) {
            System.out.print(city+" ");

        }
        System.out.println();
        //delete item from arraylist
        //1) remove using index. delete value at index 3
        Cities.remove(3);
        //2) remove using object/value
        Cities.remove("Vienna");

        System.out.println("after remove = " + Cities);

        //delete/remove all values from list
        Cities.clear();

        //make sure it is clear
        //1) print|spit it out
        System.out.println("cities = " + Cities);

        //2) using isEmpty
        if (Cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //3) check size() == 0
        if(Cities.size() == 0) {
            System.out.println("list is empty");
        }


    }
}
