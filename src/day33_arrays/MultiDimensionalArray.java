package day33_arrays;
import java.util.*;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        String [][] users = new String[3][2];
        users[0][0] ="Teodora Tsvetanov";
        users[0][1] =  "TeodorasPWD12";
        users[1][0] = "Anna Ziyayeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinVienna321";

        String[] [] userDate = { {"Teodora Tsvetanov","TeodorasPWD12"},
                                  { "Anna Ziyayeva","AnnaAlmaty123"} ,
                                { "Parvin Altae","ParvinVienna321"}};
        System.out.println(userDate[0][0]);
        System.out.println(userDate[1][0]);
        System.out.println(userDate[2][0]);

        System.out.println("*******Passwords****");
        System.out.println(userDate[0][1]);
        System.out.println(userDate[1][1]);
        System.out.println(userDate[2][1]);
        System.out.println(Arrays.deepToString(userDate));


    }
}
