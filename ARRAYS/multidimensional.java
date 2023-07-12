import java.util.Scanner;
import java.util.Arrays;

public class multidimensional {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        */
        
        Scanner IN = new Scanner(System.in);
        // int[][] arr = new int[3][];

/* 
        int[][] arr2D = {
            {1 , 2, 3},   // 0th index
            {4, 5, 6},     // 1st index
            {7, 8, 9}      // 2nd index 
        };

*/
/* 
        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
*/

        int[][] arr = new int[3][3];
        System.out.println(arr.length);  // no. of rows
        System.out.println("Input are :");

        // input
        for (int row=0; row < arr.length; row++){
            // for each col in every row
            for (int col=0; col < arr[row].length; col++){
                arr[row][col] = IN.nextInt();
            }    
        }
        
        // output
        System.out.println("The matrix is :");
        for (int row=0; row < arr.length; row++){
            /*  TYPE 1
            for (int col=0; col < arr[row].length; col++){
                System.out.print(+ arr[row][col] + "");
            }
            */

            System.out.print(Arrays.toString(arr [row]));

            System.out.println();

        }


    }
    
}
