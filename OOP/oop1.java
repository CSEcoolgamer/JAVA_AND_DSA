package OOP;

import java.util.Arrays;

public class oop1 {
    public static void main(String[] args) {
        // store 5 roll no
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // provide data for 5 students:(rollno, name , marks)
        /*
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
         */

        // this is okay but -  store it in one array - using class we can do it.

        // Student[] students = new Student[5];

        /*
        Student sachin;
        System.out.println(Arrays.toString(students));    
        NULL value --- as it is not initialize.
         */

        Student sachin = new Student();

        System.out.println(sachin.rno);
        System.out.println(sachin.name);
        System.out.println(sachin.marks);

    }
}

// let's create a class - 
class Student{
    int rno;
    String name;
    float marks;
}
