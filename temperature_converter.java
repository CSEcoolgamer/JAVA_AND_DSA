import java.util.Scanner;

public class temperature_converter{
    public static void main(String[] args){
        
        System.out.println("sachin here!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in celcius : ");

        float tempc = input.nextFloat();

        float tempf = ((tempc)*(9/5)) + 32;
        System.out.println(tempf);
    }
}