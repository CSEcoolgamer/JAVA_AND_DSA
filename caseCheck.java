import java.util.Scanner;
public class caseCheck {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character that you want to check :");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }



        /*

        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);

         */
    }
}
