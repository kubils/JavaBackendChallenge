package Loops;
import java.util.Scanner;

public class PerfectNum {

    public static void main(String[] args) {
        
        int  num, temp = 1, ob = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();
        
        int k = num-1;
        while (k >= temp) {
            if (num % k == 0) {
                ob += k;
            }
            k--;

        }

        if (ob == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }

    }
    
}
