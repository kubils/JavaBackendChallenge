package Loops;

import java.util.Scanner;

public class TwoNumberNPow {

    public static void main(String[] args) {
        
        int sum = 0, num;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();

        System.out.println("Power of four to given number: " + num);
        for (int i = 4; i <= num; i*=4) {
            System.out.print(i + " ");
        }
        System.out.println("\nPower of five to given number: " + num);
        
        for (int j = 5; j <= num; j*=5) {
            System.out.print(j + " ");
        }
    }
}
