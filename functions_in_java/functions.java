package functions_in_java;
import java.util.Scanner;
public class functions{
    public static void main(String[] args) {

/*

    Scanner in = new Scanner(System.in);

    System.out.print("The first number is :");
    int num1 = in.nextInt();

    System.out.print("The first number is :");
    int num2 = in.nextInt();

    int sum = num1 + num2;
    System.out.println("Sum:" +sum);

*/

        // sum();

//      To print the message:
        String message = greet();
        System.out.println("THE MESSAGE IS: " + message);

//       To print sum3:
        int ans = sum3( 45 , 80);
        System.out.println("The sum of 2 numbers are: " +ans);

//       To print myGreet() which contains values:
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalized = myGreet(naam);
        System.out.println("The message is: " + personalized);
    
    }


/*
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("The first number is :");
        int num1 = in.nextInt();

        System.out.print("The first number is :");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum:" +sum);

    }

*/


    static String greet(){
        String greeting = "How are you ?" ;
        return greeting;
    }


    static int sum3(int a , int b){
        int sum = a+b;
        return sum;
    }


    static String myGreet(String name){
        String message ="Hello! " + name;
        return message;

    }


}
