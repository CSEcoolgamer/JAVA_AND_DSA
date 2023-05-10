package functions_in_java;

import java.util.Scanner;

public class questionArmstrongnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        // M-1
        // boolean ans = isArmstrong(n);
        // System.out.println(ans);
        
        // M-2
        System.out.println(isArmstrong(n));

        // 3-digit Armstrong Number ...
        for (int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        } 

           
    }

    // checking which number is armstrong ..
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
    
}
