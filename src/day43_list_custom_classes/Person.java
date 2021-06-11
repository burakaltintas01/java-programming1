package day43_list_custom_classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Person {
    String firstName;
        int age;
        char gender;

        public void Speak(){
            System.out.println("Person is speaking");

        }
    }
    class People {
    public static void main(String [] args){
        Person person1 = new Person(); //Create object of Person class - Instantiate Person Class
        person1.firstName = "Bob";
        person1.age = 18;
        person1.gender = 'm';
        person1.Speak();
        System.out.println(person1.firstName);
        System.out.println(person1.age);

        Person person2 = new Person();
        person2.firstName = "Burak";
        person2.age = 26;
        person2.gender = 'M';
        person2.Speak();
        System.out.println("name = "+person2.firstName);
        System.out.println("age = " + person2.age);

        System.out.println("gender = " + person2.gender);





    }
    }

