package Sorting;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4};
        quickSort(arr, 0, arr.length-1); 
        System.out.println(Arrays.toString(arr));
        
    }

    static void quickSort(int[] nums, int low, int high){
        if(low == high){
            return;
        }

        int s=low;
        int e=high;
        int m = s + (e-s)/2;
        int pivot = nums[m];

        while(s<=e){

            // like in merge sort if the array is already sorted it will still swap 
            // that's the reason why if its already sorted it will [not swap]
            
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s<=e){
                // swap
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;

            }
        }

        // now my pivot is at right position , so sort two halves now - 
        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
    
}
