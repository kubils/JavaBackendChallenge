package Loops;
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        
        int  num, temp, digitNum = 0, sum = 0;

        int digit = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();
        
        temp = num;
        
        while (temp != 0) {
            //1254
            temp /= 10;
            digitNum++;
        }

        temp = num;

        while (temp != 0) {
            
            digit = temp % 10;

            int dPow = 1;
            for (int i = 1; i <= digitNum; i++) {
                
                dPow *= digit;
            }

            sum += dPow;
            
            temp /= 10;
        }
    
        if (sum == num) {
            System.out.println(num + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(num + " sayısı bir Armstrong sayısı değildir.");
        }
    
    }
    
}
