package Linear_Search;

public class search_in_range {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};

        // we have to find the targeted element in the specific range 
        /*
            here in this question we have to find 14 in the given array
            the range is given as {1,4}
         */

        int target = 14;
        System.out.println(linear_Search(arr, target, 1, 4)); 
    }

    static int linear_Search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index=start; index <= end; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        return -1;

    }
    
}
