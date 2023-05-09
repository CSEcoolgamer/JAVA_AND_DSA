package functions_in_java;

import java.util.Scanner;

public class questionPrimenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
//        m-1
//        if(c*c>n){
//            return true;
//        }
//        return false;


//        shortcut M-2
        return c*c>n;
    }
}
