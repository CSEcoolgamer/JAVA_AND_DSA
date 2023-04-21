import java.util.Scanner;
public class Count_occur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" count the number of occurance of a digit in given number :");

        int n = in.nextInt();
        System.out.println(" Enter the number you want to count on :");

        int i = in.nextInt();

//        int n = 13949606;
        int count = 0;
        while( n>0 ){
            int rem = n % 10;
            if (rem == i){
                count ++;
            }
            n = n / 10;
        }
        System.out.println(count);


    }
}
