package Methods;
import java.util.Scanner;

public class RecursiveFibonacci {

    static int fibonacciSeries(int num) {

        if (num == 1 || num == 2) {
            return 1;
        } else {return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);}
    } 
    public static void main(String[] args) {
        
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();

        System.out.println("Fibonacci fib(" + num + ") is a : " + fibonacciSeries(num));
    }
    
}
