package Loops;

import java.util.Scanner;

/**
 * C(n,r) = n! / (r! * (n-r)!)
 */
public class Combination {

    public static void main(String[] args) {
        int num = 1, n, r;
        int total1 = 1, total2 = 1, total3 = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number n:");
      
        n = input.nextInt();

        System.out.println("Enter the number r:");
      
        r = input.nextInt();

       
        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }

        for (int i = 1; i <= r; i++) {
            total2 *= i;

        }     
        for (int i = 1; i <= n-r; i++) {
            total3 *= i;
        }

        int com = total1 / (total2 * total3);
        System.out.println("Combination is : " + com);
    }
    
}
