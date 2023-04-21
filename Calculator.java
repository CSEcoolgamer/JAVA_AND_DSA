import java.sql.SQLOutput;
import java.util.Scanner;
  class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Take input from user till user doesn't press X or x
        int ans = 0;
        while(true){
//            take the operator as input
            System.out.println(" ENTER THE OPERATION :");
            char op = in.next().trim().charAt(0);
            if(op =='+' || op =='-' || op =='*' || op == '/' || op == '%'){
                System.out.println("ENTER TWO NUMBERS :");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }

            } else if (op =='x' || op=='X') {
                break;
            }else{
                System.out.println("INVALID OPERATION !!");
            }

            System.out.println(ans);
        }



    }
}
