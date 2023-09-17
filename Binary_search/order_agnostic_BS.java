package Binary_search;

public class order_agnostic_BS {
    public static void main(String[] args) {
        int[] arr = { 99 , 84, 62, 50, 14, 5, 1, -18};
        // int[] arr = {-18 , -9 , 2, 4, 6, 8, 14, 19, 35, 85};
        int target = 14;
        int ans = orderAgnostic(arr , target);
        System.out.println("The index of the element that you are looking is:" + ans);
    }

    static int orderAgnostic(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;

        // find the whether the array is sorted in ascending or descending 
        boolean isASC = arr[end] > arr[start];

        while(start <= end){

            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isASC){
                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }
        return -1;
    }
    
}
