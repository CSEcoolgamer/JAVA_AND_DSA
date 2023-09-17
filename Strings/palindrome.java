package Strings;

public class palindrome {
    public static void main(String[] args) {
        String str = "abcdecba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }

        str = str.toLowerCase();
        for(int i=0; i <= str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1 -i);    
        // end = end_index - i ... we're using 2 pointers 's' and 'e' , as both matches is palindrome other not.

            if(start!= end){
                return false;
            }
        }

        return true;
    }
    
}
