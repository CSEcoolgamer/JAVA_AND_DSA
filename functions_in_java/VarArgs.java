// variable length arguments >>
package functions_in_java;

import java.util.Arrays;

public class VarArgs{
    public static void main(String[] args) {
        fun(1,2,8, 56, 65, 98);
        fun();
        multiple(2, 3, "vivek" , "sushant" ,"rohit");
        
    }

    static void multiple(int a , int b, String ...v){
        // variable length argument should always comes at end **** //
        System.out.println(Arrays.toString(v));


        
    }

    static void fun(int ...v){
        // (type ...(name)) - if you don't know the number of arguments.
        System.out.println(Arrays.toString(v));
    }
}