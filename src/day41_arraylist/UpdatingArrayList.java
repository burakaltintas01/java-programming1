package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String>myCars = new ArrayList<>();
        myCars.add("toyoya");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");


        System.out.println(myCars.toString()); //prints all cars
        String allCarsIn1St = myCars.toString(); //saves all cars in 1 string variable

        System.out.println("allCarsIn1St = " + allCarsIn1St);
        myCars.set(0,"lamborghini"); // changing index with an element
        System.out.println("after set = "+myCars);
        myCars.set(4,"peugeot");
        System.out.println("2nd set = " + myCars);
        System.out.println("myCars.indexOf(ford) = " + myCars.indexOf("ford"));

        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        myCars.set(6, "ferrari");
        System.out.println("after updated = " + myCars);

        int ind = myCars.indexOf("ford");
        myCars.set(ind,"trabant");
        System.out.println("latest list = " + myCars);

        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"),"bugatti");
            }
        System.out.println("myCars = " + myCars);

      //  myCars.set(0,"prius");
       // myCars.set(1,"lexus");
        //myCars.set(5,"audi");
        for(int i = 0 ; i<myCars.size();i++){
            if(myCars.get(i).equals("lamborghini")) {
                myCars.set(0, "prius");
            }else if(myCars.get(i).equals("yugo")) {
                myCars.set(2, "lexus");
            }else if(myCars.get(i).equals("trabant")){
                myCars.set(5,"audi");
            }
        }
        System.out.println("new list with the loop = "+myCars);
    }
}