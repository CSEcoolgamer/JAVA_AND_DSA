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
        String message = greet();
        System.out.println("THE MESSAGE IS: " + message);
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
}