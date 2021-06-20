package Loops;
import java.util.Scanner;

public class PowerNum {

    public static void main(String[] args) {
        
        int pow, num, total = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();
        System.out.println("Enter the pow :");
        pow = input.nextInt();

        for (int i = 0; i < pow; i++) {
            total *= num;
        }

        System.out.println(total);
    }
    
}
