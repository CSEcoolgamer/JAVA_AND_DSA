import java.util.Scanner;
public class Fibonacci_number{
    public static void main(String[] args) {
        System.out.println("FIBONACCI NUMBER :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int previous = 0;
        int next = 1;
        int count = 2;

        while(count<= n){
            int temp = next;
            next = next + previous;
            previous = temp;
            count ++;

        }

        System.out.println(next);
//      Through this program we can find any specific fibonacci value ........

    }
}
