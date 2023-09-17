package Sorting;
import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {  
        // check swap move
        int[] arr={3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr){
        int i =0;
        while(i < arr.length){
            // check. =>   index = value -1
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                // value of ith index not equal to correct one , then only swap
                swap(arr, i , correct);
            } else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int i , int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;

    }
    
}
