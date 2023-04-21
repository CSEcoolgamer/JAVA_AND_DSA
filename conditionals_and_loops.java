
import java.util.Scanner;

public class conditionals_and_loops {
    public static void main(String[] args) {
        System.out.println("conditionals");

        /*

        // IF - else

        int salary = 2002;
        if (salary> 1000){
            salary = salary+ 200;
        }else{
            salary = salary + 50;
        }
        System.out.println(salary);

        */



        /*

        //multiple if - else
        int salary = 5000;
        if(salary> 3000){
            salary = salary + 1000;
        } else if (salary>2000) {
            salary = salary +500;
        }else {
            salary = salary + 50;
        }

        System.out.println("The final salary is :" + salary);

        */




        // Loops

        /*
        // FOR loop - print the numbers from 1 to n

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int n = in.nextInt();
        for(int num=1; num<=n; num++){
            System.out.println(num + " ");
        }

        */

/*

        // WHILE loop
        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num +=1;
        }
 */


        /*

        // Do-WHILE loop
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while(n <= 5);


        */





        /*

        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers you want to compare :");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // FIND THE LARGEST OF THE 3 NUMBERS:
        int max = a;
        if (b>max){
            max  = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println("The max number is :" + max);


         */




        // COMPARE 3 NUMBERS , RETURNS THE MAX. ONE
        /*
        int max = 0;
        if (a>b){
            max = a;
        }else{
            max = b;
        }
        if(c>max){
            max = c;
        }

         */


//      using Math function -
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers you want to compare :");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
        

    }

}






