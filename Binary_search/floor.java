package Binary_search;

public class floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index of greatest number <= target;
    static int floor(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2 ;

            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }

        }

        return end;      // only change in binary search is this [RETURN END] when while loop violated.
    }
    
}
