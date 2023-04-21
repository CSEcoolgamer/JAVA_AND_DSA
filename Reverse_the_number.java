import java.util.Scanner;

public class Reverse_the_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");

        int num = in.nextInt();
//        int num = 129203423;
        int ans=0;
        int rem=0;

        while(num>0){
            rem = num % 10 ;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println("THE REVERSE OF THE GIVEN NUMBER :");
        System.out.println(ans);
    }
}
