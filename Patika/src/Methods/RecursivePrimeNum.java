package Methods;
import java.util.Scanner;

public class RecursivePrimeNum {

    
    static boolean isPrime(int num, int i) {
         
        if (i == 1) {
            return true;
        } else {
            if (num % i == 0) {
                return false;
            }
            else {
                return isPrime(num, i-1);
            }

        }


    }

    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();

        if(isPrime(num, num / 2)){
            System.out.println(num + " number is  PRIME!");
        } else {
            System.out.println(num + " number is NOT PRIME!");
        }
    }

    
}
