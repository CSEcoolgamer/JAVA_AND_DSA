package Strings;

import java.util.Arrays;

public class string_builder_methods {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i =0; i<26; i++){
            char ch = (char)('a' +i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
        
        builder.deleteCharAt(0);
        System.out.println(builder);
        
        builder.reverse();                    // to reverse the builder string
        System.out.println(builder);


        String name ="Sachin Nirate";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split("")));

    }
    
}
