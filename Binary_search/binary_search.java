package Binary_search;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {-18 , -9 , 2, 4, 6, 8, 14, 19, 35, 85};
        // here we assume that array is in ascending order.
        int target = 14;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            // find the middle element
            // int mid=(start + end) / 2;         can't use this as s+e might exceed the int range
            int mid = start + (end-start)/2 ;

            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }

        }

        return -1;
    }
    
}
