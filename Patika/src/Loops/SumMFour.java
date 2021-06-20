
package Loops;

import java.util.Scanner;

/**
 * SumMFour
 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
 */
public class SumMFour {

    public static void main(String[] args) {
        int sum = 0, num;

        Scanner input = new Scanner(System.in);
        
        do {
            num = input.nextInt();
    
            if (num % 4 == 0) {
                sum += num;
            }
        } while (num % 2 != 1);    


        System.out.println("Sum is " + sum);
    }

}