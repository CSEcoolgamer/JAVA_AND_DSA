package functions_in_java;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
 


        
        // swap numbers code
        /* 
        int temp = a;
        a = b;
        b = temp; 
        */

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Sachin Nirate";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Nitesh Rana"; // creating a new object                --> As strings are immutuable.
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
    }
}