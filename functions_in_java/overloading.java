package functions_in_java;

public class overloading {
    public static void main(String[] args) {
        // SAME NAME BUT DIFFERENT ARGUMENTS OR TYPE OF ARGUMENTS MUST BE DIFFERENT. 

        fun("sachin_nirate");
        fun(12); 

        
    }
    
    static int sum(int b, int c){
        return b+c;
    }

    static void fun(int a ){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
    
}
