package Strings;
public class string_performance {
    public static void main(String[] args) {

        String series = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            series += ch;
        }
        
        System.out.println(series);
        
    }
    
}
 