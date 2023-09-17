package RECURSION;

public class recursion {
    public static void main(String[] args) {
        int ans = fib(20);
        System.out.println(ans);
    }

    static int fib(int n){
        // base condition 
        if (n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    
}
 