package day32_arrays_split;

import java.util.Arrays;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catTypes = "bengal cat tabby cat persian cat no cat here";
        /*int count = 0;
        for(int i = 0 ; i<cats.length() ; i++){
            if(cats.substring(i,i+3).equals("cats")){
                count++;
            }
        }
        System.out.println("count of cat = " + count);*/
        String [] catsArray = catTypes.split("cat");
        System.out.println("number of cats = " + (catsArray.length-1));
    }
}
