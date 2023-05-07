package functions_in_java;

public class overloading {
    public static void main(String[] args) {
        // SAME NAME BUT DIFFERENT ARGUMENTS OR TYPE OF ARGUMENTS MUST BE DIFFERENT. 

        fun("BHOR");
        fun(12);
//        int ans = sum(34,54);
        int ans = sum(12, 45, 67, 89);
        System.out.println(ans);

    }
    
    static int sum(int b, int c){
        return b+c;
    }

    static int sum(int b , int c, int d , int e){
        return b+c+d+e;
    }

    static void fun(int a ){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
    
}
