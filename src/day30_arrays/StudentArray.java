package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] Student = new String[5];
        Student[0] = "1234";
        Student[1] = "Burak";
        Student[2] = "Altintas";
        Student[3] = "6161";
        Student[4] = "832";
        System.out.println("Student ID is  " + Student[0]);
        System.out.println("Student name is " + Student[1]);

        String[] Student2 = {"1236", "Adam", "Smith", "61", "713"};
        System.out.println("Student2 ID is = " + Student2[0]);
        System.out.println("Student2 Name is = " + Student2[1]);
        System.out.println("Student2 PhoneNumber  = " + Student2[4]);
        System.out.println("***** LENGHT ****");
        System.out.println(Student2.length); // it shows how many characters are inside of the array
        if (Student.length > 3) {
            System.out.println("pass");
        } else {
            System.out.println("don't pass");

        }

        if (Student.length == Student2.length) {
            System.out.println("Same number of data");
        } else {
            System.out.println("data arrays lenght mismatch");
        }
    }
}
