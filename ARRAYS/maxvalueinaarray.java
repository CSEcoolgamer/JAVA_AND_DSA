import java.util.Arrays;
public class maxvalueinaarray {
    public static void main(String[] args) {
        int[] arr = {1 , 3, 23, 31 ,8};
        System.out.println("The array is :" + Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1 , 2));
    }

    static int max(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int maxVal = arr[0];
        for(int i =0; i<arr.length; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;

    }


    // max in a given specific range : 

    static int maxRange(int[] arr , int start , int end){

        if (end>start){
            return -1;
        }

        if (arr==null){
            return -1;
        }

        int maxVal= arr[start] ;
        for(int i=start; i<=end; i++){
            if ( arr[i] > maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
    
}
