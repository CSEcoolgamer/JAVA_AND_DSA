import java.util.Arrays;

public class swapandreverse {
    public static void main(String[] args) {
        int[] arr = {1 , 23, 56, 82, 6};        
        
        // swap(arr , 0 , 4);

        reverse(arr);
        System.out.println("The array is :" + Arrays.toString(arr));
        
    }

    // SWAPING :
    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    // reversing an array 
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            // swap
            swap(arr , start , end);
            start++;
            end--;
        }
    }
    
}
