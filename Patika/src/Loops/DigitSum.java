package Loops;
import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        
        int  num, sum = 0;

        int digit = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();
        

        while (num != 0) {
            digit = num % 10;

            sum += digit;
            
            num /= 10;
        }


        System.out.println("Number digit sum is : " + sum);
    }
    
}
