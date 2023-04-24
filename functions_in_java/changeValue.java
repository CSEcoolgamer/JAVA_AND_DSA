package functions_in_java;

import java.util.Arrays;

public class changeValue{
    public static void main(String[] args){

        // creating an array
        int[] arr = {1 , 2 , 3, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
        
    }

}