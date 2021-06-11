package day42_custom_classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);

        Animal animal1 = new Animal();
        animal.eat();

        Animal.tea();
        animal.eat1("beef");

        Animal cheetahObj = new Animal();
        cheetahObj.type= "cheetah";
        System.out.println(cheetahObj.type);

        cheetahObj.eat1("kebap");


    }


}
