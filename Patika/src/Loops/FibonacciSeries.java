package Loops;
import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        int pre = 0, num, fib = 1;
        int  temp = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();
        System.out.print(pre + " ");
        
        while(num > 0) {

            System.out.print(fib + " ");

            temp = pre + fib;
            pre = fib;
            fib = temp;
            num--;
        }
    }
    
}
