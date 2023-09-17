package Sorting;
import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertion(int[] arr){

        for(int i =0; i < arr.length-1; i++){
// j will be the next element of i , j=inner loop so need to compare with previous value, comparison decrease.
            for(int j = i+1; j > 0; j--){

                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }else{
                    break;
                }
            }
        }
    }

    
}
