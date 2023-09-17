package Sorting;
import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {-13 , 0, 7, -65, 42};
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {5, 4, 3, 2, 1};
        bubble (arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            // j loop will start from 1st index.   
            // for each ith pass , the last item will got fixed(i.e; j got fixed) therefore , j will run(length-i) 
            for(int j=1; j < arr.length - i; j++){  
               // swap if the item is smaller than the previous item
                if ( arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }       
            // if u don't swapped for a particular value that means array is sorted , hence stop the program.
            if(!swapped){      //!false = true
                break;
            }
        }
    }
    
}
