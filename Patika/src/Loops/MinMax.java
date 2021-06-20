package Loops;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        
        int  n, temp, max = 0, min = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the N number  :");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number : " + (i + 1));
            temp = input.nextInt();


            if (temp > max) {
                max = temp;
            }

            if (temp < min) { min = temp; }
        }
        
        System.out.println("Max number is : " + max + " Min number is : " + min);
    }
    
}
