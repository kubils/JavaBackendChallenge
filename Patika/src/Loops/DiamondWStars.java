package Loops;

import java.util.Scanner;

public class DiamondWStars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i = n; i > 0; i--) {

            for (int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 3); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
