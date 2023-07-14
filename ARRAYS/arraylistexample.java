import java.util.ArrayList;
import java.util.Scanner;

public class arraylistexample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // list.add(83);
        // list.add(27);        
        // list.add(69);
        // list.add(733);
        // list.add(441);

        // System.out.println(list + " ");

        // list.remove(3);
        // System.out.println("After removing the list will be: " + list);

        // input
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        // get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));    // pass index here , list[index] syntax will not work here
        }

        System.out.println(list);


        
        
        
    }
    
}
