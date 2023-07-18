package Linear_Search;

public class linear_search {
    public static void main(String[] args) {
        int[] nums = {13 , 73, 87, 8 , 4, 99, 19, 52};
        int target = 19;
        int ans = linearSearch(nums , target);
        System.out.println(ans);
    }


    // search in the array: return the index if found otherwise return -1.
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index=0 ; index < arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        
        // this line will execute when above line doesn't return anything.
        // target not found....
        return -1;
    }
    
}
